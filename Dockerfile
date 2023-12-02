FROM openjdk:17-oracle
EXPOSE 9010
ARG JAR_FILE=target/jenkins-integration-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} jenkins-integration.jar
ENTRYPOINT ["java","-jar","/jenkins-integration.jar"]