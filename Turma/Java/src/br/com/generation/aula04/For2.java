package br.com.generation.aula04;

public class For2 {
    public static void main(String[] args) {

        int num = 10;

        for (int i = 0, soma = 0; i <= num; i++){
            System.out.print("Repetição: " + i);

            soma += i;
            System.out.println(" soma é " + soma);
        }

    }
}
