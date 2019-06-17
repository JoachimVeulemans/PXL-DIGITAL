#!/usr/bin/env python 

import rospy 
import sys
import os
import operator
import optparse
from referee_service.srv import * 
from threading import Thread
from threading import Lock
from std_msgs.msg import String
from playerTime import PlayerTime
from enum import Enum

lock = Lock()
playerTimes = dict()
startTime = 0
rounds = 0
sectors = 0

class Status(Enum):
    IN_PROGRESS = 1
    WRONG_SECTOR = 2
    FINISHED = 3

# set start time to GO
def startCallback(data):
    rospy.loginfo(data.data)
    if data.data == 'Start':
        global startTime
        startTime = rospy.get_rostime().to_sec()
        rospy.loginfo('Start time: ' + str(startTime))

def updatePlayerTimes(name, sector):
    status = Status.IN_PROGRESS

    with lock:
        # update existing player
        if name in playerTimes:
            playerTime = playerTimes[name]

            if not playerTime.update(sector, startTime):
                rospy.loginfo("%s WRONG SECTOR" % (name))
                status = Status.WRONG_SECTOR

            if sector == sectors and playerTime.currentRound == rounds:
                rospy.loginfo("%s FINISHED" % (name))
                status = Status.FINISHED
            elif sector == sectors:
                playerTime.currentRound += 1
                playerTime.currentSector = 0
                rospy.loginfo("%s entered round %d" % (name, playerTime.currentRound))
            
            currentRound = playerTime.currentRound

        # add new player (no sector info sent yet)
        else: 
            if not sector == 1:
                rospy.loginfo("%s WRONG SECTOR" % (name))
                sector = 0
                status = Status.WRONG_SECTOR
                totalTime = 0
            else:
                now = rospy.get_rostime().to_sec() 
                totalTime = now - startTime
            
            currentRound = 1
            playerTimes[name] = PlayerTime(currentRound, sector, totalTime, totalTime)

    if status == Status.IN_PROGRESS:
        return 'Round: ' + str(currentRound) + ' - Sector: ' + str(sector)
    else:
        return status.name

def handle_status_update(req): 
    rospy.loginfo("Received: %s from %s" % (req.sector, req.name))

    status = updatePlayerTimes(req.name, int(req.sector))

    playerTime = playerTimes[req.name]

    rospy.loginfo("Returning (%f, %f, %s)" % (playerTime.totalTime, playerTime.lastSectorTime, status)) 
    return SectorUpdateResponse(playerTime.totalTime, playerTime.lastSectorTime, status)  

def status_update_server(): 
    topicName = "game_on"
    
    subscriber = rospy.Subscriber(topicName, String, startCallback)
    s = rospy.Service('status_update', SectorUpdate, handle_status_update) 

    rospy.loginfo("Status Update Server Ready")

    rospy.spin()

def comp(first, second):
    first = first[1]
    second = second[1]
    if first.currentRound == second.currentRound:
        if first.currentSector == second.currentSector:
            if first.totalTime < second.totalTime:
                return -1
            else:
                return 1
        else:
            if first.currentSector > second.currentSector:
                return -1
            else:
                return 1
    else:
        if first.currentRound > second.currentRound:
            return -1
        else:
            return 1;

# rank publisher
def publish_rank():
    publisherName = "ranking_" + str(os.getpid())
    topicName     = "ranking"

    try:       
        publisher = rospy.Publisher(topicName, String, queue_size=1) 

        rate = rospy.Rate(0.1)
        while not rospy.is_shutdown():
            if(len(playerTimes) > 0):
                # sort playerTimes on the totalTime for each player
                with lock:
                    rankings = sorted(playerTimes.items(), cmp=comp)

                # send the list of sorted tuples (playerName, (totalTime, lastSectorTime, currentRound))
                rospy.loginfo("Rank Publisher Sending: " + str(rankings))
                publisher.publish(str(rankings))
                rospy.loginfo("Sent") 

            rate.sleep()

    except rospy.ROSInterruptException:
        rospy.logerr("An interrupt occurred.")

def parseArguments():  
    parser = optparse.OptionParser()

    parser.add_option('-r', '--rounds',
        action="store", dest="rounds",
        help="number of rounds", default="2")
    parser.add_option('-s', '--sectors',
        action="store", dest="sectors",
        help="number of sectors", default="5")

    options, args = parser.parse_args()

    global rounds, sectors
    rounds = int(options.rounds)
    sectors = int(options.sectors)

    print("Rounds: " + str(rounds))
    print("Sectors: " + str(sectors))

if __name__ == "__main__": 
    parseArguments()

    rospy.init_node('status_update_server') 

    # separate thread for the rankings publisher
    try:
        thread = Thread(target=publish_rank, args=())
        thread.start()
    except:
        rospy.logerr("Error: unable to start thread")

    # start status update server
    status_update_server()
