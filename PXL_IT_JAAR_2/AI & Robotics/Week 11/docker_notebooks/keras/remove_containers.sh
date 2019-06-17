#!/bin/bash

name=$(<name)

docker rm `docker ps -a | grep $name | awk '{ print $1 }'`

