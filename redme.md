### Building an Image

1. Build a Jar - /target/hello-world-rest-api.jar
2. Setup the Prerequisites for Running the JAR - openjdk:8-jdk-alpine
3. Copy the jar
4. Run the jar
### Create Dockerfile(create thefile within the home directory of your project)
FROM openjdk
EXPOSE <port number of your app>
ADD target/<name of your jar file> .jar <name of your jar file>
ENTRYPOINT ["sh", "-c", "java -jar /<name of your jar file>"]
### Build Docker Image
before creating /building the image make sure you did mvn clean and mvn package
open terminal and change to the home directory of your maven project
docker build -t <own userid of docker hub account>/<name of the app>:latest
### Docker Command
#To list the images
docker image ls
#To list the running container
docker container ls
#To stop the running container
docker container stop <container id>
#to remove images and stop container(before running the bellow comand make sure all of your runnin container are stopped)
docker system prune
docker system prune -a
## to run the image
docker container run -p <local system port>:<actual docker image port> -d <name of the image:tag>
