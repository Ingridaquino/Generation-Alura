package Atividades.Repetição;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        System.out.println("Números do teclado");

        leiaNum();
    }

    public static void leiaNum() {
        Scanner entrada = new Scanner(System.in);

        Integer num, soma = 0;

        do {

            System.out.println("Digite um número: ");
            num = entrada.nextInt();


            soma = soma + num;
        } while (num != 0);

        System.out.println("A soma é: " + soma);

    }
}
