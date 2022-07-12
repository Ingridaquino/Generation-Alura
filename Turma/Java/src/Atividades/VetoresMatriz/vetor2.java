package Atividades.VetoresMatriz;

import java.util.Random;
import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
        lancamento();
    }

    public static void lancamento(){

        Random sorteio = new Random();
        Integer[] dado = new Integer[10];
        Integer[] ocorrencias = {0, 0, 0, 0, 0,0};
        double media = 0.0;
        int soma = 0, maior = -1;

        for(int i = 0; i <= dado.length; i++){
            dado[i] = sorteio.nextInt() % 6;
            ocorrencias[dado[i] -1]++;
            soma+=dado[i];

            for(int x = 0; x < i; x++ ){
                System.out.println(dado[i] + "\n");
            }

            for(int j = 0; j < i; j++){
                if (dado[i] > maior){
                    maior = dado[i];
                }
            }


            System.out.println("\nMaior: " + maior);
            System.out.println("\nOcorrencias: " + ocorrencias[maior - 1] + " vezes");
        }


        System.out.println("\nMédia" + media / 5);
        System.out.println("\nQuantidade: " + maior);

    }
}
