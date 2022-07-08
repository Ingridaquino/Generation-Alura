package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
         ordem();
    }

    public static void ordem() {
        Scanner entrada = new Scanner(System.in);


        int aux, num1, num2, num3;

        System.out.println("Digite um número: ");
        num1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        num2 = entrada.nextInt();

        System.out.println("Digite mais um número: ");
        num3 = entrada.nextInt();

        if( num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        } else if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }else {
            aux = num3;
            num3 = num1;
            num1 = aux;
        }

        System.out.println("Ordem Crescente: ");
        System.out.println(num1 + " " + num2 + " " + num3 + " ");


    entrada.close();
    }
}
