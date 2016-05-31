CREATE TABLE `sis2`.`historiadeusuario` (
  `idhistoriadeusuario` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NULL,
  `descripcion` VARCHAR(200) NULL,
  `criteriosAceptacion` VARCHAR(200) NULL,
  `complejidad` INT NULL,
  `prioridad` INT NULL,
  PRIMARY KEY (`idhistoriadeusuario`));
