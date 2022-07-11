package Atividades.Repetição;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        System.out.println(" -- Idades -- ");
        idade();
    }

    public static void idade() {
        Integer idade, maior = 0, menor = 0, i = 0;
        Scanner entrada = new Scanner(System.in);

        while(i < 100){

            System.out.println("Digite sua idade: ");
            idade = entrada.nextInt();


            if(idade == -99){
                break;
            }

            i++;

            if(idade < 21){
                menor += 1;
            } else if (idade > 50){
                maior += 1;
            }

        }
                System.out.println("Pessoas com menos de 21 anos: " + menor);
                System.out.println( "Pessoas com mais de 50 anos: " + maior);

        System.out.println("Fim do programa...");
    }

}
