# Use a lightweight Java runtime
FROM openjdk:8-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the pre-built JAR file from your local machine into the container
COPY target/my-custom-app.jar app.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Command to run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
