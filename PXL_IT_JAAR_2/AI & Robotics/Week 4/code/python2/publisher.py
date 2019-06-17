#!/usr/bin/env python
import os
import rospy
from std_msgs.msg import String

if __name__ == '__main__':
    publisherName = "test_publisher_" + str(os.getpid())
    topicName     = "test_topic"

    try:
        rospy.init_node(publisherName, anonymous=False)
        publisher = rospy.Publisher(topicName, String, queue_size=1)

        counter = 0
        while True:
            rawInput = raw_input("Ready to send a data message . . . <ENTER>\n")

            counter += 1
            data = publisherName + ":data:" + str(counter)
            rospy.loginfo("Sending: " + data)
            publisher.publish(data)
            rospy.loginfo("Sent\n")

    except rospy.ROSInterruptException:
        print "An interrupt occurred."
