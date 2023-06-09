FROM eclipse-temurin:17-focal

LABEL org.opencontainers.image.source="https://github.com/BitByeBit/CalendarParserAuthenticator"

ENV SPRING_PORT=9090

WORKDIR /srv

COPY target/calendar-parser-authenticator.jar calendar-parser-authenticator.jar

EXPOSE ${SPRING_PORT}