FROM openjdk:8
ADD target/springbootJwt-0.0.1-SNAPSHOT.jar springJwt
EXPOSE 8080
ENTRYPOINT ["java","-jar","springJwt"]