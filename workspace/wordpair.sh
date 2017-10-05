#!/bin/bash
hadoop fs -rm -r /user/cloudera/wordpair/output

hadoop jar mywordcount.jar wordpair.WordPair /user/cloudera/input /user/cloudera/wordpair/output

./ls-output.sh wordpair/output part-r-00000
