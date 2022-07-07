package br.com.generation.aula02;

import java.util.Scanner;

public class GalaoLitro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double galoes, litros;

        System.out.println("Informe a quantidade de galões: ");
        galoes = entrada.nextDouble();

        litros = galoes *  3.600;

        System.out.println(galoes + " galoes são: " + litros + " litros ");

        entrada.close();
    }
}
