FROM openjdk:21-ea-14-jdk-slim

EXPOSE 8085:8085

WORKDIR /docker-imgs

COPY ./target/jobseeker.jar /jobseeker.jar

# java -jar jobseeker.jar - to run our application

ENTRYPOINT ["java", "-jar", "/jobseeker.jar"]