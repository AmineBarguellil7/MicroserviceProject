FROM openjdk:17

ADD target/*.jar article.jar

ENTRYPOINT ["java", "-jar", "article.jar"]