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
        self.start = False
        self.publisherPilot = rospy.Publisher('stern4most_pilot_11700247', String, queue_size=1)
        self.publisher = rospy.Publisher('stern4most_image_gui_11700247', Image, queue_size=1)

        self.sub = rospy.Subscriber("stern4most_start_game_11700247", String, self.start_game)

        print "waiting to start..."
        rospy.spin()

    def start_game(self, data):
        print "hallo"
        self.start = True
        print "got start"
        image_topic = "/player_one/camera/rgb/image_raw"
        rospy.Subscriber(image_topic, Image, self.image_callback)


    def send(self, speed, angular):
        data = str(speed) + ";" + str(angular)
        self.publisherPilot.publish(data)

    def image_callback(self, msg):
        if self.start is True:
            try:
                cv2_img = Vision.bridge.imgmsg_to_cv2(msg, "bgr8")
            except CvBridgeError, e:
                print(e)

            # Crop the image
            crop_img = cv2_img[60:120, 0:160]

            img = cv2_img

            lower = np.array([110, 86, 65], dtype="uint8")
            upper = np.array([130, 133, 128], dtype="uint8")

            mask = cv2.inRange(img, lower, upper)
            output = cv2.bitwise_and(img, img, mask=mask)

            output = cv2.bitwise_not(output)

            lower_grey = np.array([0, 0, 0], dtype="uint8")
            upper_grey = np.array([180, 255, 255], dtype="uint8")
            black_mask = cv2.inRange(output, lower_grey, upper_grey)

            gray = cv2.bitwise_not(black_mask)
            gray = gray[900:1080][0:1080]

            cv2.imshow("Mask", gray)
            cv2.waitKey(5)

            ret, thresh = cv2.threshold(gray, 60, 255, cv2.THRESH_BINARY_INV)

            contours, hierarchy = cv2.findContours(thresh.copy(), 1, cv2.CHAIN_APPROX_NONE)

            if len(contours) > 0:
                c = max(contours, key=cv2.contourArea)
                M = cv2.moments(c)
                cx = int(M['m10'] / M['m00'])
                cy = int(M['m01'] / M['m00'])
                cv2.line(crop_img, (cx, 0), (cx, 720), (255, 0, 0), 1)
                cv2.line(crop_img, (0, cy), (1280, cy), (255, 0, 0), 1)
                cv2.drawContours(crop_img, contours, -1, (0, 255, 0), 1)

                minFF = 900
                maxFF = 901
                base = 1000.0
                base_speed = 0.3
                speed_reduction = 0.


                if cx >= maxFF:
                    calcR = (cx - 200)
                    calcR = calcR / 1500.0
                    if calcR > 0.9:
                        calcR = 0.9
                    speed = 1 - calcR
                    if calcR > 0.1 and speed > 0.5:
                        speed = speed - 0.5
                    #speed = speed - speed_reduction
                    if speed < 0.1:
                        speed = 0.1
                    print "Turn Right! - " + str(cx) + "   //Speed: " + str(speed) + "          //Angular: " + str(calcR)
                    self.send(speed, -calcR)

                if cx < maxFF and cx > minFF:
                    calcL = 1 - (cx / 900.0)
                    print "On Track!   - " + str(cx) + "   //Speed: " + str(base_speed) + "          //Angular: " + str(calcL)
                    self.send(0.3, calcL)

                if cx <= minFF:
                    calcL = 1 - (cx / 1400.0)
                    if calcL > 0.9:
                        calcL = 0.9
                    speed = 1 - calcL
                    if calcL > 0.1 and speed > 0.5:
                        speed = speed - 0.5
                    #speed = speed - speed_reduction
                    if speed < 0.1:
                        speed = 0.1
                    print "Turn Left!  - " + str(cx) + "   //Speed: " + str(speed) + "          //Angular: " + str(calcL)
                    self.send(speed, calcL)

            else:
                print "I don't see the line"


if __name__ == '__main__':
    rospy.init_node('stern4most_vision_11700247')
    vision = Vision()
