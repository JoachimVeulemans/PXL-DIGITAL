# How to share Python code from a ROS package to other ROS packages

First of all, this guide will create a shared ROS package which contains common 
Python code, useful for other ROS packages. The second part will use the shared
code in an example/test package.

## 1. Create a new package in the `src/` dir of your Catkin workspace.
The package in this example is called `common_pkg`.
You can add dependencies like `rospy` while creating the package.

```bash
$ # This is inside the src directory of your Catkin workspace.
$ catkin_create_pkg common_pkg rospy
Created file common_pkg/CMakeLists.txt
Created file common_pkg/package.xml
Created folder common_pkg/src
Successfully created files in ................../catkin_ws/src/common_pkg. Please adjust the values in package.xml.
$
```

## 2. Create your code to share.
Go in to the `src/` dir of the newly create ROS package:

```bash
$ cd common_pkg/src
```

There you need to create a directory with the _same_ name as your ROS package.
In this case `common_pkg`. This will be the Python package name later on.

```bash
$ mkdir common_pkg
```

Create an `__init__.py` file inside the newly created dir, here `common_pkg`.
Python will need this to find the package.

```bash
$ cd common_pkg
$ touch __init__.py
```

Create all your Python modules inside this folder, here inside dir `common_pkg`:
Remember: every normal Python file is a Python module!

```bash
$ vim my_awesome_code.py
```

As an example, the following code is used in this guide.
Insert these statements into the `my_awesome_code.py` file:

```Python
class Foo:
    def bar(self):
        print "Bar"

def my_function():
    print "Hello from function"
```

## 3. Configure the package to share the Python code created above.
One new file needs to be added (`setup.py`) and the `CMakeLists.txt` file needs
to be altered to configure the package in order to share the Python code.

### Create a file called setup.py in your ROS package directory, here `common_pkg`.
Use your favorite editor, vim is not mandatory.

```bash
$ # We are inside ...../common_pkg/src/common_pkg and therefore need to go 2 up.
$ cd ../.. 
$ # We arive in common_pkg, our ROS package directory.
$ vim setup.py
```

The following source code statements need to be insterted in to the `setup.py` file.
This code is provided by the ROS/Catkin developers, for example in the tutorials: 
[ROS Makefile tutorial](http://wiki.ros.org/rospy_tutorials/Tutorials/Makefile).
The only thing you need to change is the package name in the list called `packages`,
line number 8 of 12:

```python
## ! DO NOT MANUALLY INVOKE THIS setup.py, USE CATKIN INSTEAD

from distutils.core import setup
from catkin_pkg.python_setup import generate_distutils_setup

# fetch values from package.xml
setup_args = generate_distutils_setup(
    packages=['common_pkg'],
    package_dir={'': 'src'},
)

setup(**setup_args)
```

### Alter the `CMakeLists.txt` file of your package.
In the `CMakeLists.txt` file, search for the section below and uncomment the 
`catkin_python_setup()` statement. The `#` is already removed in the following
code snippet.

```bash
## Uncomment this if the package has a setup.py. This macro ensures
## modules and global scripts declared therein get installed
## See http://ros.org/doc/api/catkin/html/user_guide/setup_dot_py.html
catkin_python_setup()
```

## 4. Build the package and source the workspace
Go to the root of your Catkin workspace to build and source it.


```bash
$ # We are inside the root of the common_pkg so we need to go 2 up.
$ cd ../../ 
$ catkin_make
$ source devel/setup.bash
```

## 5. Create a test package and use the shared code.

### Create the test package
Create a test package called `test_pkg` inside the `src/` directory of your
Catkin workspace.

```bash
$ # We are inside the root of the Catkin workspace, so we need to go to src,
$ cd src
$ catkin_create_pkg test_pkg common_pkg
```

### Create the test code and give it execution rights.
Go to the directory of the test package and create a directory called `scripts`.
Add a file called `test.py`.

```bash
$ # We are in the src/ dir of our Catkin workspace, so we need to cd to the package.
$ cd test_pkg
$ mkdir scripts
$ cd scripts
$ vim test.py
```

Add the folowing code:

```python
#!/usr/bin/env python

from common_pkg.my_awesome_code import Foo, my_function

foo = Foo()
foo.bar()

my_function()
```

Give the `test.py` file execution rights:

```bash
$ chmod +x test.py
```

### Run the test code.

```bash
$ ./test.py 
Bar
Hello from function
$
```

DONE!
