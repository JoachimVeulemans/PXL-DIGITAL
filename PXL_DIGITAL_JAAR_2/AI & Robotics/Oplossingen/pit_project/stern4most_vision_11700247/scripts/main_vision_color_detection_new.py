import rospy
from sensor_msgs.msg import Image
from cv_bridge import CvBridge, CvBridgeError
import cv2
import numpy as np
from std_msgs.msg import String


class Vision:
    bridge = CvBridge()

    def __init__(self):
        # TODO -> BATTLE CHANGE THIS TOPIC NAME BELOW
        image_topic = "/player_one/camera/rgb/image_raw"
        rospy.Subscriber(image_topic, Image, self.image_callback)
        rospy.Subscriber(image_topic, String, self.image_callback)

        self.publisherPilot = rospy.Publisher('stern4most_pilot_11700247', String, queue_size=1)
        self.publisher = rospy.Publisher('stern4most_image_gui_11700247', Image, queue_size=1)

        rospy.spin()

    def send(self, speed, angular):
        data = str(speed) + ";" + str(angular)
        self.publisherPilot.publish(data)

    def image_callback(self, msg):
        try:
            cv2_img = Vision.bridge.imgmsg_to_cv2(msg, "bgr8")
        except CvBridgeError, e:
            print(e)

        # Crop the image
        crop_img = cv2_img[60:120, 0:160]

        img = cv2_img

        lower = np.array([103, 86, 65], dtype="uint8")
        upper = np.array([145, 133, 128], dtype="uint8")

        mask = cv2.inRange(img, lower, upper)
        output = cv2.bitwise_and(img, img, mask=mask)

        output = cv2.bitwise_not(output)

        gray = cv2.cvtColor(output, cv2.COLOR_BGR2GRAY)


        lower_grey = np.array([0, 0, 0], dtype="uint8")
        upper_grey = np.array([180, 255, 255], dtype="uint8")
        black_mask = cv2.inRange(output, lower_grey, upper_grey)

        #blur = cv2.GaussianBlur(black_mask, (5, 5), 0)

        #gray = cv2.cvtColor(black_mask, cv2.COLOR_BGR2GRAY)

        gray = cv2.bitwise_not(black_mask)

        #cv2.imshow("Reverse", cv2.resize(reverse, (960, 540)))
        #gray = gray[900:1080, 500:600]
        #gray = cv2.resize(gray, (20, 20))


        #cv2.destroyAllWindows()

        # Color thresholding
        gray = gray[800:1080][0:1080]

        cv2.imshow("Mask", gray)
        cv2.waitKey(5)

        ret, thresh = cv2.threshold(gray, 60, 255, cv2.THRESH_BINARY_INV)

        # Find the contours of the frame
        contours, hierarchy = cv2.findContours(thresh.copy(), 1, cv2.CHAIN_APPROX_NONE)

        #contours = []
        # Find the biggest contour (if detected)
        if len(contours) > 0:
            c = max(contours, key=cv2.contourArea)
            M = cv2.moments(c)
            cx = int(M['m10'] / M['m00'])
            cy = int(M['m01'] / M['m00'])
            cv2.line(crop_img, (cx, 0), (cx, 720), (255, 0, 0), 1)
            cv2.line(crop_img, (0, cy), (1280, cy), (255, 0, 0), 1)
            cv2.drawContours(crop_img, contours, -1, (0, 255, 0), 1)

            softLeft = 700
            minFF = 800
            maxFF = 1050
            softRight = 1150

            if cx >= maxFF:
                if cx > softRight:
                    print "Turn hard Right! - " + str(cx)
                    self.send(0.1, -0.8)
                else:
                    print "Turn soft Right! - " + str(cx)
                    self.send(0.1, -0.5)

            if cx < maxFF and cx > minFF:
                print "On Track! - " + str(cx)
                self.send(0.1, 0)

            if cx <= minFF:
                if cx > softLeft:
                    print "Turn soft Left! - " + str(cx)
                    self.send(0.1, 0.5)
                else:
                    print "Turn hard Left! - " + str(cx)
                    self.send(0.1, 0.8)

        else:
            print "I don't see the line"

        # Display the resulting frame
        #cv2.imshow('frame', crop_img)
        #time.sleep(1)


if __name__ == '__main__':
    rospy.init_node('stern4most_vision_11700247')
    vision = Vision()
