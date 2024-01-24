FROM openjdk:17
EXPOSE 8080
ADD target/MeraPDF-0.0.1-SNAPSHOT.jar MeraPDF-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/MeraPDF-0.0.1-SNAPSHOT.jar"]