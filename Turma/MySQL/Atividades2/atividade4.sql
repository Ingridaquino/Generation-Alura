CREATE DATABASE db_cidade_dos_vegetais;

USE db_cidade_dos_vegetais;


CREATE TABLE tb_categoria (
	id BIGINT AUTO_INCREMENT,
    categoria VARCHAR(255),
	cidade VARCHAR (255),
    PRIMARY KEY (id)
);


CREATE TABLE  tb_produtos (
	id BIGINT AUTO_INCREMENT,
    produto VARCHAR(255),
	quantidade INT,
    tamanho DOUBLE,
	preco DOUBLE,
    PRIMARY KEY (id),
    produtos_id BIGINT,
	FOREIGN KEY (produtos_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria (categoria, cidade) VALUES ('Fruta', 'São Paulo');
INSERT INTO tb_categoria (categoria, cidade) VALUES ('Vegetal', 'Bahia');
INSERT INTO tb_categoria (categoria, cidade) VALUES ('Legumes', 'Minas Gerais');
INSERT INTO tb_categoria (categoria, cidade) VALUES ('Raizes', 'Rio de Janeiro' );
INSERT INTO tb_categoria (categoria, cidade) VALUES ('Bulgos', 'Goais');

INSERT INTO  tb_produtos (produto, quantidade, tamanho, preco, produtos_id) VALUES ('Laranja', 90, 2, 150.0, 1);
INSERT INTO  tb_produtos (produto, quantidade, tamanho, preco, produtos_id)  VALUES ('Repolho', 100, 3, 100.0, 2);
INSERT INTO  tb_produtos (produto, quantidade, tamanho, preco, produtos_id)  VALUES ('Cebola', 30, 3, 146.0, 5);
INSERT INTO  tb_produtos (produto, quantidade, tamanho, preco, produtos_id)  VALUES ('Maça', 20, 2, 20.0, 1);
INSERT INTO  tb_produtos (produto, quantidade, tamanho, preco, produtos_id)  VALUES ('Beterraba', 6, 4, 9.7, 3);
INSERT INTO  tb_produtos (produto, quantidade, tamanho, preco, produtos_id)  VALUES ('Cenoura', 900, 1, 155.0, 4);
INSERT INTO  tb_produtos (produto, quantidade, tamanho, preco, produtos_id) VALUES ('Brócolis', 189, 2, 200.0, 2);
INSERT INTO  tb_produtos (produto, quantidade, tamanho, preco, produtos_id)  VALUES ('Alho', 45, 1, 90.7, 4);

SELECT * FROM tb_categoria;
SELECT * FROM tb_produtos;

SELECT * FROM  tb_produtos WHERE preco > 50.0;
SELECT * FROM  tb_produtos WHERE preco BETWEEN 50 AND 150;

SELECT * FROM  tb_produtos WHERE  tb_produtos.produto LIKE 'C%';

SELECT * FROM tb_produtos INNER JOIN tb_categoria ON tb_categoria.id =  tb_produtos.produtos_id;

SELECT tb_produtos.produto, tb_categoria.categoria
FROM tb_produtos INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.produtos_id 
and tb_categoria.categoria LIKE 'Fruta%';