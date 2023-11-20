package assignments06_array;
import java.util.Scanner;

public class U2ArrayTools {
public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //int[] b = new int[5];
        int[] b = {2, 8, 4, 6, -5}; //staticky inicializator
        int sum = U2ArrayTools.sum(b);
        System.out.println(sum);
        print(b);
        print2(b);
        System.out.println("Maxmimalni hodnota je " + max(b));
        System.out.println("Index prvniho maxima je " + position(b));
        System.out.println("Pocet vyskytu je " + vyskyt(b,4));
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
     public static int vyskyt(int[] a, int hodnota){
      
         int pocet = 0;
         for (int i = 0; i < a.length; i++){
             if (hodnota == a[i]){
                 pocet ++;
             }
         }
         return pocet;
     }
     public static boolean vzestupne(int[] a){
         boolean vzestupne = true;
         for (int i = 0; i < a.length-1; i++){
             if (a[i] >= a[i+1]){
                 vzestupne = false;
                 break;
             }
         }
         return vzestupne;
     }
}
