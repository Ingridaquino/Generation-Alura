import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor do reajuste de acordo com seu saldo");


        System.out.println("Digite seu saldo: ");
         double sald = entrada.nextDouble();

         double reaTotal = (double)(sald * 0.01) + sald;

        System.out.println("Seu saldo teve um reajuste de 1%, o valor atual é: " + reaTotal);



    }
}
