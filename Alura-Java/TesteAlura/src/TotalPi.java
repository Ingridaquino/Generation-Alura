import java.util.Scanner;

public class TotalPi {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro produto!");
        String proOne = s.next();

        System.out.println("Digite o preco do primeiro produto!");
        double precoOne = s.nextDouble();

        System.out.println("Digite o percentual de IPI do Primeiro Produto!");
        double porOne = s.nextDouble();

        System.out.println("Digite o nome do segundo produto!");
        String pecaTwo = s.next();

        System.out.println("Digite o preco do segundo produto!");
        double precoTwo  = s.nextDouble();

        System.out.println("Digite o percentual de IPI do Segundo Produto!");
        double porTwo = s.nextDouble();

        double totalOne = precoOne + (precoOne * porOne)/100;
        double totalTwo = precoTwo + (precoTwo * porTwo)/100;


        System.out.println("O valor da peça com o IPI é: " + totalOne);
        System.out.println("O valor da peça com o IPI é: " + totalTwo);

        s.close();
    }
}
