# Spring Framework CRUD API

This is a spring boot framework learning repository based on the tutorial from [AmigoCode](https://amigoscode.com/p/spring-boot). 
It contains a simple API configured using spring boot. You are able to perform standard GET, PUT,
POST and DELETE request with this application against a Student  table setted up with PostgreSQL.

## Installation
1. Clone this repository from github to install: 

    ```bash
    git clone https://github.com/chunyuema/spring-boot-api.git
    ```
2. Download and set up [PostgreSQL](https://postgresapp.com/) locally
3. Open the project with IntelliJ
4. Run the Main class to start the server
5. You can also use the Maven build tool (Maven -> Install) from the IntelliJ to generate the jar file
    ```
    java -jar spring-boot-api-0.0.1-SNAPSHOT.jar  
    ```

## Testing
Use Postman to test the API
1. GET: 
   ```
   localhost:8080/api/v1/student/
   ```
2. POST: 
   ```
   localhost:8080/api/v1/student/ 
   ```
   with a request body as follows
   
   ```
   {
    "name": "alex",
    "email": "alex@gmail.com",
    "dob": "1995-12-17"
   }
    ```
3. DELETE: 
   ```
   localhost:8080/api/v1/student/{studentId}
   ```
4. PUT: 
   ```
   localhost:8080/api/v1/student/{studentId}?name={new_name}&email={new_email}
   ```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
