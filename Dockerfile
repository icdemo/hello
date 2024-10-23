FROM maven:3.9.9-amazoncorretto-17 AS builder

WORKDIR /build

COPY pom.xml pom.xml
COPY src src

RUN mvn package

FROM amazoncorretto:17

WORKDIR /app

COPY --from=builder /build/target/*.jar /app/app.jar

CMD ["java", "-jar", "app.jar"]