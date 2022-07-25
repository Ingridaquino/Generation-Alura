package br.com.generation.Aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite dois numeros: ");
            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();

            int divisao = num1 / num2;

            System.out.println("O resultado é: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Impossível dividir por zero!!");
        } catch (InputMismatchException f) {
            System.out.println("Impossível dividir por letra!!");
        } finally {
            System.out.println("Finalizando o programa!!");
        }

        entrada.close();
    }
}
