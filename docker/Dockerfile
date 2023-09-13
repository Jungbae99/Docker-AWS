FROM openjdk:17-alpine

ARG JAR_FILE=/build/libs/jbdocker-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /jbdocker.jar

ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod", "/jbdocker.jar"]