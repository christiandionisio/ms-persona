FROM openjdk:8
VOLUME /tmp
ADD ./target/ms-persona-0.0.1-SNAPSHOT.jar ms-persona.jar
ENTRYPOINT ["java","-jar","/ms-persona.jar"]