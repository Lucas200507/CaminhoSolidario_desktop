DELIMITER //
CREATE TRIGGER senha_Vadm
BEFORE INSERT 
ON funcao FOR EACH ROW 
BEGIN 
SET new.senha = UPPER(MD5(new.senha));
END
//

DELIMITER //
CREATE TRIGGER senha_adm
BEFORE INSERT 
ON adm FOR EACH ROW 

BEGIN 
SET new.senha_adm = UPPER(MD5(new.senha_adm));
END
//

DELIMITER //
CREATE TRIGGER senha_Vol
BEFORE INSERT 
ON voluntario FOR EACH ROW 

BEGIN 
SET new.senha_voluntario = UPPER(MD5(new.senha_voluntario));
END
//