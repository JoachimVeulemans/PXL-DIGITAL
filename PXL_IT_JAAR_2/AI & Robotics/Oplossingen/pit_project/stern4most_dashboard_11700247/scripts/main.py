# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'main.ui'
#
# Created by: PyQt5 UI code generator 5.10.1
#
# WARNING! All changes made in this file will be lost!

from PyQt5 import QtCore, QtGui, QtWidgets

class Ui_RosControllerRP1819G01(object):
    def setupUi(self, RosControllerRP1819G01):
        RosControllerRP1819G01.setObjectName("RosControllerRP1819G01")
        RosControllerRP1819G01.resize(380, 380)
        self.pushButton_EXIT = QtWidgets.QPushButton(RosControllerRP1819G01)
        self.pushButton_EXIT.setGeometry(QtCore.QRect(20, 330, 89, 25))
        self.pushButton_EXIT.setObjectName("pushButton_EXIT")
        self.pushButton_FW = QtWidgets.QPushButton(RosControllerRP1819G01)
        self.pushButton_FW.setGeometry(QtCore.QRect(120, 50, 89, 25))
        self.pushButton_FW.setObjectName("pushButton_FW")
        self.pushButton_BW = QtWidgets.QPushButton(RosControllerRP1819G01)
        self.pushButton_BW.setGeometry(QtCore.QRect(120, 160, 89, 25))
        self.pushButton_BW.setObjectName("pushButton_BW")
        self.pushButton_LEFT = QtWidgets.QPushButton(RosControllerRP1819G01)
        self.pushButton_LEFT.setGeometry(QtCore.QRect(10, 100, 89, 25))
        self.pushButton_LEFT.setObjectName("pushButton_LEFT")
        self.pushButton_RIGHT = QtWidgets.QPushButton(RosControllerRP1819G01)
        self.pushButton_RIGHT.setGeometry(QtCore.QRect(230, 100, 89, 25))
        self.pushButton_RIGHT.setObjectName("pushButton_RIGHT")
        self.pushButton_AUTO = QtWidgets.QPushButton(RosControllerRP1819G01)
        self.pushButton_AUTO.setGeometry(QtCore.QRect(120, 100, 89, 25))
        self.pushButton_AUTO.setObjectName("pushButton_AUTO")
        self.pushButton_STOP = QtWidgets.QPushButton(RosControllerRP1819G01)
        self.pushButton_STOP.setGeometry(QtCore.QRect(20, 290, 89, 25))
        self.pushButton_STOP.setObjectName("pushButton_STOP")
        self.label = QtWidgets.QLabel(RosControllerRP1819G01)
        self.label.setGeometry(QtCore.QRect(720, 110, 67, 17))
        self.label.setObjectName("label")

        self.retranslateUi(RosControllerRP1819G01)
        QtCore.QMetaObject.connectSlotsByName(RosControllerRP1819G01)

    def retranslateUi(self, RosControllerRP1819G01):
        _translate = QtCore.QCoreApplication.translate
        RosControllerRP1819G01.setWindowTitle(_translate("RosControllerRP1819G01", "Controller 11700247"))
        self.pushButton_EXIT.setText(_translate("RosControllerRP1819G01", "Afsluiten"))
        self.pushButton_FW.setText(_translate("RosControllerRP1819G01", "FW"))
        self.pushButton_BW.setText(_translate("RosControllerRP1819G01", "BW"))
        self.pushButton_LEFT.setText(_translate("RosControllerRP1819G01", "LEFT"))
        self.pushButton_RIGHT.setText(_translate("RosControllerRP1819G01", "RIGHT"))
        self.pushButton_AUTO.setText(_translate("RosControllerRP1819G01", "Auto"))
        self.pushButton_STOP.setText(_translate("RosControllerRP1819G01", "Stop"))
        self.label.setText(_translate("RosControllerRP1819G01", "TextLabel"))

