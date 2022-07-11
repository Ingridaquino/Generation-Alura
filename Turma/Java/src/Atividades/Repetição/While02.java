package Atividades.Repetição;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
         System.out.println(" --- Características psicológicas ---");

         pessoas();

    }

    public static void pessoas() {
        Integer idade, sexo, opcao, total = 0, i = 0, calma = 0;
        Integer totalCal = 0, totalNer = 0, totalAgre = 0, outros  = 0, pessoa = 0;

        Scanner entrada = new Scanner(System.in);

        while (i <= 150){
            System.out.println("Informe sua idade: ");
            idade = entrada.nextInt();

            System.out.println("1 - Feminino \n 2 - Masculino \n 3 - Outros");
            System.out.println("Informe o número do sexo: ");
            sexo = entrada.nextInt();

            System.out.println("1 - Pessoa calma");
            System.out.println("2 - Pessoa nervosa");
            System.out.println("3 - Pessoa agressiva");
            System.out.println("Informe o número das suas características: ");
            opcao = entrada.nextInt();

        i++;

        if(opcao == 1) {
            totalCal += 1;
            if (sexo == 3){
                 outros += 1;
            }
            if(idade < 18){
                calma += 1;
            }
        } else if(opcao == 2){
            if(sexo == 1){
                totalNer += 1;
            }
            if (idade >= 40) {
                pessoa += 1;
            }
        } else if(opcao == 3){
            if(sexo == 2){
                totalAgre += 1;
            }
        }

            System.out.println("\nPessoas calmas: " + totalCal);
            System.out.println("Mulheres nervosas: " + totalNer);
            System.out.println("Homens agressivos: " + totalAgre);
            System.out.println("Outros calmos: " + outros);
            System.out.println("Pessoas com mais de 40 anos nervosas: " + pessoa);
            System.out.println("Pessoas com menos de 18 anos calmas: " + calma);

    }
}
}
