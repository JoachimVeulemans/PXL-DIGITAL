import sys
import warnings

warnings.filterwarnings('ignore')

from PyQt5 import QtCore, QtWidgets
from PyQt5.QtWidgets import QMainWindow, QLabel, QSlider
from PyQt5.QtCore import QSize, Qt, pyqtSlot, pyqtSignal
from PyQt5.uic import loadUi


class HelloWindow(QMainWindow):
    pushButtonClicked = pyqtSignal()
    valueUpdating = pyqtSignal(int)

    def pushButtonClicked(self):
        pass

    def valueUpdating(self, value):
        self.title.setText(str(value))

    def __init__(self):
        QMainWindow.__init__(self)

        self.setMinimumSize(QSize(640, 480))
        self.setWindowTitle("Hello world")
        loadUi('mainwindow.ui', self)
        self.button.clicked.connect(self.pushButtonClicked)


if __name__ == "__main__":
    app = QtWidgets.QApplication(sys.argv)
    mainWin = HelloWindow()
    mainWin.show()
    sys.exit(app.exec_())