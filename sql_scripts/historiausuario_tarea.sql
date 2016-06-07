/**
 * Author:  Nicole
 * Created: Jun 7, 2016
 */

ALTER TABLE `sis2`.`tarea` 
ADD COLUMN `historiaUsuarioId` INT NULL AFTER `descripcion`,
ADD INDEX `historiaUsuario_idx` (`historiaUsuarioId` ASC);
ALTER TABLE `sis2`.`tarea` 
ADD CONSTRAINT `historiaUsuario`
  FOREIGN KEY (`historiaUsuarioId`)
  REFERENCES `sis2`.`historiadeusuario` (`idhistoriadeusuario`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;