
public class Temperatura {
    public static void main(String[] args) {
        func1();
    }

    public static void func1() {

        String[] cidades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asuncion", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        Integer[][] temperaturas = {{-2, 33}, {-3, 32}, {-8, 27},
                {4, 37}, {6, 42}, {5, 43},
                {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        Integer indexMinimo = 0;
        Integer indexMaior = 0;

        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[indexMinimo][0] > temperaturas[i][0]) {
                indexMinimo = i;
            }
            if (temperaturas[indexMaior][1] < temperaturas[i][1]) {
                indexMaior = i;
            }
        }
        System.out.println(cidades[indexMinimo] + " com a temperatura " + temperaturas[indexMinimo][0]);
        System.out.println(cidades[indexMaior] + " com a temperatura " + temperaturas[indexMaior][1]);
    }

}

