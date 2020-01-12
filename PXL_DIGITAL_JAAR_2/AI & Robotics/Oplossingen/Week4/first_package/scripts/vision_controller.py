#!/usr/bin/python

import rospy
import time

from sensor_msgs.msg import Image
from threading import Lock

import cv2
from cv_bridge import CvBridge, CvBridgeError

import numpy as np

GUI_UPDATE_PERIOD = 0.10  # Seconds


class VisionDisplay:

    def __init__(self):
        self.subVideo   = rospy.Subscriber('/camera/rgb/image_raw', Image, self.callback_image_raw)

        self.bridge = CvBridge()

        self.image = None
        self.imageLock = Lock()

        self.bound_low = np.array([0, 0, 0])
        self.bound_up  = np.array([0, 0, 0])

        self.statusMessage = ''

        self.connected = False

        self.redrawTimer = rospy.Timer(rospy.Duration(GUI_UPDATE_PERIOD), self.callback_redraw)

    def convert_ros_to_opencv(self, ros_image):
        try:
            cv_image = self.bridge.imgmsg_to_cv2(ros_image, "bgr8")
            return cv_image
        except CvBridgeError as error:
            raise Exception("Failed to convert to OpenCV image")

    def callback_redraw(self, event):
        if self.image is not None:
            self.imageLock.acquire()
            try:
                # Convert the captured frame from ROS to OpenCV.
                image_cv = self.convert_ros_to_opencv(self.image)
            finally:
                self.imageLock.release()

            cv2.namedWindow("Image")
            img = cv2.resize(image_cv,(360,480))
            cv2.imshow("Image", img)

            cv2.namedWindow("Mask")
            cv2.createTrackbar("Hue lower bound:", "Mask", 0, 179, self.callback_trackbars)
            cv2.createTrackbar("Hue upper bound:", "Mask", 0, 179, self.callback_trackbars)

            image_hsv = cv2.cvtColor(image_cv, cv2.COLOR_BGR2HSV)
            mask = cv2.inRange(image_hsv, self.bound_low, self.bound_up)
            cv2.imshow('Mask', mask)

            cv2.waitKey(5)

    def callback_trackbars(self, value):
        h_low = cv2.getTrackbarPos('Hue lower bound:', 'Mask')
        h_up  = cv2.getTrackbarPos('Hue upper bound:', 'Mask')
        s_low = 0
        s_up  = 0
        v_low = 0
        v_up  = 0

        self.bound_low = np.array([h_low, s_low, v_low], np.uint8)
        self.bound_up = np.array([h_up, s_up, v_up], np.uint8)


    def callback_image_raw(self, data):
        self.imageLock.acquire()
        try:
            self.image = data
        finally:
            self.imageLock.release()


if __name__=='__main__':
    rospy.init_node('vision_controller')

    display = VisionDisplay()

    while True:
        time.sleep(5)
