package br.com.generation.Aula11.TestaSoftware;

import java.util.Scanner;

public class TestaMetodoUnitario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        int resultadoEsperado = 4;

        System.out.println("Digite um valor: ");
        int resultado = (int) calc.somar(entrada.nextDouble(), entrada.nextDouble());

    }
}
