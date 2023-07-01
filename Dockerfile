FROM openjdk:17
LABEL maintainer = "Hassan"
ADD build/libs/MyAppli-0.0.1-SNAPSHOT.jar My-App-On-Docker.jar
ENTRYPOINT ["java","-jar","My-App-On-Docker.jar"]
