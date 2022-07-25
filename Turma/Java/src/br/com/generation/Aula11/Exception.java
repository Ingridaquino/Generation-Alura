package br.com.generation.Aula11;

public class Exception {
    public static void main(String[] args) {

        int[] vetor = new int[4];
        System.out.println("Antes da Exeption...");

        try{ //--> tentar
            vetor[4] = 10;
            System.out.println("Após a exception...");

            //Coloque esse erro em uma variável
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Existe um problema no código, porém vai ficar assim mesmo!!");
        }

    }
}
