#!/bin/bash
hadoop fs -rm -r /user/cloudera/wordstripe/output

hadoop jar mywordcount.jar wordstripe.WordStripe /user/cloudera/input /user/cloudera/wordstripe/output

./ls-output.sh wordstripe/output part-r-00000
