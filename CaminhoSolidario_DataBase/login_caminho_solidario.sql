USE caminho_solidario;
SELECT * FROM caminho_solidario.usuario;

CREATE TABLE login(
id_user INT PRIMARY KEY auto_increment,
cpf VARCHAR(11) NOT NULL,
senha VARCHAR(60) NOT NULL,
situacao CHAR(1) NOT NULL
);

INSERT INTO login(cpf, senha, situacao) VALUES ("12345678900", "123", "V"), ("12345678910", "123", "B");
SELECT * FROM login;


DELETE FROM login WHERE id_user IN (1, 2);


DELIMITER //
CREATE TRIGGER senha_login
BEFORE INSERT 
ON login FOR EACH ROW 
BEGIN
SET NEW.senha = UPPER(MD5(NEW.senha));
END 
//
DELIMITER ;



drop table login;