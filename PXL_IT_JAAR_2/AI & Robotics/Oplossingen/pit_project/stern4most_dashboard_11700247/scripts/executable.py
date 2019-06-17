import logging
import rospy
import sys
import time
from PyQt5.QtWidgets import QApplication, QMainWindow, QTreeWidgetItem
from main import Ui_RosControllerRP1819G01
from std_msgs.msg import String

# pyuic5 main.ui > executable.py


class Window(QMainWindow, Ui_RosControllerRP1819G01):
    def __init__(self, parent=None):
        super(Window, self).__init__(parent)
        self.setupUi(self)

        self.publisher = rospy.Publisher('stern4most_pilot_11700247', String, queue_size=1)

        self.pushButton_FW.clicked.connect(self.forward)
        self.pushButton_BW.clicked.connect(self.backward)
        self.pushButton_LEFT.clicked.connect(self.left)
        self.pushButton_RIGHT.clicked.connect(self.right)
        self.pushButton_STOP.clicked.connect(self.stop)

    def send_movement(self, speed, angular):
        data = String()
        data.data = str(speed) + ";" + str(angular)
        rospy.loginfo("Sending: " + str(data))
        self.publisher.publish(data)
        rospy.loginfo("Sent\n")

        time.sleep(0.5)

        data = String()
        data.data = "0,0"
        rospy.loginfo("Sending: " + str(data))
        self.publisher.publish(data)
        rospy.loginfo("Sent\n")

    def forward(self):
        self.send_movement(0.5, 0)

    def backward(self):
        self.send_movement(-0.5, 0)

    def left(self):
        self.send_movement(0.3, 0.5)

    def right(self):
        self.send_movement(0.3, -0.5)

    def stop(self):
        self.send_movement(0, 0)

    def on_webView_loadFinished(self):
        # Begin document inspection.
        self.treeWidget.clear()
        frame = self.webView.page().mainFrame()
        document = frame.documentElement()
        self.examineChildElements(document, self.treeWidget.invisibleRootItem())

    def examineChildElements(self, parentElement, parentItem):
        # Traverse the document.
        element = parentElement.firstChild()
        while not element.isNull():
            item = QTreeWidgetItem()
            item.setText(0, element.tagName())
            parentItem.addChild(item)
            self.examineChildElements(element, item)
            element = element.nextSibling()


class GUI():
    def start(self):
        app = QApplication(sys.argv)
        window = Window()
        window.show()
        logging.info('GUI started')
        app.exec_()


if __name__ == '__main__':
    rospy.init_node('stern4most_dashboard_11700247')
    gui = GUI()
    gui.start()
