import java.util.Scanner;

public class TemperaturaGraus {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o grau: ");
        int grau = ler.nextInt();

        double f = grau * 1.8 + 32;
        double k = grau + 273.15;
        double re = grau * 0.8;
        double ra = grau * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahrenheit é: " + f);
        System.out.println("A temperatura em Kelvin é: " + k);
        System.out.println("A temperatura em Reaumur é: " + ra);
        System.out.println("A temperatura em Rankine é: " + re);


    }
}
