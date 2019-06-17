import rospy
import logging
import datetime
from geometry_msgs.msg import Twist
from std_msgs.msg import String


class Actions:
    publisher = None

    def __init__(self):
        logging.basicConfig(filename='../runs/run_' + str(datetime.datetime.now().time()) + '.runlog', level=logging.INFO)
        logging.info('Initialized logging')
        try:
            # TODO -> BATTLE CHANGE THIS TOPIC NAME BELOW
            self.publisher = rospy.Publisher('/player_one/cmd_vel', Twist, queue_size=1)
            rospy.Subscriber("stern4most_pilot_11700247", String, self.handle_action)
            print "Ready and waiting..."
            rospy.spin()

        except rospy.ROSInterruptException:
            print "An interrupt occurred."

    def handle_action(self, data):
        data_array = data.data.split(";")
        vel_msg = Twist()
        vel_msg.linear.x = float(data_array[0])
        vel_msg.angular.z = float(data_array[1])
        rospy.loginfo("Sending: " + str(vel_msg))
        self.publisher.publish(vel_msg)
        rospy.loginfo("Sent\n")


if __name__ == '__main__':
    rospy.init_node('stern4most_pilot_11700247')
    actionsClass = Actions()
