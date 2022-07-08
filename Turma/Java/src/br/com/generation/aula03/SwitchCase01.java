package br.com.generation.aula03;

import java.util.Scanner;

public class SwitchCase01 {
    public static void main(String[] args) {
        calculadora();
    }

    public static void calculadora() {
        Scanner entrada = new Scanner(System.in);

        int resultado;

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite a operação: ");
        char opcion = entrada.next().charAt(0);
        //char é um cod, cada letra tem um cod para o pc entender.

        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        switch (opcion) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '/':
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
                break;

            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;

            default:
                System.out.println("Operação invalida");
                break;

        }
    }
}
