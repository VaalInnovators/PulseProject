
DROP TABLE IF EXISTS Employee;
  
CREATE TABLE Employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
    Employee_Name varchar(50),
    Employee_Surname varchar(50),
    Employee_Type_No int,
    Email_Address varchar(50),
    Password varchar(50),
    Employee_Date varchar(50),
    System_Date varchar(50),
    Phone_Number varchar(50),
    Street_Address varchar(50),
    Street_Name varchar(50),
    Suburb varchar(50),
    City varchar(50),
    ZIp_Code int,
    Entity_No int
);

DROP TABLE IF EXISTS Login;
CREATE TABLE Login
(
    id INT AUTO_INCREMENT  PRIMARY KEY,
   Username varchar(50),
    Password varchar(50),
    CreatedDate varchar(50)
);