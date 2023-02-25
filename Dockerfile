FROM openjdk:11
WORKDIR E:DA
EXPOSE 8081
COPY target/hust-elearning-english-0.0.1-SNAPSHOT.jar hust-elearning-english-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/hust-elearning-english-0.0.1-SNAPSHOT.jar"]