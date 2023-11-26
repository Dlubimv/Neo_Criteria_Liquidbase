FROM openjdk:17-oracle
WORKDIR /usr/local/app
ADD Spring_Boot_CRUD_App-0.0.1-SNAPSHOT.jar app.jar
CMD java -jar ./app.jar