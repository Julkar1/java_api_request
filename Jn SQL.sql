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

SELECT * FROM person; 
SELECT * FROM owns; 
SELECT * FROM car ;
SELECT * FROM log ;
SELECT * FROM accident; 

INSERT INTO person VALUES ('123451', 'Arif', 'Rajshahi') ;
INSERT INTO person VALUES ('123452', 'Sumon', 'Maynamati'); 
INSERT INTO person VALUES ('123453', 'Sagor', 'Sirajgang'); 
INSERT INTO person VALUES ('123454', 'Abdul', 'Rajshahi') ;
INSERT INTO person VALUES ('123455', 'Himesh', 'Dhaka') ;
INSERT INTO person VALUES ('123456', 'Amirul', 'Sylhet') ;
INSERT INTO person VALUES ('123457', 'Sajib', 'Chittagong');/*Programer Madhome dite hobe*/

INSERT INTO owns VALUES ('11-3000','123451');
INSERT INTO owns VALUES ('12-4000','123452');
INSERT INTO owns VALUES ('12-5000','123453');
INSERT INTO owns VALUES ('11-5000','123454');
INSERT INTO owns VALUES ('11-6000','123455');
INSERT INTO owns VALUES ('12-6000','123456');
INSERT INTO owns VALUES ('12-3000','123457');
/*Programer Madhome dite hobe*/

INSERT INTO car VALUES ('12-3000', 'Axio',2012);/*Programer Madhome dite hobe*/
INSERT INTO car VALUES ('11-3000', 'Corolla',2008) ;
INSERT INTO car VALUES ('12-4000', 'Axio',2013) ;
INSERT INTO car VALUES ('12-5000', 'Premio',2013); 
INSERT INTO car VALUES ('11-5000', 'Nano',2010) ;
INSERT INTO car VALUES ('11-6000', 'Alto',2011) ;
INSERT INTO car VALUES ('12-6000', 'Nano Twist',2015);

INSERT INTO log VALUES ( '12-Jan-13', 'Arif','11-3000'); 
INSERT INTO log VALUES ( '25-Sep-15', 'Komol','12-4000'); 
INSERT INTO log VALUES ( '20-Jun-14', 'Bahadur','11-6000'); 
INSERT INTO log VALUES ( '20-Dec-11', 'Abdul','11-5000');
INSERT INTO log VALUES ( '21-Sep-15', 'Akter','12-6000');
INSERT INTO log VALUES ( '15-May-13', 'Arif','11-3000');
INSERT INTO log VALUES ( '20-Aug-14', 'Arif','11-3000');    /*Programer Madhome dite hobe*/

INSERT INTO accident VALUES ('12-Jan-13', 10000,'Arif'); 
INSERT INTO accident VALUES ('25-Sep-15', 12000, 'Komol'); 
INSERT INTO accident VALUES ('20-Jun-14', 11000, 'Bahadur'); 
INSERT INTO accident VALUES ('20-Dec-11', 8000, 'Abdul') ;
INSERT INTO accident VALUES ('21-Sep-15', 70000, 'Akter');
INSERT INTO accident VALUES ('15-May-13', 2000, 'Arif') ;
INSERT INTO accident VALUES ('20-Aug-14', 15000, 'Arif');                /*Programer Madhome dite hobe*/

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