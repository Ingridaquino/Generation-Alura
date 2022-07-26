
CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;


CREATE TABLE tb_categoria (
	id BIGINT AUTO_INCREMENT,
    categoria VARCHAR(255),
    quantidade INT,
    PRIMARY KEY (id)
);


CREATE TABLE  tb_produtos (
	id BIGINT AUTO_INCREMENT,
    produto VARCHAR(255),
    marca VARCHAR (255),
    tamanho DOUBLE,
	preco DOUBLE,
    PRIMARY KEY (id),
    produtos_id BIGINT,
	FOREIGN KEY (produtos_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria (categoria, quantidade) VALUES ('Cosmetico', 100);
INSERT INTO tb_categoria (categoria, quantidade) VALUES ('Medicamentos', 900);
INSERT INTO tb_categoria (categoria, quantidade) VALUES ('Higiene', 260);
INSERT INTO tb_categoria (categoria, quantidade) VALUES ('Saude', 400);
INSERT INTO tb_categoria (categoria, quantidade) VALUES ('Beleza', 568);

INSERT INTO  tb_produtos (produto, marca, tamanho,preco, produtos_id) VALUES ('Butilbrometo', 'Buscopan', 30 , 20.60, 2);
INSERT INTO  tb_produtos (produto, marca, tamanho,preco, produtos_id) VALUES ('Protetor solar', 'Neutrogena', 40, 39.99, 1);
INSERT INTO  tb_produtos (produto, marca, tamanho,preco, produtos_id) VALUES ('Suplemento', 'Attivs', 30, 89.9, 4);
INSERT INTO  tb_produtos (produto, marca, tamanho,preco, produtos_id) VALUES ('Preservativos', 'Produnce', 12, 27.99, 3);
INSERT INTO  tb_produtos (produto, marca, tamanho,preco, produtos_id) VALUES ('Ivermectina', 'EMS', 4, 8.99, 2);
INSERT INTO  tb_produtos (produto, marca, tamanho,preco, produtos_id) VALUES ('Shampoo', 'Pantene', 300, 22.0, 3);
INSERT INTO  tb_produtos (produto, marca, tamanho,preco, produtos_id) VALUES ('Esmalte', 'Risque', 10, 6.98, 4);
INSERT INTO  tb_produtos (produto, marca, tamanho,preco, produtos_id) VALUES ('Creme de cabelo', 'Skala', 1, 7.67, 4);

SELECT * FROM tb_categoria;
SELECT * FROM tb_produtos;

SELECT * FROM  tb_produtos WHERE preco > 50.0;
SELECT * FROM  tb_produtos WHERE preco BETWEEN 5 AND 60;

SELECT * FROM  tb_produtos WHERE  tb_produtos.produto LIKE 'C%';

SELECT * FROM tb_produtos INNER JOIN tb_categoria ON tb_categoria.id =  tb_produtos.produtos_id;

SELECT tb_produtos.produto, tb_produtos.marca, tb_categoria.categoria
FROM tb_produtos INNER JOIN tb_categoria ON tb_categoria.id = tb_produtos.produtos_id 
and tb_categoria.categoria LIKE 'Cosmetico%';