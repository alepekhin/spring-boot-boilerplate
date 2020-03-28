# spring-boot-boilerplate

Typically we use SpringBoot as API provider.  
If so we need swagger to build API documentation.  
In most cases we need spring security.  
For building the application as micro service we need Dokerfile.  
For testing we would like to use the latest jUpiter (jUnit 5).  
After tests we want to see test coverage...   
So we have to add a lot of other features to the project except spring-boot itself.  
And I forgot about health check - it is the same for many projects.  
So it is good to have it too.

## Project goal

Facilitate writing SpringBoot micro services from scratch.  
Project contains swagger, spring security, healthcheck endpoint,  
jUpiter for tests and jacoco plugin for test coverage.

## How to run

- After cloning the project execute in command line  
```
mvn spring-boot:run
```
- Open browser at  
```
http://localhost:8080/boilerplate/swagger-ui.html  
```

Also you can build docker image with
```
sh docker-build.sh
```
and run it as
```
sh docker-run.sh
```
