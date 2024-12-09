FROM openjdk:17
WORKDIR /opt
ENV PORT=8081
EXPOSE 8081
COPY target/*.jar /opt/springboot-mysql-docker.jar
ENTRYPOINT ["java","-jar","springboot-mysql-docker.jar"]