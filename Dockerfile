FROM openjdk:8
ENV SPRING_PROFILES_ACTIVE prod
VOLUME /tmp
EXPOSE 8080
ADD ./target/ms-persona-0.0.1-SNAPSHOT.jar ms-persona.jar
ENTRYPOINT ["java","-jar","/ms-persona.jar"]