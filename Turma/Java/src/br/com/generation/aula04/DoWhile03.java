package br.com.generation.aula04;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i = 0;

        do {
            System.out.println("Digite o 1° número: ");
            int num = entrada.nextInt();

            System.out.println("Digite o 2° número: ");
            int num2 = entrada.nextInt();

            if(num2 == 0){
                continue; // --> continua mesmo que o erro aconteça
//                break; // --> o programa finaliza a pós o erro
            }

            System.out.println((i + 1) + "° resultado" + num + "/" + num2 + " é: " + (num / num2));
        }while(i <= 10);

        System.out.println("Fim... do programa");
    }
}
