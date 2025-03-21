# base docker image
FROM openjdk:21-jdk

LABEL maintainer="dhineshdeveloper"
ADD target/springBoot-Docker-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
