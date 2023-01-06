-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema golfsocialdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `golfsocialdb` ;

-- -----------------------------------------------------
-- Schema golfsocialdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `golfsocialdb` DEFAULT CHARACTER SET utf8 ;
USE `golfsocialdb` ;

-- -----------------------------------------------------
-- Table `user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user` ;

CREATE TABLE IF NOT EXISTS `user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `course`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `course` ;

CREATE TABLE IF NOT EXISTS `course` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tournament`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tournament` ;

CREATE TABLE IF NOT EXISTS `tournament` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(250) NOT NULL,
  `team_max` SMALLINT(100) NULL,
  `entry_fee` INT NOT NULL,
  `purse` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS admin;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'admin' IDENTIFIED BY 'admin';

GRANT ALL ON * TO 'admin';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `user`
-- -----------------------------------------------------
START TRANSACTION;
USE `golfsocialdb`;
INSERT INTO `user` (`id`, `first_name`, `last_name`, `email`, `password`) VALUES (1, 'Ruben', 'Rocha', 'rubenarocha14@gmail.com', 'password');
INSERT INTO `user` (`id`, `first_name`, `last_name`, `email`, `password`) VALUES (2, 'Kate', 'Rocha', 'kate.clark.pm@gmail.com', 'password');
INSERT INTO `user` (`id`, `first_name`, `last_name`, `email`, `password`) VALUES (3, 'Luca', 'Rocha', 'luca.rocha@gmail.com', 'password');

COMMIT;


-- -----------------------------------------------------
-- Data for table `course`
-- -----------------------------------------------------
START TRANSACTION;
USE `golfsocialdb`;
INSERT INTO `course` (`id`, `name`) VALUES (1, 'City Park');

COMMIT;


-- -----------------------------------------------------
-- Data for table `tournament`
-- -----------------------------------------------------
START TRANSACTION;
USE `golfsocialdb`;
INSERT INTO `tournament` (`id`, `name`, `team_max`, `entry_fee`, `purse`) VALUES (1, 'Front Range Amatuer\'s Golf Tournament', 48, 200, 2500);

COMMIT;

