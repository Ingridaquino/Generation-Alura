import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class IdadePessoa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalDias = 0;

        System.out.println("Digite aqui sua idade: ");
        int idadePessoa = entrada.nextInt();

        System.out.println("Digite quantos meses: ");
        int mesAniver = entrada.nextInt();

        System.out.println("Digite quantos dias: ");
        int dias = entrada.nextInt();


    //converte anos em dias
        totalDias = totalDias + (idadePessoa * 365);

    //converte meses em dias
        totalDias = totalDias + (mesAniver * 30);

    //converte anos em dias
        totalDias = totalDias + dias;

        System.out.println("O total de dias é = " + totalDias);

        entrada.close();

    }

}
