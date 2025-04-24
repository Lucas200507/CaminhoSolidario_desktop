CREATE DATABASE caminho_solidario;
USE caminho_solidario;

CREATE TABLE pessoa(
idPessoa INT PRIMARY KEY AUTO_INCREMENT,
nome_completo VARCHAR(100) NOT NULL,
cpf VARCHAR(12) NOT NULL,
telefone VARCHAR(12) NOT NULL);

SELECT * FROM pessoa;


-- -------------------------------------------------------------------------------------------

CREATE TABLE adm(
idAdm INT PRIMARY KEY AUTO_INCREMENT,
email_adm VARCHAR(50) not null,
senha_adm VARCHAR(45) NOT NULL,
idPessoa INT,
FOREIGN KEY (idPessoa) REFERENCES pessoa (idPessoa));


-- ALTERAR O NOME EMAIL PARA email_adm
SELECT * FROM adm;

-- -------------------------------------------------------------------------------------------

CREATE TABLE voluntario(
idVoluntarios INT PRIMARY KEY AUTO_INCREMENT,
email_voluntario VARCHAR(50) not null,
senha_voluntario VARCHAR(50) NOT NULL,
idPessoa INT,
FOREIGN KEY (idPessoa) REFERENCES pessoa (idPessoa));

INSERT INTO voluntario(email_voluntario,senha_voluntario,idPessoa) VALUES("joaogomes@gmail.com","123",1);

SELECT * FROM voluntario;
DELETE FROM voluntario WHERE idVoluntarios = 8;
-- PARTE DO USUARIO/BENEFICIARIO

CREATE VIEW tbVoluntario AS
SELECT
v.idVoluntarios AS ID,
p.nome_completo AS voluntario,
v.email_voluntario AS email,
v.senha_voluntario AS senha
FROM voluntario v
INNER JOIN pessoa p ON p.idPessoa = v.idPessoa;

SELECT * FROM tbVoluntario;
-- -------------------------------------------------------------------------------------------
	CREATE TABLE funcao(
    idFuncao INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(25) NOT NULL,
    email VARCHAR(60) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    idPessoa INT REFERENCES pessoa (idPessoa),
    FOREIGN KEY (idPessoa) REFERENCES pessoa (idPessoa));
    
    SELECT * FROM funcao;
        
    INSERT INTO funcao(tipo,email,senha,idPessoa) VALUES("Voluntário","joaogomes@gmail.com","123",1);
    
    CREATE VIEW tbFuncao AS 
    SELECT 
    f.idFuncao AS ID,
    f.tipo AS funcao,
    p.nome_completo AS nome,
    f.email
    FROM funcao f
    inner join pessoa p ON p.idPessoa = f.idPessoa;
    
    SELECT * FROM tbFuncao;
    
    
    
    


-- -------------------------------------------------------------------------------------------
CREATE TABLE endereco(
idEndereco INT PRIMARY KEY AUTO_INCREMENT,
endereco VARCHAR(50) not null,
bairro VARCHAR(50),
cidade VARCHAR(50) not null,
cep VARCHAR(8) NOT NULL,
situacao_moradio CHAR(1) NOT NULL,
valor_aluguel FLOAT(10));

SELECT * FROM endereco;

-- -------------------------------------------------------------------------------------------

CREATE TABLE filho_dependente(
idFilho_Dependente INT PRIMARY KEY AUTO_INCREMENT,
nome_filho_dependente VARCHAR(50),
data_nascimento_filho_dep DATE,
parentesco VARCHAR(10),
pcd CHAR(1));

SELECT * FROM filho_dependente;

-- -------------------------------------------------------------------------------------------

Create TABLE BeneficioGov(
idBeneficioGov INT PRIMARY KEY AUTO_INCREMENT,
possui_beneficio CHAR(1) NOT NULL,
nome_beneficio_gov VARCHAR(20),
valor_beneficio FLOAT(10));

SELECT * FROM BeneficioGov;

-- -------------------------------------------------------------------------------------------

CREATE TABLE Usuario(
idUsuario INT PRIMARY KEY AUTO_INCREMENT,
data_nascimento_usuario DATE NOT NULL,
estado_civil CHAR(1) NOT NULL,
renda_familiar FLOAT(10),
idPessoa INT,
FOREIGN KEY (idPessoa) REFERENCES pessoa (idPessoa),
idFilho_Dependente INT,
FOREIGN KEY (idFilho_Dependente) REFERENCES filho_dependente (idFilho_Dependente),
idEndereco INT,
FOREIGN KEY (idEndereco) REFERENCES endereco (idEndereco),
idBeneficioGov INT,
FOREIGN KEY (idBeneficioGov) REFERENCES BeneficioGov (idBeneficioGov));

SELECT * FROM Usuario;

-- -------------------------------------------------------------------------------------------

CREATE TABLE beneficio(
idBeneficio INT PRIMARY KEY AUTO_INCREMENT,
data_cadastro DATE not null,
data_entrada DATE,
data_saida DATE,
prorrogacao CHAR(1),
duracao VARCHAR(10),
situacao_beneficio CHAR(1) NOT NULL,
idUsuario INT, 
FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario));

SELECT * FROM beneficio;



