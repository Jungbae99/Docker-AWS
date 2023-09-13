FROM openjdk:17-alpine

ARG JAR_FILE=/build/libs/docker-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /docker.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "/docker.jar"]