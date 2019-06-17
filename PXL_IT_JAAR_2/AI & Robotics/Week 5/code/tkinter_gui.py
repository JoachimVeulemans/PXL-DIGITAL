from Tkinter import Tk, Label, Button, StringVar
import os
import rospy
from std_msgs.msg import String


class GUI:
    def __init__(self, master):
        self.master = master

        self.counter = 0
        topic_name = "test_topic"

        subscriber_name = "test_subscriber_" + str(os.getpid())
        self.publisher_name = "test_publisher_" + str(os.getpid())

        rospy.init_node(subscriber_name, anonymous=False)

        self.subscriber = rospy.Subscriber(topic_name, String, self.string_message_received)
        self.publisher = rospy.Publisher(topic_name, String, queue_size=1)

        master.title("A simple Tkinter")

        self.text = StringVar()
        self.text.set("This is our first Tkinter GUI!")
        self.label = Label(master, textvariable=self.text)
        self.label.pack()

        self.greet_button = Button(master, text="Send", command=self.button_clicked)
        self.greet_button.pack()

        self.close_button = Button(master, text="Close", command=master.quit)
        self.close_button.pack()

    def button_clicked(self):
        self.counter += 1
        data = self.publisher_name + ":data:" + str(self.counter)
        rospy.loginfo("Sending: " + data)
        self.publisher.publish(data)
        rospy.loginfo("Sent\n")

    def string_message_received(self, data):
        rospy.loginfo("Receiving data: " + data.data)
        self.text.set(data.data)
        rospy.loginfo("GUI updated\n")


root = Tk()
my_gui = GUI(root)
root.mainloop()