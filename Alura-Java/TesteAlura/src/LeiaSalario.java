import java.util.Scanner;

public class LeiaSalario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salMinimo = 1.212;

        System.out.println("Digite seu salário: ");
        double salario = entrada.nextDouble();

        double quanti = (salario / salMinimo) - 2;

        System.out.print("Você recebeu ");
        System.out.format("%.0f",quanti);
        System.out.println(" de salários mínimos ");

    }
}
