package Atividades.VetoresMatriz;

public class matriz {
    public static void main(String[] args) {
        leDuasMatriz();
    }

    public static void leDuasMatriz(){

        int[][] n1 = {{1, 6, 9, 4}, {6, 9, 5, 4}, {6, 9, 3, 5,}, {8, 3, 9, 6}};
        int[][] n2 = {{1, 5, 10, 54}, {6, 9, 5, 44}, {6, 69, 3, 51,}, {8, 93, 9, 6}};

         int[][] m1 = new int[4][4];
         int[][] m2 = new int[4][4];

        for(int i = 0; i < n1.length; i++){

            for (int j = 0; j < n2.length; j++){
                m1[i][j] = n1[i][j] + n1[i][j];
                m2[i][j] = n1[i][j] + n2[i][j];


                System.out.println(" | " + m1[i][i] + "\n");
                System.out.println(" | " + m2[i][j]);
            }
        }
    }
}
