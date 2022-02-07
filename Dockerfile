#FROM java
#ADD ./target/myproject-0.0.1-SNAPSHOT.jar /myproject-0.0.1-SNAPSHOT.jar
#ADD ./run.sh /run.sh
#RUN chmod a+x /run.sh
#EXPOSE 8080:8080
#CMD /run.sh


ARG java_version
ARG maven_version

FROM maven:${maven_version}-openjdk-${java_version}-slim

COPY target/*.jar mywebapp.jar
ENTRYPOINT ["java","-jar","/mywebapp.jar"]
EXPOSE 9000
