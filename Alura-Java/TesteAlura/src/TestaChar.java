public class TestaChar {
    public static void main(String[] args) {

                char letra = 'a';
                System.out.println(letra);

                char valor = 65;  // Compila!
                System.out.println(valor);

                //valor = valor + 1;         // Não compila!
                //System.out.println(valor);

                valor = (char) (valor + 1);         // Compila!
                System.out.println(valor);
    }
}
