package br.com.generation.aula04;

public class while01 {
    public static void main(String[] args) throws InterruptedException {
        int contador = 10;

        while(contador >= 0){
            System.out.println("Contador: " + contador);

            contador--;
            Thread.sleep(500);
        }

    }
}
