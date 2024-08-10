FROM openjdk:17
ADD target/JenkinsWithDocker.jar JenkinsWithDocker.jar
ENTRYPOINT ["java","-jar","/JenkinsWithDocker.jar"]