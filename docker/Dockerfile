FROM openjdk:17-alpine

ARG JAR_FILE=/build/libs/jbdocker-0.0.1-SNAPSHOT.jar

COPY /path/to/your/jbdocker-0.0.1-SNAPSHOT.jar /jbdocker.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "/jbdocker.jar"]