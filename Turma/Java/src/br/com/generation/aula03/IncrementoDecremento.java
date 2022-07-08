package br.com.generation.aula03;

public class IncrementoDecremento {
    public static void main(String[] args) {
        incremento();
        decremento();
    }

    public static void incremento() {
        int num = 1;
        //System.out.println(num++); //Pós-incremento
        //System.out.println(num);

        System.out.println(++num); //Pré-incremento tiro 1 de dentro da variavel e depois faço a impressao
    }

    public static void decremento() {
        int num = 4;

        //System.out.println(num--);// Aqui eu mostro o valor atual e subtraio 1 da variavel
        //System.out.println(num);// Precisa impremir novamente a variavel para ver o valor atual após ser subtraidoS

        System.out.println(--num);
    }
}
