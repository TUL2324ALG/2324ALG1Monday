/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet_monday.monday_saltovskyi;

/**
 *
 * @author Saltovskyi-A-9a2c
 */
import java.util.Random;

public class Methods {

    static Random rand = new Random();

    public static void main(String[] args) {
        int[] a = {1, 5, 8};
        int[] b = {12, 2, 5, 9, 7, 7};
        int[] c = {1, 4, 6};
        int[][] d = new int[3][3];
        createPalindom(a);
        //constantSumNextTwo(b);
        //testEven(c);
        alter01(d);

    }
    
    //JV nedela to, co ma
    public static int createPalindom(int[] a) {
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            j = a[i];
            System.out.print(j + " ");
            for (int k = 0; k < a.length / 2; k++) {

                int temp = a[i];

                System.out.print(" " + temp);
            }
        }

        return j;
    }

    public static boolean constantSumNextTwo(int[] b) { //JV ma fungovat pro jakkoliv velke pole
        boolean isCorrect = true;
        int sum = 0;
        for (int i = 0; i < b.length; i++) {

            int sum1 = b[i] + b[i + 1];
            int sum2 = b[i + 2] + b[i + 3];
            int sum3 = b[i + 4] + b[i + 5];
            if (sum1 != sum2 && sum1 != sum3) {
                isCorrect = false;

            } else if (sum1 != sum2 && sum1 == sum3) {
                isCorrect = false;

            } else if (sum1 == sum2 && sum1 != sum3) {
                isCorrect = false;
            } else {
                isCorrect = true;
            }

            System.out.print(sum1 + " " + sum2 + " " + sum3);
            System.out.println(isCorrect);

        }

        return isCorrect;

    }

    public static boolean testEven(int[] c) { //JV mela to byt matice
        boolean toJeSudaToJeCelaToJeKladna = true;

        for (int i = 0; i < c.length; i++) {
            int test = c[i];
            if (test <= 0 || test % 2 != 0) { //JV ok, ale ještě měli jit po sobe
                toJeSudaToJeCelaToJeKladna = false;

                break;

            }

        }
        System.out.println(toJeSudaToJeCelaToJeKladna);

        return toJeSudaToJeCelaToJeKladna;
    }

    public static int[][] alter01(int[][] d) {
        int range = rand.nextInt(2); //JV nemelo to byt nahodne, ale stridave
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[j][i] = range;
                System.out.println(d[j][i]);
            }

        }

        return d;
    }

}
