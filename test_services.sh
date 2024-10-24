#!/bin/bash

curl --location 'http://hello:8080/api/v1/say/luigi/abc'
curl --location 'http://hello:8080/api/v1/say/mario/xyz'


curl --location 'http://hello:8080/api/v1/get/mario'
curl --location 'http://hello:8080/api/v1/get/luigi'
