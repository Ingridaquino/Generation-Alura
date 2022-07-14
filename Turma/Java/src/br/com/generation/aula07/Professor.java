package br.com.generation.aula07;

public class Professor extends Funcionario{

    private String diciplina;

    public Professor(double salario) {
        super(salario);
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }
}
