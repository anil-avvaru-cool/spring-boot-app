## Front controller
Behind the scenes, Spring creates a front controller
also called DispatcherServlet.

It sees all the @RequestMapping annotations and maps to corresponding 
controllers

## @RestController
- @RestController Returns data
- @Controller returns UI and data
- Every controller is a servlet behind the scenes.

## Jackson library 
 - json to java object serialization

## @Configuration
To set class as configuration class

## @RequestBody
Decorate parameter to deserialize into object.

## @PathVariable
Decorate parameter as primitive data type like int.

## @CrossOrigin
Provide @CrossOrigin attribute at controller level
to resolve CORS error
