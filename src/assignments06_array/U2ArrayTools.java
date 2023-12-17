package assignments06_array;

import java.util.Scanner;

public class U2ArrayTools {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //int[] b = new int[5];
        int[] b = {2, 8, 4, 6, -5}; //staticky inicializator
//        int sum = U2ArrayTools.sum(b);
//        System.out.println(sum);
//        print(b);
//        print2(b);
//        System.out.println("Maxmimalni hodnota je " + max(b));
//        System.out.println("Index prvniho maxima je " + position(b));
//        System.out.println("Pocet vyskytu je " + vyskyt(b,4));
        int[] ra = reverseArray(b);
        print(ra);
        System.out.println("");
        print(b);
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void print2(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1]);
        System.out.println("]");
    }

    //c
    public static int max(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    //e
    public static int position(int[] a) { //indexOf
        int max = Integer.MIN_VALUE;
        int position = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) { //prvni vyskyt
                //if (a[i] >= max) { //posledni vyskyt
                max = a[i];
                position = i;
            }
        }
        return position;
    }
    //f

    public static int vyskyt(int[] a, int hodnota) {

        int pocet = 0;
        for (int i = 0; i < a.length; i++) {
            if (hodnota == a[i]) {
                pocet++;
            }
        }
        return pocet;
    }

    public static boolean vzestupne(int[] a) {
        boolean vzestupne = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) {
                vzestupne = false;
                break;
            }
        }
        return vzestupne;
    }

    //puvodni pole nemenim, vytvorim a vratim nove
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            reversedArray[i] = array[j];
//        }
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length-1-i];
        }

        return reversedArray;
    }
    
    //menim puvodni pole a nic nevracim
    public static void reverseArray1(int[] array){
        int temp;
        for(int i = 0; i < array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
    
    public static int[] shuffle (int n){
        int[] a = fill1ToN(n);
        fisherYates(a);
        return a;
    }
    
    public static int[] fill1ToN (int n){
        return null;
    }
    
    public static void fisherYates(int[] a){
//        -- To shuffle an array a of n elements (indices 0..n-1):
//     for i from n−1 down to 1 do
//        j ← random integer such that 0 ≤ j ≤ i
//        exchange a[j] and a[i]
    }
}
