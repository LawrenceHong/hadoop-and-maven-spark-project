#!/bin/bash
hadoop fs -rm -r /user/cloudera/wordcount/output

hadoop jar mywordcount.jar wordcount.WordCount /user/cloudera/input /user/cloudera/wordcount/output

./ls-output.sh wordcount/output part-r-00000
