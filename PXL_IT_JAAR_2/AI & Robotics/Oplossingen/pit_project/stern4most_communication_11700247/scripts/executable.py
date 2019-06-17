import rospy
import logging
import time
from std_msgs.msg import String


class Communicator:
    def __init__(self):
        self.subscriber_rankings = rospy.Subscriber("rankings", String, self.display_rankings)
        self.subscriber_game_on = rospy.Subscriber("game_on", String, self.game_on)
        self.publisherPilot = rospy.Publisher("stern4most_start_game_11700247", String, queue_size=1)

        time.sleep(5)
        self.game_on(String("Start"))

        print "Waiting on sector update service..."
        rospy.wait_for_service('SectorUpdate')
        print "Ready!"
        #sector_update = rospy.ServiceProxy("SectorUpdate", SectorUpdate)
        #sectorupdate = sector_update()

        rospy.spin()

    def game_on(self, data):
        if data.data == "Start":
            try:
                self.publisherPilot.publish(data)
            except Exception:
                print "exc!"
            print "Sent start!"

    def display_rankings(self, data):
        id = 5


if __name__ == '__main__':
    rospy.init_node("stern4most_communication_11700247")
    comm = Communicator()
