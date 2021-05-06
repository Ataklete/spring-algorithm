FROM openjdk: latest
ADD target/demo-0.0.1-SNAPSHOT app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]
