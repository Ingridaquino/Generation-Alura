package Atividades.VetoresMatriz;

import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) {
        leitor();
    }

     public static void leitor(){
         Scanner entrada = new Scanner(System.in);

         Integer[] notas = new Integer[5];
         int maior = 0;

         for(int i = 0; i < notas.length; i++){
             System.out.println("Digite uma nota");
             notas[i] = entrada.nextInt();

             if(maior < notas[i]){
                 maior = notas[i];
             }
         }

         System.out.println("O maior é: " + maior);

     }
}
