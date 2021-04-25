Create Table Employee
(
    id int NOT NULL AUTO_INCREMENT,
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
    Entity_No int,
     PRIMARY Key (id)
);

Create Table Governance_Structure
(
    id int NOT NULL AUTO_INCREMENT,
    GovernanceStructure_Name varchar(50),
    GovernanceStructure_Avaible varchar(50),
    GovernanceStructure_FullyFunctional varchar(50),
    GovernanceStructure_ResponsiblePerson varchar(50),
    GovernanceStructure_Comments varchar(50),
    GovernanceStructureAction_Who varchar(50),
    GovernanceStructureAction_When varchar(50),
    GovernanceStructureAction_Output varchar(50),
    GovernanceStructure_Date varchar(50),
     PRIMARY Key (id)
);

CREATE TABLE FINANCIAL_OPERATION (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  financial_operation_description VARCHAR(250) NOT NULL,
  financial_operation_financed VARCHAR(250) NOT NULL,
  financial_operation_responsible_official VARCHAR(250) NOT NULL,
  financial_operation_comments VARCHAR(250) NOT NULL,
  financial_operation_action_who VARCHAR(250) NOT NULL,
  financial_operation_action_when VARCHAR(250) NOT NULL,
  financial_operation_action_output VARCHAR(250) NOT NULL,
  financial_operation_date VARCHAR(250) NOT NULL
);