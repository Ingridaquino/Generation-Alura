import java.util.Scanner;

public class NumeroInteiro {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = ler.nextInt();

        int ante = num - 1;
        int suce = num + 1;

        System.out.println("O antecessor de " + num + " é " + ante);
        System.out.println("O sucessor de " + num + " é " + suce);



        ler.close();

    }
}
