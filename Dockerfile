FROM ubuntu:latest
LABEL authors="gulnarashaykhutdinova"

FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD build/libs/auth-service-0.0.1-SNAPSHOT.jar

# Запустить приложение
ENTRYPOINT ["java", "-jar", "/app.jar"]
