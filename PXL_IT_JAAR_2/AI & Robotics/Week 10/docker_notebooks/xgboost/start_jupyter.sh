#!/bin/bash

name=$(<name)

docker run -v `pwd`/jupyter:/home/user/jupyter -it -p 9999:9999 $name jupyter notebook --ip=0.0.0.0 --port=9999 --notebook-dir=jupyter
