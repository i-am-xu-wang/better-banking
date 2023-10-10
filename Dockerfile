# Use a base image with Java 17
FROM openjdk:22-ea-17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR into the container
COPY build/libs/*.jar app.jar

# Specify the command to run on container start
ENTRYPOINT ["java", "-jar", "app.jar"]
