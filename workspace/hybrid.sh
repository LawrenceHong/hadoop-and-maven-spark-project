#!/bin/bash
hadoop fs -rm -r /user/cloudera/hybrid/output

hadoop jar mywordcount.jar hybrid.HyBrid /user/cloudera/input /user/cloudera/hybrid/output

./ls-output.sh hybrid/output part-r-00000
