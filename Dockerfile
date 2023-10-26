FROM openjdk:17

ADD target/*.jar microservice_store.jar

ENTRYPOINT ["java", "-jar", "microservice_store.jar"]