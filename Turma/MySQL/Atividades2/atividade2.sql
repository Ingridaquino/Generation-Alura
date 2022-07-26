/* 
Crie a tabela tb_categorias e determine pelo menos 2 atributos, além da Chave Primária, relevantes para classificar as pizzas.
Crie a tabela tb_pizzas e determine 4 atributos, além da Chave Primária, relevantes aos produtos da pizzaria.
Não esqueça de criar a Foreign Key da tabela tb_categorias na tabela tb_pizzas.
Insira 5 registros na tabela tb_categorias.
Insira 8 registros na tabela tb_pizzas, preenchendo a Chave Estrangeira para criar a relação com a tabela tb_categorias.
Faça um SELECT que retorne todas as pizzas cujo valor seja maior do que R$ 45,00.
Faça um SELECT que retorne todas as pizzas cujo valor esteja no intervalo R$ 50,00 e R$ 100,00.
Faça um SELECT utilizando o operador LIKE, buscando todas as pizzas que possuam a letra M no atributo nome.
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias.
Faça um SELECT utilizando a cláusula INNER JOIN, unindo os dados da tabela tb_pizzas com os dados da tabela tb_categorias, onde traga apenas as pizzas que pertençam a uma categoria específica (Exemplo: Todas as pizzas que são doce).
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, no repositório que você criou sobre Banco de dados.

*/

CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;


CREATE TABLE tb_categoria (
	id BIGINT AUTO_INCREMENT,
    sabor VARCHAR(255),
    tamanho INT,
    PRIMARY KEY (id)
);


CREATE TABLE tb_pizzas (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    massa VARCHAR(255),
    borda VARCHAR(255),
    quantidade INT,
    preco DOUBLE,
    PRIMARY KEY (id),
    pizza_id BIGINT,
	FOREIGN KEY (pizza_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria (sabor, tamanho) VALUES ('Salgado', 8);
INSERT INTO tb_categoria (sabor, tamanho) VALUES ('Doce', 8);
INSERT INTO tb_categoria (sabor, tamanho) VALUES ('Salgado', 4);
INSERT INTO tb_categoria (sabor, tamanho) VALUES ('Doce', 4);
INSERT INTO tb_categoria (sabor, tamanho) VALUES ('Salgado', 8);

INSERT INTO tb_pizzas (nome, massa, borda, quantidade, preco, pizza_id) VALUES ('4Queijos', 'fina', 'receiada', 2, 54.0, 1);
INSERT INTO tb_pizzas (nome, massa, borda, quantidade, preco, pizza_id) VALUES ('Brigadeiro', 'fina', 'sem receio', 6, 27.9, 2);
INSERT INTO tb_pizzas (nome, massa, borda, quantidade, preco, pizza_id) VALUES ('Portuguesa', 'grossa', 'receiada', 7, 66.9, 3);
INSERT INTO tb_pizzas (nome, massa, borda, quantidade, preco, pizza_id) VALUES ('Romeu e Julieta', 'fina', 'receiada', 2, 45.0, 4);
INSERT INTO tb_pizzas (nome, massa, borda, quantidade, preco, pizza_id) VALUES ('Calabresa', 'media', 'sem receio', 1, 33.0, 5);
INSERT INTO tb_pizzas (nome, massa, borda, quantidade, preco, pizza_id) VALUES ('Mussarela', 'grossa', 'receiada', 4, 40.0, 1);
INSERT INTO tb_pizzas (nome, massa, borda, quantidade, preco, pizza_id) VALUES ('Doce de leite', 'fina', 'receiada', 10, 49.0, 2);
INSERT INTO tb_pizzas (nome, massa, borda, quantidade, preco, pizza_id) VALUES ('Peperroni', 'grossa', 'receiada', 1, 87.0, 3);

SELECT * FROM tb_categoria;
SELECT * FROM tb_pizzas;

SELECT * FROM tb_pizzas WHERE preco > 45.0;
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50 AND 100;

SELECT * FROM tb_pizzas WHERE tb_pizzas.nome LIKE 'M%';

SELECT * FROM tb_pizzas INNER JOIN tb_categoria ON tb_categoria.id = tb_pizzas.pizza_id;

SELECT tb_pizzas.massa, tb_pizzas.nome, tb_categoria.sabor
FROM tb_pizzas INNER JOIN tb_categoria ON tb_categoria.id = tb_pizzas.pizza_id 
and tb_pizzas.massa LIKE 'fina%';


