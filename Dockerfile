# Use a lightweight Java 17 runtime
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the pre-built JAR file from your local machine into the container
COPY target/my-custom-app.jar app.jar

# Expose the default Spring Boot port
EXPOSE 6767

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
