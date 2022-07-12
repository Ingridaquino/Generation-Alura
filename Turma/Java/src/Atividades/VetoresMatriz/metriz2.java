package Atividades.VetoresMatriz;

import java.util.Scanner;

public class metriz2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Integer[][] matriz = new Integer[3][3];

        Integer soma = 0, somaDiagonal = 0, maior = 0;


        for(int i = 0; i < matriz.length; i++){
            for (int c = 0; c <= matriz.length; c++){
                System.out.println("\nInforme os valores da Matriz: \n");
                matriz[i][c] = entrada.nextInt();
                
                soma = soma + matriz[i][c];

                if(matriz[i][c] > maior){
                    maior = matriz[i][c];
                }
            }
        }

        somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];

        System.out.println("\nA soma total da matriz é: " + soma);
        System.out.println("\nA soma total da soma Diagonal é: " + somaDiagonal);
        System.out.println("\nO maior é: " + maior);
    }
}
