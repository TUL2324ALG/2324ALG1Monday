package zapocet.monday_lukes;

import java.util.Scanner;

public class Methods {

    static Scanner sc = new Scanner(System.in);

    //JV A
    public static int[] createPalindrom(int[] a) {
        int[] palindrome = new int[a.length * 2 - 1];
        for (int i = 0; i < a.length; i++) {
            palindrome[i] = a[i];
            palindrome[palindrome.length - i - 1] = a[i];
        }
        return palindrome;
    }

    //JV A/B
    public static boolean constantSumNextTwo(int[] a) {
        boolean symilarity = true;
        int soucet;
        int minulySoucet = a[0] + a[1];
        for (int i = 2; i < a.length; i++) { //JV jenom pozor, kdyby tam nebylo 2x i++, pole by pro i+1 preteklo
            soucet = a[i] + a[i + 1];
            if (minulySoucet != soucet) {
                symilarity = false; //JV rovnou return symilarity - jinak zbytecne kontroluje dal
            }
            i++;
        }
        return symilarity;
    }
    
    //JV B
    public static boolean testEven(int[] a) { //JV mela to byt matice tj. dvourozmerny pole
        boolean even = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] % 2 != 0) { //JV stacilo otestovat prvni prvek, ze je sudy a kladny a vsechny ostatni jen o 2 vetsi
                even = false; //JV podobne jako predtim, hned udelejte return, nema smysl testovat cokoliv dal
            }
            if (a[i + 1] - a[i] != 2) {
                even = false;
            }
            if (a[i + 1] <= a[i]) { //JV tohle je zbytecny
                even = false;
            }
        }
        return even;
    }
    
    //JV A/B
    public static int[][] alter01(int[][] a) { //JV vstupni parametry by byly lepsi jen m, n
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if ((i + j) % 2 == 1) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }

        }
        return a;
    }

}
