#!/usr/bin/env python

import os
import rospy
from std_msgs.msg import String

def callbackFunction(data):
    rospy.loginfo(data.data)

if __name__ == '__main__':
    subscriberName = "test_subscriber_" + str(os.getpid())
    topicName     = "test_topic"

    rospy.init_node(subscriberName, anonymous=False)

    subscriber = rospy.Subscriber(topicName, String, callbackFunction)

    rospy.spin()
