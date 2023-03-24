FROM amazoncorretto:11-alpine-jdk
MAINTAINER CBW
COPY target/cbw-0.0.1-SNAPSHOT.jar cbw-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cbw-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
