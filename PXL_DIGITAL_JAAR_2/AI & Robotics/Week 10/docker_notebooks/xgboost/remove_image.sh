#!/bin/bash

name=$(<name)

docker image rm $name:latest
