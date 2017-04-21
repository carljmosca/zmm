#!/usr/bin/env bash
docker stop zmm-server
docker rm zmm-server
docker run -it -p 3000:3000 \
    --env DB_HOST=192.168.1.117 \
    --env DB_PORT=3306 \
    --env DB_NAME=ZM \
    --env DB_PASSWORD=password \
    --env DB_USERNAME=username \
    --name=zmm-server \
    zmm-server
