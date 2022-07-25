package br.com.generation.ArrayList;

public class Aluno {

    private int idade;
    public String nome;

    public Aluno(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }
}
