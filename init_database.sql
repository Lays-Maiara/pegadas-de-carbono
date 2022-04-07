-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema pi_carbon
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pi_carbon
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `poo`;
USE `poo` ;

-- -----------------------------------------------------
-- Table `pi_carbon`.`colaborador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`colaborador` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NOT NULL,
  `endereco` VARCHAR(50) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `cargo` VARCHAR(20) NOT NULL,
  `salario` DECIMAL(6,2) NOT NULL,
  `telefone` VARCHAR(12) NOT NULL,
  `cnhB` CHAR(1) NOT NULL,
  PRIMARY KEY (`id`));


-- -----------------------------------------------------
-- Table `pi_carbon`.`veiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`veiculo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `placa` VARCHAR(7) NULL DEFAULT NULL,
  `modelo` VARCHAR(50) NOT NULL,
  `veiculoDisponivel` CHAR(1) NOT NULL,
  `consumoKmLitro` VARCHAR(10) NOT NULL,
  `ano` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`));


-- -----------------------------------------------------
-- Table `pi_carbon`.`chamado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `poo`.`chamado` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dataChamado` DATE NOT NULL,
  `enderecoAtendimento` VARCHAR(150) NOT NULL,
  `distanciaPercorrida` INT NOT NULL,
  `colaborador` INT NOT NULL,
  `veiculo` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`colaborador`) REFERENCES `poo`.`colaborador` (`id`),
  FOREIGN KEY (`veiculo`) REFERENCES `poo`.`veiculo` (`id`));

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
