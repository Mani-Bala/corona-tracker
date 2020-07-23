FROM openjdk:11
COPY build/libs/corona*.jar /tmp/corona.jar
CMD [ "java", "-jar", "/tmp/corona.jar", "&" ]

