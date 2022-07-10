package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
         ordem();
    }

    public static void ordem() {
        Scanner entrada = new Scanner(System.in);

        int[] nums = new int[3];
        int a, b, c;

        System.out.println("Digite um número: ");
        a = entrada.nextInt();

        System.out.println("Digite outro número: ");
        b = entrada.nextInt();

        System.out.println("Digite mais um número: ");
        c = entrada.nextInt();


        if (a < b && a < c) {
            nums[0] = a;
        } else if (a < b || a < c) {
            nums[1] = a;
        } else {
            nums[2] = a;
        }


            if (b < a && b < c) {
                nums[0] = b;
            } else if (b < a || b < c) {
                nums[1] = b;
            } else {
                nums[2] = b;
            }

            if (c < a && c < b) {
                nums[0] = c;
            } else if (c < a || c < b) {
                nums[1] = c;
            } else {
                nums[2] = c;
            }

            System.out.println("Ordem Crescente: ");
            System.out.println(Arrays.toString(nums));


            entrada.close();
        }
    }
