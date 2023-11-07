-- create
CREATE TABLE EMPLOYEE (
  empId INTEGER PRIMARY KEY AUTO_INCREMENT,
  name TEXT NOT NULL,
  dept TEXT NOT NULL
);
 
-- insert
INSERT INTO EMPLOYEE (name, dept) VALUES ('Vasia', 'Sales');
INSERT INTO EMPLOYEE (name, dept) VALUES ('Dave', 'Accounting');
INSERT INTO EMPLOYEE (name, dept) VALUES ('Ava', 'Sales');
INSERT INTO EMPLOYEE (name, dept) VALUES ('Chris', 'Sales');
INSERT INTO EMPLOYEE (name, dept) VALUES ('Deb', 'Sales');
INSERT INTO EMPLOYEE (name, dept) VALUES ('David', 'Sales');
INSERT INTO EMPLOYEE (name, dept) VALUES ('Tom', 'Sales');
INSERT INTO EMPLOYEE (name, dept) VALUES ('Jerry', 'Sales');
 
-- fetch 
SELECT name FROM EMPLOYEE WHERE dept = 'Sales' AND empId > 4 AND name LIKE '%d%';