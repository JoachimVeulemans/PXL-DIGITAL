#!/bin/bash

docker run -v `pwd`/app:/home/user/app -it -p 9999:9999 spring_break python3 app/app.py
