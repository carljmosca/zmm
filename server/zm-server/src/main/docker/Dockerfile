FROM java:8

MAINTAINER Carl J. Mosca <carljmosca@gmail.comv>

ADD zmm-server-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", \
    "/app.jar"]