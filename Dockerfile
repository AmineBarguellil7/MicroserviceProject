FROM openjdk:17

ADD target/*.jar Events.jar

ENTRYPOINT ["java", "-jar", "Events.jar"]