FROM maven:3.5.0-jdk-8-alpine

WORKDIR /usr/microservice

ADD pom.xml /usr/microservice/pom.xml
RUN ["mvn", "dependency:resolve"]
RUN ["mvn", "verify"]

ADD src /usr/microservice/src
RUN ["mvn", "package"]

EXPOSE 4567

CMD ["/usr/bin/java", "-jar", "target/microservice-jar-with-dependencies.jar"]