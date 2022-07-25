/*
Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as informações dos estudantes deste registro dessa escola. 
Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos relevantes dos estudantes para se trabalhar com o serviço dessa escola.
Insira nesta tabela no mínimo 8 dados (registros).
Faça um SELECT que retorne todes o/a(s) estudantes com a nota maior do que 7.0.
Faça um SELECT que retorne todes o/a(s) estudantes com a nota menor do que 7.0.
Ao término atualize um registro desta tabela através de uma query de atualização.
Salve todas as queries para cada um dos requisitos do exercício em um único script (arquivo .SQL) e coloque no seu Github pessoal, no repositório que você criou sobre Banco de dados.
*/

CREATE DATABASE bd_escola;
USE bd_escola;

CREATE TABLE td_estudante ( 
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    idade INT,
    professor VARCHAR(255),
    nota DOUBLE,
    PRIMARY KEY(id)
);

INSERT INTO td_estudante (nome, idade, professor, nota) VALUES ('Miguel', 7, 'Sara', 7.6);
INSERT INTO td_estudante (nome, idade, professor, nota) VALUES ('Amora', 8, 'Rafaela', 5.6);
INSERT INTO td_estudante (nome, idade, professor, nota) VALUES ('Larissa', 10, 'Ana',  8.1);
INSERT INTO td_estudante (nome, idade, professor, nota) VALUES ('Davi Luccas', 7, 'Marilia', 6.9);
INSERT INTO td_estudante (nome, idade, professor, nota) VALUES ('Sarah', 13, 'Camilis',  7.4);
INSERT INTO td_estudante (nome, idade, professor, nota) VALUES ('Cauã', 10, 'Lucia',  5.9);
INSERT INTO td_estudante (nome, idade, professor, nota) VALUES ('Pietro', 13, 'Camilis', 9.8);
INSERT INTO td_estudante (nome, idade, professor, nota) VALUES ('Yasmin', 8, 'Rafaela', 8.9);

SELECT * FROM tb_estudante WHERE nota > 7.0;
SELECT * FROM tb_estudante WHERE nota < 7.0;


UPDATE tb_estudante SET nota = 10 WHERE id = 3;