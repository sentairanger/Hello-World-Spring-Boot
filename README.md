# Hello-World-Spring-Boot
This is a basic Spring Boot Application with HTML, CSS and JQuery. This will be available for everyone and will be build up using Cloud Native Tools.

## Introduction

This is a test application to learn how to use Spring Boot. This can be run in the terminal or in IntelliJ. In the terminal make sure to have Java installed and also have Maven installed. Maven can be downloaded [here](https://maven.apache.org/download.cgi). Download IntelliJ [here](https://www.jetbrains.com/idea/download/#section=linux). This can be run on IntelliJ by running the main Java class or run the application by first building the dependencies with `mvn package` and then switch to the newly created target directory and run `java -jar <name-of-java-jar>.jar`.

### Docker Container

To run this application as a container be sure to have Docker installed on your system. You can download [here](https://docs.docker.com/get-docker/). Next, get a DockerHub account and then create a new repository. You can call it `spring-hello`. Next, build the image with `docker build -t spring-hello .`. Next, run the docker image with `docker run -d -p spring-hello 8080:8080`. Then you can go to the URL `0.0.0.0:8080/home` and then the UI should appear. You can tag the image with `docker tag spring-hello <dockerhub-username>/spring-hello:tag. Then login with `docker login` and then after logging in push the image with `docker push <dockerhub-username>/spring-hello:tag. Check your repository and the tag should appear.
