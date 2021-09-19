FROM adoptopenjdk/openjdk11:latest
COPY target/spring-boot-azure-micro-svc-sept19-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
