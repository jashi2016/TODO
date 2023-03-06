# TODO
Project : TODO Application
Frameworks/Tools and languages used
➡️ SpringBoot
➡️ Java
➡️ PostMan
➡️ H2 DataBase
Data flow in the project

Model : We have Single model here namely ToDo:
Controller : In Controller package the UserController is the gateWay to the API endpoints, Here we have provided many APIs perfrorm basic CRUD Operations on ToDo

To see Entire controller
https://github.com/jashi2016/TODO/tree/main/TODO/src/main/java/com/kiran/TODO/Controller

Services : All the operations linked with controller is been implemented with additional logics in service layer, service layer also interact with repository layer.

To see Entire Service
https://github.com/jashi2016/TODO/tree/main/TODO/src/main/java/com/kiran/TODO/Service

Repository : Repository layer interacts with Database(H2:DB) and persist the changes requested, We extend the JPA repository to get the predefined function. Here inside JPARespository Interface we have another Interface called CRUDRepo with provides us some of the preDefined methods
To see Entire Repository
https://github.com/jashi2016/TODO/tree/main/TODO/src/main/java/com/kiran/TODO/Repository

DataBase : Here i have used H2 : database. which is an in memory database stores all the data in RAM and as soon as program is re-run it refresh that memory as a result the data is lost.

Data Structure Used in Project
ArrayList
Project Summary
Project Result
➡️ : FindAll Todos : localhost:8081/api/v1/ToDo/findAll

➡️ : FindById Todos : localhost:8081/api/v1/ToDo/find/id/3

➡️ : Create Todo : localhost:8081/api/v1/ToDo/add

➡️ : Update Todo : localhost:8081/api/v1/ToDo/put/id/6

➡️ : Delete Todo : localhost:8081/api/v1/ToDo/delete/id/7
