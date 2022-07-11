package Atividades.Repetição;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int par = 0, num;

        for(int i = 0; i < 10; i++){
            System.out.println("Informe um número: ");
            num = entrada.nextInt();

            if(num % 2 != 0){
                par = par + 1;
            }
        }

        System.out.println("Pares: " + par);
        System.out.println("Impar:" + (10 - par));
    }
}
