FROM openjdk
EXPOSE 5000
ADD target/themepark-app.jar themepark-app.jar
ENTRYPOINT ["sh", "-c", "java -jar /themepark-app.jar"]