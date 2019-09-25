#!/bin/sh
mvn clean package && docker build -t com.ryan/city-backend .
docker rm -f city-backend || true && docker run -d -p 8080:8080 -p 4848:4848 --name city-backend com.ryan/city-backend 
