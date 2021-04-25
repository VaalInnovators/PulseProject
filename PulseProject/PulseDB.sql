-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema pulsedb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pulsedb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `pulsedb` DEFAULT CHARACTER SET utf8mb4 ;
USE `pulsedb` ;

-- -----------------------------------------------------
-- Table `pulsedb`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pulsedb`.`employee` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `Employee_Name` VARCHAR(50) NULL DEFAULT NULL,
  `Employee_Surname` VARCHAR(50) NULL DEFAULT NULL,
  `Employee_Type_No` INT(11) NULL DEFAULT NULL,
  `Email_Address` VARCHAR(50) NULL DEFAULT NULL,
  `Password` VARCHAR(50) NULL DEFAULT NULL,
  `Employee_Date` VARCHAR(50) NULL DEFAULT NULL,
  `System_Date` VARCHAR(50) NULL DEFAULT NULL,
  `Phone_Number` VARCHAR(50) NULL DEFAULT NULL,
  `Street_Address` VARCHAR(50) NULL DEFAULT NULL,
  `Street_Name` VARCHAR(50) NULL DEFAULT NULL,
  `Suburb` VARCHAR(50) NULL DEFAULT NULL,
  `City` VARCHAR(50) NULL DEFAULT NULL,
  `ZIp_Code` INT(11) NULL DEFAULT NULL,
  `Entity_No` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pulsedb`.`employee_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pulsedb`.`employee_type` (
  `employee_type_no` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `employee_type_date` DATETIME NOT NULL,
  `employee_type_name` VARCHAR(255) NOT NULL,
  `system_date` DATETIME NOT NULL,
  PRIMARY KEY (`employee_type_no`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pulsedb`.`financial_operation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pulsedb`.`financial_operation` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `financial_operation_description` VARCHAR(250) NOT NULL,
  `financial_operation_financed` VARCHAR(250) NOT NULL,
  `financial_operation_responsible_official` VARCHAR(250) NOT NULL,
  `financial_operation_comments` VARCHAR(250) NOT NULL,
  `financial_operation_action_who` VARCHAR(250) NOT NULL,
  `financial_operation_action_when` VARCHAR(250) NOT NULL,
  `financial_operation_action_output` VARCHAR(250) NOT NULL,
  `financial_operation_date` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pulsedb`.`governance_structure`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pulsedb`.`governance_structure` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `GovernanceStructure_Name` VARCHAR(50) NULL DEFAULT NULL,
  `GovernanceStructure_Avaible` VARCHAR(50) NULL DEFAULT NULL,
  `GovernanceStructure_FullyFunctional` VARCHAR(50) NULL DEFAULT NULL,
  `GovernanceStructure_ResponsiblePerson` VARCHAR(50) NULL DEFAULT NULL,
  `GovernanceStructure_Comments` VARCHAR(50) NULL DEFAULT NULL,
  `GovernanceStructureAction_Who` VARCHAR(50) NULL DEFAULT NULL,
  `GovernanceStructureAction_When` VARCHAR(50) NULL DEFAULT NULL,
  `GovernanceStructureAction_Output` VARCHAR(50) NULL DEFAULT NULL,
  `GovernanceStructure_Date` VARCHAR(50) NULL DEFAULT NULL,
  `governance_structure_action_output` VARCHAR(255) NULL DEFAULT NULL,
  `governance_structure_action_when` VARCHAR(255) NULL DEFAULT NULL,
  `governance_structure_action_who` VARCHAR(255) NULL DEFAULT NULL,
  `governance_structure_avaible` VARCHAR(255) NULL DEFAULT NULL,
  `governance_structure_comments` VARCHAR(255) NULL DEFAULT NULL,
  `governance_structure_date` VARCHAR(255) NULL DEFAULT NULL,
  `governance_structure_fully_functional` VARCHAR(255) NULL DEFAULT NULL,
  `governance_structure_name` VARCHAR(255) NULL DEFAULT NULL,
  `governance_structure_responsible_person` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pulsedb`.`hibernate_sequence`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pulsedb`.`hibernate_sequence` (
  `next_val` BIGINT(20) NULL DEFAULT NULL)
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `pulsedb`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pulsedb`.`login` (
  `login_id` INT(11) NOT NULL,
  `created_date` VARCHAR(255) NULL DEFAULT NULL,
  `password` VARCHAR(255) NULL DEFAULT NULL,
  `username` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`login_id`))
ENGINE = MyISAM
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
