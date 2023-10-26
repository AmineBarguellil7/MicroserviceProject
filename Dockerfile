FROM openjdk:17

ADD target/*.jar store.jar

ENTRYPOINT ["java", "-jar", "store.jar"]