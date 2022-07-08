package Atividades;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        maiorNum();
    }

    public static void maiorNum() {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;
        int maior;

        System.out.println("Informe um número: ");
        num1 = entrada.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("Informe mais um número: ");
        num3 = entrada.nextInt();

        if(num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num3)  {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O maior é: " + maior);

        entrada.close();
    }
}
