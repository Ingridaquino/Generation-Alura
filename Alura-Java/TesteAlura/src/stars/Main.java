package stars;

public class Main {
    public static void main(String[] args) {
//        starTwo();
//        starFive();
//        starSix();
//        starSeven();
//        starEight();

//        starNine();
//        starTen();
        starElevan();
    }


    static void starOne() {

        for (int i = 1; i <= 5; i++) {
            int printColumn = i;
            for (int c = 1; c <= printColumn; c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void starTwo() {
        for (int i = 1; i <= 5; i++) {
            int printColumn = 6 - i;
            for (int c = 1; c <= printColumn; c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void starFive() {
        for (int i = 1; i <= 9; i++) {
            int printColumn;
            if (i <= 5) {
                printColumn  = i;
            } else {
                printColumn = 10 - i;
            }

            for (int c = 1; c <= printColumn; c++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }

    static  void starSix() {
        for (int i = 1; i <= 5; i++) {
            int printColumn = i;
            int printSpace = 5 - i;

            for (int s = 1; s <= printSpace; s++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= printColumn; c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void starSeven() {
        for (int i = 1; i <= 5; i++) {
            int printColumn = 6 - i;
            int printSpace = i;

            for (int s = 1; s <= printSpace; s++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= printColumn; c++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void starEight() {
        for (int i = 1; i <= 5; i++) {
            int printSpace = 5 - i;
            int printColumn;

            if (i == 1) {
                printColumn = i;
            } else {
                printColumn = i + i - 1;

            }

            for (int s = 0; s <= printSpace; s++) {
                System.out.print(" ");
            }

            for (int c = 0; c < printColumn; c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void starNine() {
        for (int i = 1; i <= 5; i++)                   {
            int printColumn = 11 - i * 2;
            int printSpace = i - 1;

//            if (i == 1) {
//                printColumn = 8;
////                printSpace = i;
//            } else {
//                printColumn = 8 - i ;
////                printSpace = i + 1;
//            }

            for (int s = 1; s <= printSpace; s++) {
                System.out.print(" ");
            }

            for (int c = 1; c <= printColumn; c++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void starTen() {
        for (int i = 1; i <= 5; i++) {
            int printColumn = i + 1;
            int printSpace = 6 - i ;

            for (int s = 1; s < printSpace; s++) {
                System.out.print(" ");
            }

            for (int c = 1; c < printColumn; c++) {
                System.out.print(" *");
            }



            System.out.println();
        }
    }

    static void starElevan() {
        for (int i = 0; i < 5; i++) {
            int printColumn = 6 - i;
            int printSpace = i ;

            for (int s = 0; s < printSpace; s++) {
                System.out.print(" ");
            }

            for (int c = 1; c < printColumn; c++) {
                System.out.print(" *");
            }

            System.out.println();

        }
    }
}

