import java.util.Scanner;

public class EmailInfo {
    String email;

    public  void Email(){

        Scanner entrada = new Scanner(System.in);

        System.out.println(" --- Para ficar por dentro de tudo, cadastre seu e-mail");
        System.out.println("Email: ");
        email = entrada.next();

    }

}
