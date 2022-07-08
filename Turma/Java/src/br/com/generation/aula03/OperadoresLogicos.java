package br.com.generation.aula03;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // &&, ||, ^ (ou exclusivo), !(negação)

        idadeVotar();
        cartaoAmarelo();
        numerico();
        inverso();
    }

    public static void idadeVotar() {
        int idade = 25;
        //&& as duas condições precisam ser verdadeiras
        boolean precisaVotar = idade >= 18 && idade < 70;
        System.out.println(precisaVotar);
    }

    public static void cartaoAmarelo() {
        int rnAmarelo = 2, rnVermelho = 1;

        //Uma das condições podem ser verdadeiras
        boolean suspenso = rnAmarelo == 0 || rnVermelho == 0;
        System.out.println(suspenso);
    }

    public static void numerico() {
        //Quando uma das comparações forem excluisivamente verdadeiras,
        //se ambas forem falsas ou verdadeias ---> resultado falso

        int x = 15, y = 6;
        boolean teste = x > 10 ^ y > 10;
        System.out.println(teste);
    }

    public static void inverso() {
        //Traz um resultado inverso da lógica
        //Se for falso ele transforma em verdade, se for verdade ele traz falso

        int idade = 20;
        boolean maiorIdade = !(idade >= 18);

        System.out.println(maiorIdade);
    }



}
