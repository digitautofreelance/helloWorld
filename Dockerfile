FROM openjdk:8-jre-slim
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build/libs/*.jar $APP_HOME
CMD java -jar HelloWorld.jar
EXPOSE 80
