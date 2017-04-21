#!/usr/bin/env bash
go build -o zmm-server .
docker build -t zmm-server -f Dockerfile.rpi.scratch .
