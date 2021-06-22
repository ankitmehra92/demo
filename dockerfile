FROM ubuntu:latest
FROM openjdk:11
FROM maven:3.8.1-jdk-11-openj9
ENV NAME=dockername
RUN apt update
RUN apt install -y git
WORKDIR /app
RUN git clone https://github.com/ankitmehra92/demo.git
WORKDIR /app/demo
RUN mvn clean install
WORKDIR /app/demo/target
EXPOSE 8080
CMD ls
ENTRYPOINT ["java", "-jar", "Templating-0.0.1-SNAPSHOT.jar"]