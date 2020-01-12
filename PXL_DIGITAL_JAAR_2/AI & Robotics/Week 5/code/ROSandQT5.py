import sys
import os

from PyQt5.QtWidgets import QWidget, QPushButton, QLabel, QApplication

import rospy
from std_msgs.msg import String


class GUI(QWidget):

    def __init__(self):
        super(GUI, self).__init__()

        self.counter = 0
        topic_name = "test_topic"

        subscriber_name = "test_subscriber_" + str(os.getpid())
        self.publisher_name = "test_publisher_" + str(os.getpid())

        rospy.init_node(subscriber_name, anonymous=False)

        self.subscriber = rospy.Subscriber(topic_name, String, self.string_message_received)
        self.publisher = rospy.Publisher(topic_name, String, queue_size=1)

        self.label = None
        self.init_ui()

    def init_ui(self):
        button = QPushButton('Send String', self)
        button.clicked.connect(self.button_clicked)
        button.resize(button.sizeHint())
        button.move(10, 50)

        self.label = QLabel("Message", self)
        self.label.move(10, 100)

        self.setGeometry(300, 300, 250, 150)
        self.setWindowTitle('ROS and QT5')
        self.show()

    def button_clicked(self):
        self.counter += 1
        data = self.publisher_name + ":data:" + str(self.counter)
        rospy.loginfo("Sending: " + data)
        self.publisher.publish(data)
        rospy.loginfo("Sent\n")

    def string_message_received(self, data):
        rospy.loginfo("Receiving data: " + data.data)
        self.label.setText(data.data)
        self.label.resize(self.label.sizeHint())
        rospy.loginfo("GUI updated\n")



if __name__ == '__main__':
    application = QApplication(sys.argv)
    gui = GUI()
    sys.exit(application.exec_())
