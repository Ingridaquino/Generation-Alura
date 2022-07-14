package br.com.generation.aula07;

//Funcionario está herdando os atributos da Class Pessoa
public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(double salario) {

        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
