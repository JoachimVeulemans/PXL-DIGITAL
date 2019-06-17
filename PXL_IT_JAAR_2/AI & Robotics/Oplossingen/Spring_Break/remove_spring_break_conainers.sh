#!/bin/bash

docker rm `docker ps -a | grep spring_break | awk '{ print $1 }'`

