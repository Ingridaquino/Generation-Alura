package br.com.generation.aula5;

public class metodos {
    public static void main(String[] args) {
        gerandoAluno();
    }

    public static void gerandoAluno() {
        Aluno aluno = new Aluno();

        aluno.setIdade(25);
        aluno.setNome("Sarah");
        aluno.setCurso("Java");

        System.out.println(aluno.getCurso());
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        aluno.estudando();

    }
}

