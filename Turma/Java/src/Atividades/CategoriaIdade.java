package Atividades;

import java.util.Scanner;

public class CategoriaIdade {
    public static void main(String[] args) {
        categoria();
    }

    public static void categoria() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if(idade >= 10 && idade < 14) {
            System.out.println("Categoria infantil !!");
        } else if(idade >= 15 && idade < 17) {
            System.out.println("Categoria juvenil !!");
        } else if (idade < 25) {
            System.out.println("Categoria adulto !!");
        }


        entrada.close();
    }
}
