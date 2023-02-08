FROM amazoncorretto:19-alpine-jdk
MAINTAINER FranciscoLGM
COPY target/servidor-0.0.1-SNAPSHOT.jar servidor-app.jar
ENTRYPOINT ["java", "-jar", "/servidor-app.jar"]
