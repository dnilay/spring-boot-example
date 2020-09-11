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
### run Mysql
docker run --detach --env MYSQL_ROOT_PASSWORD=root --env MYSQL_USER=<username> --env MYSQL_PASSWORD=<password> --env MYSQL_DATABASE=<databasename> mysql --publish 3306:3306 mysql:latest
### Download/Configure Mysql CommandLine Shell
nilay@nilay-HP-EliteBook-840-G2$ mysqlsh
MySQL Shell 8.0.15
Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
Oracle is a registered trademark of Oracle Corporation and/or its affiliates.
Other names may be trademarks of their respective owners.

Type '\help' or '\?' for help; '\quit' to exit.

MySQL  JS > \connect <username>@localhost:3306
Creating a session to '<username>>@localhost:3306'
Please provide the password for '<username>@localhost:3306': 
Save password for 'todos-user@localhost:3306'? [Y]es/[N]o/Ne[v]er (default No): v
Fetching schema names for autocompletion... Press ^C to stop.
Your MySQL connection id is 37
Server version: 5.7.26 MySQL Community Server (GPL)
No default schema selected; type \use <schema> to set one.

 MySQL  localhost:3306 ssl  JS > \sql
Switching to SQL mode... Commands end with ;

 MySQL  localhost:3306 ssl  SQL > use <databasename>
Default schema set to `<database>`.
Fetching table and column names from `<databasename>` for auto-completion... 
Press ^C to stop
