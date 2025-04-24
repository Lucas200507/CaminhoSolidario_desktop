USE caminho_solidario;

CREATE TABLE espera_voluntario(
	id_esperaVol INT PRIMARY KEY AUTO_INCREMENT,
    cpf VARCHAR(12) NOT NULL,
    nome_completo VARCHAR(60) NOT NULL,
    email VARCHAR(45) NOT NULL,
    telefone VARCHAR(12) not null,
    data_pedido DATE,
    id_enderecoV INT,
    FOREIGN KEY (id_enderecoV) REFERENCES endereco_voluntario (id_enderecoV)
);

DROP TABLE espera_voluntario;

CREATE TABLE endereco_voluntario(
id_enderecoV INT PRIMARY KEY AUTO_INCREMENT,
cep VARCHAR(9),
cidade VARCHAR(45),
bairro VARCHAR(45),
endereco VARCHAR(45)
);

SELECT * FROM pessoa;

