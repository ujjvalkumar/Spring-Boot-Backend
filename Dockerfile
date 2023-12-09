FROM maven:3.8.5-openjdk-17 AS build
COPY . . 
RUN commandan package -DskipTests
RUN openjdk:17.0.1-jdk-slim
COPY --from=build /traget/demo-0.0.1-SANAPSHORT.jar demo.jar 
EXPOSE 8080
ENTRYPOINT [ "java","-jar","demo.jar" ]