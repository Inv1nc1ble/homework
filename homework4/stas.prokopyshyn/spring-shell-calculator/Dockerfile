FROM openjdk:8
ADD target/docker-spring-calc.jar /docker-spring-calc.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-spring-calc.jar"]