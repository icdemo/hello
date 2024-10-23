#!/bin/bash

 echo "Failures: $(cat target/surefire-reports/*.xml | grep ^"<testsuite" | awk '{print $10}' | grep -o '[0-9]*')"