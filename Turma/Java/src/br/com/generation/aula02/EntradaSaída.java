package br.com.generation.aula02;

import java.util.Scanner;

public class EntradaSaída {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Informe um número: ");
        a = entrada.nextInt();

        System.out.println("Informe mais um número: ");
        b = entrada.nextInt();

        soma = a + b;
        System.out.println("Resultado é: " + soma);


        entrada.close();
    }
}
