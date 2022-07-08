import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class HoraSistema {
    public static void main(String[] args) {
        hora();
    }

    public static void hora() {
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        //Converte a Date em string

        //Imprime o idioma do sistema
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma é: ");
        System.out.println(idioma.getDisplayLanguage());

       // Pega a resolução do seu sistema

        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension tamanho = tela.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + tamanho.width + " x " + tamanho.height);
    }
}
