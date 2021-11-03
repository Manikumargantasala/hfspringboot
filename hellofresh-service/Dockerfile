FROM maven:3.6-jdk-11
COPY src/ /usr/hellofresh/src/
COPY pom.xml /usr/hellofresh/
WORKDIR /usr/hellofresh/
ENTRYPOINT ["mvn","spring-boot:run"]