FROM openjdk:8
WORKDIR /web-app
COPY target/fundamentals-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "fundamentals-0.0.1-SNAPSHOT.jar"]	