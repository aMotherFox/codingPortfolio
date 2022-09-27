Java DataBase Connect:
JDBX is a tool/application programming interface that establishes a connection between a standard Database and Java application, that intends to use that database

DTO makes it so only certain columns from database are returned
 i.e. database as name, username, email, phone number columns, you want to only return name & username for security reasons
 DTO connects with the network layer, not the database layer
 DTO to entity converter is in CONTROLLER level
 DTO = data transfer object
 order is a class (PROPER DEFINITION)
 class is the empty template for an object
 object is an instance of a class
 model another word for class, models have FIELDS
 every class that you want to instanciate should be a model
 entity is a model, specifically usually a model that is representation of a table
 will not always be completely identical to the table (i.e firstName in java vs first_name in database)
 pojo = Plain Old Java Object
 pojo is a model
 used to have to do mapping yourself
 pojo was a step to instanciate objects you had to map yourself
 pojo isn't used very much, now we use DTO
 DTOs used mostly for creating a model that is not an entity;
 when you have an entity tht doesn't have all the fields you want,


when creating models named after a table, name it the same thing