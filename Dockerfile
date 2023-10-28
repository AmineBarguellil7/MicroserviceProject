FROM openjdk:17

ADD target/*.jar avis.jar

ENTRYPOINT ["java", "-jar", "avis.jar"]