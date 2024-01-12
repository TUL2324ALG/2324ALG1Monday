/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.oprava_svoboda;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Svoboda1-J-adc2
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {2,3,4};
        
        System.out.println(areSameArrays(a,b));
        
        
        
        //System.out.println(Arrays.deepToString(createOneMatrix()));
        //createOneMatrix();

    }
    //JV nestaci, aby suma poli byla stejna
    public static boolean areSameArrays(int[] first, int[] second) {
        int secsum = 0;
        int firstsum = 0;
        boolean stejne = true;
        if (first.length != second.length){
            return false;
        }
        
        for (int i = 0; i < second.length; i++) {
            secsum = second[i];  
        }
        for (int i = 0; i < first.length; i++) {
            firstsum = first[i];   
        }
        if (firstsum != secsum){
            return false;
        }
        
        return stejne;
    }

    public static int[][] createOneMatrix() { 
        System.out.println("Zadej rozměr matice:"); //JV kdyz je to metoda, mela by mit n jako vstupni parametr (bez nacitani)
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //int n = 4;
        
        int[][] matrix = new int[n][n];  //při vygenerování nové matice má matice nulové hodnoty
        
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix.length; j++) { //JV druhy for nepotrebujete j nikde nevyuzivate, jen tolikkrat prepisujete stejne misto na 1
                matrix[i][i] = 1;
            }
        }
        //System.out.println(Arrays.deepToString(matrix));
        return matrix;
    }

}
