# spring-design-pattern
Small project to test and train design patterns such as Singleton, Strategy/Repository and Facade using the Spring framework.

The project creates and populates a user's home address using ViaCep API,

This project is part of the GFT Java and AWS Developer bootcamp project challenges at Digital Innovation One.
https://web.digitalinnovation.one/track/gft-java-aws-developer


## ENDPOINTS:

#### User:


`GET /user` - List everyone currently in the database.

`GET /user/{id}` - List a single person by the id. *Example* - www.mywebsite.com//user/79

`POST /user` - Create a new person using the request body.

`DELETE /user/{id}` - Delete a existing person by the person id. *Example* - www.mywebsite.com/user/32

`PUT /user/{id}` - Update a existing person using the request body and person id. *Example* - www.mywebsite.com/user/78
