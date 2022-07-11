package br.com.generation.aula04;

public class while02 {
    public static void main(String[] args) throws InterruptedException {
        int  num = 1;

        while(num < 10){

            System.out.println("Contador: " + num);

            num++;

            Thread.sleep(1000);
        }
    }
}
