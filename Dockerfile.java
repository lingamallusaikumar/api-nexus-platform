FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY shared shared
COPY services services
RUN mvn -B clean package -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
ARG SERVICE_NAME
COPY --from=build /app/services/$SERVICE_NAME/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
