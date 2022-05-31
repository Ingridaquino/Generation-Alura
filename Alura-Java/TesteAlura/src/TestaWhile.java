import java.util.Scanner;

public class TestaWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int result;
        int contador = 0;

        System.out.println("Digite um número: ");
        int tabu = entrada.nextInt();


        System.out.println("Tabuada com While");
        while(contador <= 10) {
            result = tabu * contador;
            System.out.println(tabu + " x " + contador + " = " + result);
            contador ++ ;
        }


        System.out.println("Tabuada com For");
        for(int i = 0; i <= 10; i++){
                result = tabu * i;
                System.out.println(tabu + " x " + i + " = " + result);
        }
    }
}
