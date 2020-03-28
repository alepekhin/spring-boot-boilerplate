FROM maven:3.5-jdk-8
RUN mkdir -p /opt/src  
RUN mkdir -p /opt/.git  
COPY src /opt/src  
COPY .git /opt/.git  
COPY pom.xml /opt  
WORKDIR /opt
RUN mvn clean package
EXPOSE 8080  
ENTRYPOINT ["java","-jar", "target/sbb-1.0.0.jar"]  

