docker stop zmm-server
docker rm zmm-server
docker run -it \
    -e MYSQL_PORT_3306_TCP_ADDR=192.168.1.117 \
    -e MYSQL_PORT_3306_TCP_PORT=3306 \
    -e MYSQL_ENV_MYSQL_DB_NAME=zm \
    -e MYSQL_ENV_MYSQL_DB_USERNAME=zm \
    -e MYSQL_ENV_MYSQL_DB_PASSWORD=LetMeIn  \
    -p 8080 \
    --name zmm-server carljmosca/zmm-server
