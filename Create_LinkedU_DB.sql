--drop schema Project353 restrict;
DROP TABLE LINKEDU.ApplyInfo;
drop table LinkedU.LoginInfo;
drop table LinkedU.Users;
create table LinkedU.LoginInfo (
  UserID                    VARCHAR(25) NOT NULL,
  Password                  VARCHAR(50) NOT NULL
); 


create table LinkedU.Users (
  UserID                    VARCHAR(25) NOT NULL,
  FirstName                 VARCHAR(25) NOT NULL,
  LastName                  VARCHAR(25) NOT NULL,
  Email                     VARCHAR(50) NOT NULL,
  AccountType               VARCHAR(13) NOT NULL,
  SecurityQuestion          VARCHAR(50) NOT NULL,
  SecurityAnswer            VARCHAR(50) NOT NULL
);


CREATE TABLE LINKEDU.ApplyInfo(
University varchar(50) NOT NULL,
Major varchar(25) NOT NULL,
FirstName varchar(25) NOT NULL, 
LastName varchar(25) NOT NULL, 
Age varchar(25) NOT NULL, 
Sex varchar(50) NOT NULL, 
Citizenship varchar(35) NOT NULL, 
Street varchar(100) NOT NULL, 
Postal_Code varchar(50) NOT NULL,
City varchar(50) NOT NULL, 
Email varchar(35) NOT NULL, 
Phone varchar(100) NOT NULL, 
Info varchar(50) NOT NULL,
Exam varchar(50) NOT NULL, 
Score varchar(35) NOT NULL, 
High_school varchar(100) NOT NULL, 
High_School_Address varchar(50) NOT NULL,
High_School_Country varchar(50) NOT NULL);