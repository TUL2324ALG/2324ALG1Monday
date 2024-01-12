/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.oprava_hellerova;

/**
 *
 * @author Hellerova-S-43d7
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //true
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        //false
        int[] c = {1, 2, 3, 4};
        int[] d = {5, 8, 1};
        
        int prvek = 2;
        int cetnost = cetnost(prvek, a);
        System.out.println("Hodnota " + prvek + " se v poli nachází " + cetnost + "krát");

        boolean stejne = areSameArrays(a, b);
        System.out.println("Stejné? " + stejne);

        int velikost = 4; //parametr n pro velikost matice
        int[][] jednotkova = jednotkovaMatice(velikost);
        //vypis matice
        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                System.out.print(jednotkova + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] jednotkovaMatice(int velikost) {
        int[][] mat = new int[velikost][velikost];
        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                mat[i][j] = (i == j) ? 1 : 0;
            }
        }
        return mat;
    }
    
    //JV fungovalo by, kdyby museli byt hodnoty i ve stejném poradi
    public static boolean areSameArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
//                if (a[i] != b[i] && a.length != b.length) {
                if (a[i] != b[i]) {
                    return false;
                }
                if (a.length != b.length){
                    return false;
                }
            }
        }
        return true;
    }
    
    //nestihla 
    public static int cetnost(int prvek, int[] a){
        int cetnostPrvku = 0;
        for(int i = 0; i < a.length; i++){
            if( prvek ){
                cetnostPrvku++;
            }
        }
        return cetnostPrvku;
    }

}
