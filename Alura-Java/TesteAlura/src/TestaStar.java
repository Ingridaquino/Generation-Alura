public class TestaStar {
    public static void main(String[] args) {

        int rows = 6; // Number of Rows we want to print



        //Printing the pattern
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        for(int x = 0; x < 6; x++){
            for(int j = 1; j < x; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }


    // versao 1 - alura
        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if ( coluna > linha ) {
                    break;
                }
                System.out.print(coluna + 1);
            }
            System.out.println();
        }

        // versao 2 - alura
        for (int linha = 0; linha < 6; linha++) {
            for(int coluna = 0; coluna <= linha; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
