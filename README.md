# spring-boot-boilerplate

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
