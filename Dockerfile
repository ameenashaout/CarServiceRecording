FROM openjdk:11
EXPOSE 8082
ADD target/Car-Service-Recording.jar Car-Service-Recording.jar
ENTRYPOINT ["java","-jar","/Car-Service-Recording.jar"]
//test
