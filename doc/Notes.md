

## Pom
Project object model

## Version management in Pom file
Do not put versions in the pom file, let maven manage compatible versions

## Run app command line

````batch
 ./mvnw.cmd spring-boot:run
````
## Add maven dependencies
alt insert to get context menu.

## optional dependency tag in pom 
It is not part of prod deployment.

## Pull config values
````java
import org.springframework.beans.factory.annotation.Value;

@Value("${spring.application.name}")
    private String appName;
````
## Bean~~~~
Bean is a regular Java object that is manged by a spring

## Spring framework without spring boot
- spring.xml file to configure beans, dependencies, autowire etc
- No annotations in class

## war file
Web archive
## Spring boot
Convention over configuration

## Annotations
- @Component
- @Service - Service is just an alias for component
- @Repository
- @Controller
- @Autowired 
   - Inject chain of dependencies
   - To select specific constructor

- @Qualifier("InstanceName")
  - Used to select instance name when multiple classes implement same 
    interface
 
  
- @Primary
 - Used to have preference when multiple classes are implement same
   interface

  Example: Dog Class->Animal class
  If you ask a class of dog then @Autowire will get 

## Dependency injection
- Constructor injection
- Setter injection
- The Spring IOC Container
- Configuring beans using annotations
- Controlling Bean selection
- Externalizing configuration
- Configuring beans using code
- Lazy Initialization
- Bean scopes
- Bean lifecycle methods











