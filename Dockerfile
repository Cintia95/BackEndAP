FROM amazoncorretto:17
MAINTAINER CBW
COPY target/cbw-0.0.1-SNAPSHOT.jar cbw.app.jar
ENTRYPOINT ["java","-jar","/cbw.app.jar"]
