# and open the template in the editor.
FROM amazoncorretto:11-alpine-jdk
MAINTAINER chelodev
COPY target/chelodevf1-0.0.1-SNAPSHOT.jar chelodev-app.jar
ENTRYPOINT ["java", "-jar", "/chelodev-app.jar"]