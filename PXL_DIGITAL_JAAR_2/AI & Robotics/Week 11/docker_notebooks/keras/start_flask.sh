#!/bin/bash

name=$(<name)

docker run -v `pwd`/app:/home/user/app -it -p 9999:9999 $name python3 app/app.py
