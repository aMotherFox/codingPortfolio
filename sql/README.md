DATABASES:

- Databases run on their own servers so the port number will be different, it's whole purpose is so hold onto data, IF the database or server gets turned off/on, the data will still be there
- APPLICATIONS (full stack application, full stack is whenever you do all part of the application)
- backend apps ALWAYS need a database
- an application is anything that runs code is an application (ui, backend, database)
- A database is a box; the box is the database name; in the box, you can have many containers; each container is a TABLE; each table is what's holding all the items
- TABLES ARE LIKE SPREADSHEETS; COLUMNS AND ROWS
- _____=# on the terminal is WHT DATABASE WE ARE IN
Database -> table
PROVIDERS: companies that provide you databases:
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
- -SQL = structured query language
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
cntrl c (^c) -- cancels line of code
 \d+ table_name --shows constraints of the table

-- *************everything above is specifically postgres**********************

-- ***** CREATE DATABASE ******
CREATE DATABASE insertname; --NEEDS THE SEMICOLON

-- ***** DELETE DATABASE ******
DROP DATABASE insertname --deletes database, NEEDS SEMICOLON... drops are PERMEDENT

-- ***** CREATING AND SEEING TABLE ******
CREATE TABLE person (first_name VARCHAR(255) NOT NULL, last_name varchar(255) NOT NULL, age integer NOT NULL, is_happy bool); --example of making table
SELECT * FROM insertname; --how we see all columns inside the table, can target fields instead of *, can set requirements (i.e. SELECT * FROM "person" WHERE age > 20;)
SELECT * FROM "person" WHERE _____ --one way to set parameters for only returning certain data
-- EXAMPLE: SELECT * FROM "person" WHERE is_happy IS NULL; , SELECT * FROM "person" WHERE is_happy IS NOT NULL;
-- EXAMPLE: SELECT * FROM "person" WHERE first_name = 'Emre';

-- ***** ADDING ROWS TO TABLE ******
INSERT INTO  name (field names) VALUES (actual data) --add a row in the table
-- EXAMPLE: INSERT INTO person (first_name, last_name, is_happy, age) VALUES ('Emre', 'Pruitt', true, 28);
INSERT INTO  name (field names) VALUES (actual data), (actual data), (actual data), etc --add multiple rows in the table with one command
-- EXAMPLE: INSERT INTO person (first_name, last_name, is_happy, age) VALUES ('Emre', 'Pruitt', true, 28), ('Bucky', 'Pruitt', true, 3), ('Rocky', 'Pruitt', true, 7);
-- YOU CAN ENTER INFO OUT OF ORDER OF WHAT TABLE WAS CREATED AS SO LONG AS IT IS IN ORDER OF THE LISTED FIELDS IN YOUR CODE; IF YOU ARE NOT PUTTING FIELDS, VALUES MUST BE IN ORDER TO ORIGINAL ENTRY
-- EXAMPLE: created fields are ABCD, INSERT INTO ___ (B, C, A, D) VALUES (B, C, A, D)
-- EXAMPLE: created fields are ABCD, INSERT INTO ___ VALUES (A, B, C, D)

-- ***** UPDATING TABLE ******
-- ***** changing a row's value ******
UPDATE table_name SET column_name = insert_value WHERE condition;
-- EXAMPLE: UPDATE person SET is_happy = true WHERE first_name = 'Mika'; , UPDATE person SET first_name = 'Hankie' WHERE first_name = 'Hank';
-- You can update multiple column in one command
UPDATE table_name SET column_name = insert_value, column_name = insert_value, column_name = insert_value WHERE condition;
-- EXAMPLE: UPDATE person SET is_happy = true, age = 9.5 WHERE first_name = 'Hankie';

-- ***** DELETE FROM TABLE ******
DELETE FROM table_name WHERE condition;
-- This only delete ones row
-- EXAMPLE: DELETE FROM person WHERE first_name = 'Billy';
DELETE FROM table_name;
-- this deletes ALL rows but the table and parameters remain; the table scructure, attributes, and indexes will be left intact
-- ***** delete column ******
ALTER TABLE table_name DROP COLUMN column_name; -- HOW WE DELETE A COLUMN

-- ***** ALTER TABLE ******
-- ***** add new column to existing table ******
ALTER TABLE table_name ADD field DATATYPE NOT NULL/NULL; (example: ALTER TABLE person ADD ID INT NOT NULL;) -- HOW WE ADD A NEW COLUMN TO AN EXISTING TABLE
-- ***** rename column ******
ALTER TABLE table_name RENAME COLUMN old_name TO new_name;
-- example: ALTER TABLE person RENAME COLUMN is_happy TO is_hungry;
-- ***** rename column ******
ALTER TABLE table_name RENAME TO new_table_name; --How to rename the entire table

-- ***** USING MULTIPLE TABLES ******
-- ***** creating new table from info of an existing table ******
-- AS SELECT METHOD
CREATE TABLE table_name AS SELECT * FROM existing_table_name WHERE insert_parameter; --(example: CREATE TABLE breakfast_options AS SELECT * FROM menu WHERE paired_meal = 'breakfast';) 
-- SELECT INTO METHOD
SElECT fields INTO table_name FROM existing_table_name WHERE insert_parameter; -- (example: SELECT id, paired_meal, price INTO breakfast_options FROM menu WHERE paired_meal = 'breakfast';)
SELECT fields FROM table(s) WHERE condition ORDER BY field ASC/DESC 
```

- MAKING A TABLE:
-first column should be id and assigned SERIAL PRIMARY KEY (serial is a data type, makes it an INT and each addition -> +1)
-if you want to use a keyword as a name (i.e. user) and must put it in " "

```sql CREATE TABLE order (id SERIAL NOT NULL PRIMARY KEY, ordered_appetizer VARCHAR(255), ordered_entree VARCHAR(255));```