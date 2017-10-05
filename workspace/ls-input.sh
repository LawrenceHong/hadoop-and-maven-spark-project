#!/bin/bash
if [ -z $1 ]
	then
	hadoop fs -ls /user/cloudera
elif [[ -z $2 && -n $1 ]]
	then
	hadoop fs -ls /user/cloudera/$1
elif [[ -n $1 && -n $2 ]]
	then
	hadoop fs -cat /user/cloudera/$1/$2
fi
