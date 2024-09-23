FROM openjdk:22-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/document-keeper-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]