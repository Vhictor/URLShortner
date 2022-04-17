FROM openjdk:11
MAINTAINER victor
COPY target/shorturl-0.0.1-SNAPSHOT.jar short-url-docker.jar
ENTRYPOINT ["java", "-jar", "/short-url-docker.jar"]