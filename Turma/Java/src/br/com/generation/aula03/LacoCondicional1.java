package br.com.generation.aula03;

import java.util.Locale;
import java.util.Scanner;

public class LacoCondicional1 {
    public static void main(String[] args) {
        number();
    }

    public static void number() {
        Locale.setDefault(Locale.US); // Caso queira usar o ponto como separador de valores double, no console ...
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

            System.out.println("Digite a primeira nota: ");
            nota1 = entrada.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = entrada.nextDouble();

            media = (nota1 + nota2) / 2;

            if(media >= 7.0){
                System.out.println("Aprovado!" + "\nMédia: " + media);
            } else if (media >= 4.5 && media < 7.0){
                System.out.println("Recuperação!" + "\nMédia: " + media);
            }else {
                System.out.println("Reprovado!" + "\nMédia: " + media);
            }

        entrada.close();
    }
}
