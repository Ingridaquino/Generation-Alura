package br.com.generation.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        System.out.println("Quantos alunos deseja add: ");
        int numDeAlunos = entrada.nextInt();

        for (int i = 0; i < numDeAlunos; i++){
            System.out.println("Digite a idade do Aluno: ");
            int idade = entrada.nextInt();

            System.out.println("Digite o nome do Aluno: ");
            String nomes = entrada.next();

            alunos.add(new Aluno(idade, nomes));
        }

        for(Aluno i : alunos){
            System.out.println(i);
        }


        entrada.close();
    }
}
