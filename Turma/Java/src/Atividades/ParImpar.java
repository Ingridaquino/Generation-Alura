package Atividades;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        num();
    }

    public static void num() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = entrada.nextInt();

        if(valor % 2 == 0) {
            System.out.println("O valor: " + valor + " é par");
            valor *= valor;
        } else if(valor % 3 != 0) {
            System.out.println("O valor: " + valor + " é ímpar");
            valor *= valor;
        }

        System.out.println("A raiz quadrada: " + valor);
    }
}
