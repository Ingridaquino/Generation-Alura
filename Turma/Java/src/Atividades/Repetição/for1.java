package Atividades.Repetição;

import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        for(int i = 1000; i < 1999; i++) {
            if(i % 11 == 5) {
                 System.out.println("Números com resto 5: " + i);
            }
        }
    }
}
