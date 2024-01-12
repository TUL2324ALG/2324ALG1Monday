package zapocet.monday_hruska;

import java.util.Arrays;

public class Methods {

    // MAIN CLASS ==================
    public static void main(String[] args) {
        int[] pal = {1, 5, 8};
        System.out.println(Arrays.toString(createPalindom(pal)));

        int[] sum = {12, 2, 5, 9, 7, 7};
        System.out.println("SumNextTwo: " + constantSumNextTwo(sum));
        
        int[][] even = {{2, 4}, {6, 8}};
        System.out.println("Is Even: " + testEven(even));
    }

    // METODY ==================
    public static int[] createPalindom(int[] puvodni) {
        int[] palindom = new int[(puvodni.length * 2) - 1];

        int i = 0;
        while (i < puvodni.length) {
            palindom[i] = puvodni[i];
            i++;
        }
        for (int j = puvodni.length - 2; j >= 0; j--) {
            palindom[i] = puvodni[j];
            i++;
        }

        return palindom;
    }

    public static boolean constantSumNextTwo(int[] pole) {
        int prvniSoucet = pole[0] + pole[1];

        if ((pole.length % 2) != 0) {
            return false;
        }

        for (int i = 2; i < pole.length; i = i + 2) {
            if ((pole[i] + pole[i + 1]) != prvniSoucet) {
                return false;
            }
        }
        return true;
    }

    public static boolean testEven(int[][] matice) {
        for (int i = 0; i < (matice.length - 1); i++) {
            for (int j = 0; j < (matice[0].length - 1); j++) {

                if (matice[i][j] < 0) {
                    return false;
                }
                if ((matice[i][j] % 2) != 0) {
                    return false;
                }
                if (matice[i][j] > matice[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    // ALERT jsem nestihl
    /*
    public static int[][] alert01(int radky, int sloupce) {

    }
     */
}
