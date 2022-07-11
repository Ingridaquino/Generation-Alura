package Atividades.Repetição;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {

    }

    public static void media() {
        Scanner entrada = new Scanner(System.in);

        int num, media = 0;

        do{
            System.out.println("Digite um número: ");
            num = entrada.nextInt();

            if(num % 3 == 1){
                media = (num + num) / num;
            }

        }while(num != 0);

        System.out.println("Os multiplos de 3: " + media);
    }

}
