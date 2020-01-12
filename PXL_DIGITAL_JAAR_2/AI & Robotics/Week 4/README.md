# Week 4: Introduction to the Robot Operating System

## 0. ROS Melodic Morenia VM.pdf
### Goals
The junior-colleague

* can explain why an IDE needs to be run from the command line 

**[Presentation](0%20ROS%20Melodic%20Morenia%20VM.pdf)**

### Information
The Virtual Machine kan be downloaded [here](https://drive.google.com/file/d/1cHMYKXGKjmLo1-t1yxEdcrVLbpfZMXvg/view?usp=sharing).
A list of all installed packages can be found [here](listings/all_installed_packages.txt).
It was created by executing the `sudo apt list --installed > package_list` command inside the Virtual Machine.

## 1. Introduction to ROS
### Goals
The junior-colleague

* can describe ROS in own words
* can describe flexible robotics in own words
* can explain in own words the benefits of using ROS
* can explain "structured communications layer" in context of ROS
* can explain the salient characteristics of and its consequence to ROS
* can describe in own words  "distributions" in context of  ROS
* can describe in own words different usages of ROS
* can explain the features of ROS
* can explain in own words distributed systems in the context of ROS
* can explain the differences between a framework and a library
* can explain interaction of nodes in context of ROS
* can describe the downsides of ROS
* can describe the difference between ROS(1) and ROS2 using the salient characteristics of ROS(1) and the new use cases.

**[Presentation](1%20Introduction%20to%20ROS.pdf)**

### Extra
- [**ROS: an open-source Robot Operating System. (2009)**](papers/icraoss09-ROS.pdf)

  Quigley, Morgan & Conley, Ken & P Gerkey, Brian & Faust, Josh & Foote, Tully & Leibs, Jeremy & Wheeler, Rob & Y Ng, Andrew. (2009). ROS: an open-source Robot Operating System. ICRA Workshop on Open Source Software. 3. 
  
  
- [**Bloomberg Technology: Building a Robot Operating System for the Future**](https://www.youtube.com/watch?v=Dm7HnQb8n9Y)

   > Depending on whom you ask, the Robot Operating System—or ROS—is kind of like the plumbing in a house. Or it’s like a set of Lego building blocks. Or the human nervous system. 
   
   > However you describe it, ROS is everywhere. It's the shared system of underlying code that powers robots around the world, from the hobbyist creations in a garage to industrial robots at Toyota. It's also the focus of the latest episode of Ventures, a video series about startups from Bloomberg Technology.


## 2. ROS Concepts
### Goals
The junior-colleague

* can describe in own words roscore, master, parameter server and rosout in own words
* can explain in own words nodes, topics, pub/sub, service/client packages in context of ROS
* can start, list, inspect and ping existing nodes
* can describe the difference in communication characteristics of pub/sub and service/client in context of ROS
* can explain in own words the ROS architecture on one and multiple computers using schemes.
* can explain a complete ROS system from a given scheme
* can visualize a ROS system as a graph
* can inspect ROS topics
* can inspect ROS messages
* can plot ROS messages

**[Presentation](2%20ROS%20Concepts.pdf)**


## 3. Navigating the ROS Filesystem
### Goals
The junior-colleague

* can navigate a ROS system


**[Presentation](3%20Navigating%20the%20ROS%20Filesystem.pdf)**


## 4. Creating a Catkin Package
### Goals

The junior-colleague

* can describe a catkin workspace in own words
* can explain the package structure of a catkin Workspace
* can create a package with dependencies inside a catkin workspace
* can inspect the dependencies of a ROS Package


**[Presentation](4%20Creating%20a%20Catkin%20Package.pdf)**

## 5. ROS: Publisher Subscriber
### Goals
The junior-colleague

* can create and run their own ROS publisher using Python
* can create and run their own ROS subscriber using Python

**[Presentation](5%20ROS%20Publisher%20Subscriber.pdf)**

### Code
* [publisher.py (Python 2)](code/python2/publisher.py)
* [subscriber.py (Python 2)](code/python2/subscriber.py)

## 6. ROS: Simple Service & Client
### Goals
The junior-colleague

* can create and run their own ROS service using Python
* can create and run their own ROS client using Python

**[Presentation](6%20ROS%20Simple%20Service%20Client.pdf)**

### Code
* [AddTwoInts.srv](code/AddTwoInts.srv)
* [service.py (Python 2)](code/python2/service.py)
* [client.py (Python 2)](code/python2/client.py)

## 7. ROS Next Steps.pdf
### Goals

**This part has no new goals.** It contains links to supplementary study materials for previously defined goals and extra information.

**[Presentation](7%20ROS%20Next%20Steps.pdf)**

[**ROS Wiki Mirror**](http://wiki.ros.org.ros.informatik.uni-freiburg.de)


## 8. Computer Vision.pdf
### Goals
The junior-colleague

- can use OpenCV to analyse image (streams) with Python in projects.

**[Presentation](8%20Computer%20Vision.pdf)**

### Code
* [vision_controller.py (Python 2)](code/python2/vision_controller.py)

## Exercises
The PDF file with all the exercises can be found [here](exercises/Week%204.pdf).
