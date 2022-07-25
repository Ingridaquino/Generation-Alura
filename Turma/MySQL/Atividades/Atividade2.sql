/* Crie um banco de dados para um e-commerce, onde o sistema trabalhará com as informações dos produtos deste e-commerce. 
Crie uma tabela de produtos e determine 5 atributos relevantes dos produtos para se trabalhar com o serviço deste e-commerce.
Insira nesta tabela no mínimo 8 dados (registros).
Faça um SELECT que retorne todes os produtos com o valor maior do que 500.
Faça um SELECT que retorne todes os produtos com o valor menor do que 500.
Ao término atualize um registro desta tabela através de uma query de atualização.
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, no repositório que você criou sobre Banco de dados.

*/


CREATE DATABASE bd_ecommerce;

USE bd_ecommerce;


CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    marcar VARCHAR(255),
    codigo INT,
    preco DOUBLE,
	PRIMARY KEY(id)
);

INSERT INTO tb_produtos (nome, marcar, codigo, preco) VALUE ('Geladeira', 'Samsung', '0293343', 2000.00);
INSERT INTO tb_produtos (nome, marcar, codigo, preco) VALUE ('Fogão', 'Consul', '3644777', 1600.00);
INSERT INTO tb_produtos (nome, marcar, codigo, preco) VALUE ('Lava Louças', 'Mideo', '374664', 1800.00);
INSERT INTO tb_produtos (nome, marcar, codigo, preco) VALUE ('Maquina de Lavar', 'Eletrolux', '49485', 2200.00);
INSERT INTO tb_produtos (nome, marcar, codigo, preco) VALUE ('Microondas', 'Consul', '489033', 1000.00);
INSERT INTO tb_produtos (nome, marcar, codigo, preco) VALUE ('TV', 'Samsung', '12897', 3500.00);
INSERT INTO tb_produtos (nome, marcar, codigo, preco) VALUE ('Alexia', 'Amazon', '3478290', 300.00);
INSERT INTO tb_produtos (nome, marcar, codigo, preco) VALUE ('Notebook', 'Acer', '383944', 5300.00);


SELECT * FROM tb_produtos;

SELECT * FROM tb_produtos WHERE preco > 500;
SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET nome = 'Samsung' WHERE id = 2; 
