#!/bin/bash

set -euo pipefail



#Use tools image

docker build \
  -t tools \
  --build-arg maven_version=3.8.4 \
  --build-arg java_version=11 \
  .

