DATABASES:

- Databases run on their own servers so the port number will be different, it's whole purpose is so hold onto data, IF the database or server gets turned off/on, the data will still be there
- APPLICATIONS (full stack application, full stack is whenever you do all part of the application)
- backend apps ALWAYS need a database
- an application is anything that runs code is an application (ui, backend, database)
- A database is a box; the box is the database name; in the box, you can have many containers; each container is a TABLE; each table is what's holding all the items
- _____=# on the terminal is WHT DATABASE WE ARE IN
Database -> table
PROVIDERS: comapnies that provide you databases:
    *Amazon (AWS)
    *IBM
    *Oracle
    *etc

- Many different relational database management systems:
AKA DATABASE TYPE
 *** i.e. what database are you using
- postqres
- mysql
- mongoDB
- sqLITE
- mariaDB
- etc
- All these databases use a language *basically* the same; sql
    -if you know how to write sql, you can write in any of these though they may differ slightly or have more/less features


- Things to learn in SQL:
-new language
-CRUD (create, read, update, delete)

- TERMINAL COMMANDS:
```bash
brew services #allows us to see files within our postgresql
brew services start postgresql #starts our server
brew services stop postgresql #stops our server
psql #lets us write in this lang, takes us to psql shell
createdb lunaraeve #makes a database, in this case lunaraeve like the PC user, database needs url, user, and password
```

- SQL COMMANDS:
```sql 
-- specifically in the postgres shell
-- backslash \ is specifically sql
\l -- gives us a list of databases (backslash L)
\q --quits postgres and takes us back to bash
\du -- shows all users
\c -- changes which database we are in
\dt --shows all tables
-- everything above is specifically postgres
CREATE DATABASE insertname; --NEEDS THE SEMICOLON
-- cntrl C can cancel a line of code
DROP DATABASE insertname --deletes database, NEEDS SEMICOLON... drops are PERMEDENT
CREATE TABLE person (first_name VARCHAR(255) NOT NULL, last_name varchar(255) NOT NULL, age integer NOT NULL, is_happy bool); --example of making table
SELECT * FROM insertname; --how we see inside the table
INSERT INTO  name (field names) VALUES (actual data) --add a row in the table
-- EXAMPLE: INSERT INTO person (first_name, last_name, is_happy, age) VALUES ('Emre', 'Pruitt', true, 28);
```