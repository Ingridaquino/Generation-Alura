public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 10;
        int quantidadePessoa = 2;

        if (idade >= 18) {
            System.out.println("Você tem mais de 18 anos");
        } else {
            if (quantidadePessoa >= 2) {
                System.out.println("Você não tem 18 anos, mas pode entrar, " +
                        "pois está acompanhando");
            } else {
                System.out.println("Infelizmente você não pode entrar!");
            }

        }

        double salario = 3300.0;
        if(salario < 2600.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir R$ 350");
        }

        if(salario < 3750.0) {
            System.out.println("A sua aliquota é de 22,5%");
            System.out.println("Você pode deduzir R$ 636");
        }
    }
}
