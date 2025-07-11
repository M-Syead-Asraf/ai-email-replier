#
# Build stage
#
FROM maven:3.9.6-openjdk-21 AS build
COPY . .
RUN mvn clean install

#
# Package stage
#
FROM eclipse-temurin:21-jdk
COPY --from=build /target/email-writer-sb-v1.0.jar main.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","main.jar"]
