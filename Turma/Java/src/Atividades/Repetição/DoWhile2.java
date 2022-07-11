package Atividades.Repetição;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        media();
    }

    public static void media() {
        Scanner entrada = new Scanner(System.in);

        int num, media = 0, i = 0, soma = 0;

        do{
            System.out.println("Digite um número: ");
            num = entrada.nextInt();

            if(num % 3 == 0){
                soma += num;
                media++;
            }

            i++;

        }while(num != 0);
        i--;

        System.out.println("Os multiplos de 3: " + soma / media);
    }

}
