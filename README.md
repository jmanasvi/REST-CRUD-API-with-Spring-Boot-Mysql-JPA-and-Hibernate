# REST-CRUD-API-with-Spring-Boot-Mysql-JPA-and-Hibernate
To Do List web application using Spring Boot


<h3>Tools and Technologies used</h3>

Java<br>
Spring boot 2.5.3<br>
MySQL<br>
JPA<br>
Hibernate<br>
Maven<br>
Spring Tool Suite4<br>
PostMan 8.10.0<br>


<h3>To build and run the sample from a fresh clone of this repo:</h3>

- Configure MySQL
Create a database in your MySQL instance.
Update the application.properties file in the src/main/resources folder with the URL, username and password for your MySQL instance. The table schema for the Todo objects will be created for you in the database.

<h3>Build and run the sample</h3>

Open a web browser to http://localhost:8080

<h3>Explore Rest APIs</h3>
The app defines following CRUD APIs.

GET /tasks

POST /tasks

GET /tasks/{taskId}

PUT /tasks

DELETE /tasks/{taskId}
