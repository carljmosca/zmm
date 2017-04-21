#!/usr/bin/env bash
CGO_ENABLED=0 GOOS=linux go build -o zmm-server .
docker build -t zmm-server -f Dockerfile.scratch .