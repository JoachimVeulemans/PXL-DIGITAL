#!/bin/bash

docker run -v `pwd`/jupyter:/home/user/jupyter -it -p 9999:9999 spring_break jupyter notebook --ip=0.0.0.0 --port=9999 --notebook-dir=jupyter
