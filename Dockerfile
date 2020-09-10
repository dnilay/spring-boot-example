FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/themepark-app.jar app.jar
ENTRYPOINT ["sh", "-c", "java -jar /app.jar"]