@Java JPA and PostgreSQL Project


This project demonstrates how to use Java Persistence API (JPA) with PostgreSQL. It includes a set of SQL scripts to create and populate tables, and it uses Postman for testing the API endpoints.


1)Table of Contents:

•	Getting Started

•	Prerequisites

•	Installation

•	Running the Application

•	Database Schema

•	API Endpoints

•	Sample Data

•	Queries

•	Contributing

•	License



2)Getting Started:

These instructions will help you set up and run the project on your local machine for development and testing purposes.


3)Prerequisites:

Java Development Kit (JDK) 11 or higher

PostgreSQL

Maven

Postman

4)Installation:


A)Clone the repository:

git clone https://github.com/Julkar1/java_api_request.git

cd src/main/java/com/jtfc/app



B)Set up PostgreSQL:

Create a new database in PostgreSQL.

C)Update the application.properties file with your PostgreSQL database credentials.


D)Build the project:

mvn clean install



5)Running the Application


1.Start the application:

mvn spring-boot:run



2.Use Postman to test the API endpoints.




6)Database Schema

The project includes the following tables:

person

owns

car

log

accident





7)SQL Script

CREATE TABLE person (
nid varchar(255) PRIMARY KEY,
name varchar(255), 
address varchar(255)
);

CREATE TABLE owns (
nid varchar(10), 
licence varchar(10) PRIMARY KEY, 
FOREIGN KEY(nid) REFERENCES person(nid)
);

CREATE TABLE car (
licence varchar(10),
year NUMERIC(5),
model varchar(10),
FOREIGN KEY(licence) REFERENCES owns(licence)
);

CREATE TABLE log (
licence varchar(10),
log_date DATE PRIMARY KEY,
driver varchar(10),
FOREIGN KEY(licence) REFERENCES owns(licence)
);

CREATE TABLE accident (
acc_date DATE,
driver varchar(10),
ammount NUMERIC(10),
FOREIGN KEY(acc_date) REFERENCES log(log_date)
);




8)API Endpoints


GET /person

GET /owns

GET /car

GET /log

GET /accident



9)Sample Data:



INSERT INTO person VALUES ('123451', 'Arif', 'Rajshahi') ;
INSERT INTO person VALUES ('123452', 'Sumon', 'Maynamati'); 
INSERT INTO person VALUES ('123453', 'Sagor', 'Sirajgang'); 
INSERT INTO person VALUES ('123454', 'Abdul', 'Rajshahi') ;
INSERT INTO person VALUES ('123455', 'Himesh', 'Dhaka') ;
INSERT INTO person VALUES ('123456', 'Amirul', 'Sylhet') ;
INSERT INTO person VALUES ('123457', 'Sajib', 'Chittagong');


INSERT INTO owns VALUES ('123451','11-3000') ;
INSERT INTO owns VALUES ('123452','12-4000') ;
INSERT INTO owns VALUES ('123453','12-5000') ;
INSERT INTO owns VALUES ('123454','11-5000') ;
INSERT INTO owns VALUES ('123455','11-6000') ;
INSERT INTO owns VALUES ('123456','12-6000') ;
INSERT INTO owns VALUES ('123457','12-3000');

INSERT INTO car VALUES ('12-3000', 2012, 'Axio');
INSERT INTO car VALUES ('11-3000', 2008, 'Corolla') ;
INSERT INTO car VALUES ('12-4000', 2013, 'Axio') ;
INSERT INTO car VALUES ('12-5000', 2013, 'Premio'); 
INSERT INTO car VALUES ('11-5000', 2010, 'Nano') ;
INSERT INTO car VALUES ('11-6000', 2011, 'Alto') ;
INSERT INTO car VALUES ('12-6000', 2015, 'Nano Twist');

INSERT INTO log VALUES ('11-3000', '12-Jan-13', 'Arif'); 
INSERT INTO log VALUES ('12-4000', '25-Sep-15', 'Komol'); 
INSERT INTO log VALUES ('11-6000', '20-Jun-14', 'Bahadur'); 
INSERT INTO log VALUES ('11-5000', '20-Dec-11', 'Abdul') ;
INSERT INTO log VALUES ('12-6000', '19-Sep-15', 'Akter') ;
INSERT INTO log VALUES ('11-3000', '15-May-13', 'Arif') ;
INSERT INTO log VALUES ('11-3000', '20-Aug-14', 'Arif');

INSERT INTO accident VALUES ('12-Jan-13', 'Arif', 10000); 
INSERT INTO accident VALUES ('25-Sep-15', 'Komol', 12000); 
INSERT INTO accident VALUES ('20-Jun-14', 'Bahadur', 11000); 
INSERT INTO accident VALUES ('20-Dec-11', 'Abdul', 8000) ;
INSERT INTO accident VALUES ('19-Sep-15', 'Akter', 70000);
INSERT INTO accident VALUES ('15-May-13', 'Arif', 2000) ;
INSERT INTO accident VALUES ('20-Aug-14', 'Arif', 15000);




10)Queries:



/*(b)*/SELECT name FROM PERSON WHERE address= 'Rajshahi';

/*(c)*/SELECT model FROM CAR WHERE YEAR= '2013';

/*(d)*/SELECT ma.driver FROM LOG ml, ACCIDENT ma WHERE ml.log_date= ma.acc_date AND ammount BETWEEN 10000 AND 15000;

/*(e)*/SELECT mo.nid FROM OWNS mo, CAR mc WHERE mo.licence= mc.licence AND MODEL = 'Axio';

/*(f)*/SELECT name, address FROM PERSON mp, OWNS mo, CAR mc WHERE mp.nid= mo.nid AND mo.licence= mc.licence AND model= 'Alto';

/*(g)*/SELECT driver FROM LOG WHERE log_date= '20-Dec-11';

/*(h)*/SELECT name FROM PERSON mp, OWNS mo WHERE mp.nid= mo.nid AND licence= '12-4000';

/*(i)*/SELECT DISTINCT name FROM PERSON mp, OWNS mo, LOG ml WHERE mp.nid= mo.nid AND mo.licence= ml.licence AND driver= 'Arif';

/*(j)*/SELECT model FROM OWNS mo, CAR mc, LOG ml, ACCIDENT ma WHERE mo.licence= mc.licence AND mo.licence= ml.licence AND ml.log_date= ma.acc_date AND acc_date= '19-Sep-15';

/*(k)*/SELECT COUNT(*) AS NUMERIC_of_accidents FROM ACCIDENT WHERE driver= 'Arif' ;

/*(l)*/SELECT acc_date FROM PERSON mp, OWNS mo, LOG ml, ACCIDENT ma WHERE mp.nid= mo.nid AND mo.licence= ml.licence AND ml.log_date= ma.acc_date AND name= 'Arif';

/*(m)*/UPDATE PERSON SET address= 'Natore' WHERE name= 'Arif';
