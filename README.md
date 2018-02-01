# REST Service to show a User in JSON format

## Problem Description 
A service which listens to incoming requests is needed. Upon receiving a request, it should pull a random user and return in JSON, the firstname, lastname as well as username.

## Construction
Spring project with Maven initialized. Dependencies such as "spring-boot-starter-web", "json", "spring-boot-maven-plugin" added. Then model "User" is created, with firstname, lastname and username. 

"JsonReader" class added, with static methods that take a URL and read JSON from it, build a String and put it into JSON object, then returns built JSON object.

"MyRESTController" class added to handle HTTP requests. It has a getUser() method that uses readJsonFromUrl() method from "JsonReader" class to get the JSON object and then takes firstname, lastname and username and assigns them accordingly to User object that we are working on. After it returns the User. 

Run the program and make a request "http://localhost:8080/api/request" and the User appears in JSON format with firstname, lastname, username printed. 

For more details see classes in com.example.demo and follow the javadoc comments provided. 



## Built With

* [Spring](https://spring.io/projects) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management



## Author
  * **Eduards Sergeyev** - *Developer* - [EduardsDev](https://github.com/EduardsDEV)


  
