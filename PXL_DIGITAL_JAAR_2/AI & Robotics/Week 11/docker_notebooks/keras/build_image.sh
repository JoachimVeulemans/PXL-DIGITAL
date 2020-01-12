#!/bin/bash

if [ -z "$1" ]
then
	echo "need command line argument"
	exit
else
	echo $1 > "name"
	docker build -t $1:latest .
fi
