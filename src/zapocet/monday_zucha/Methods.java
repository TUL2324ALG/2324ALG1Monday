/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.monday_zucha;

/**
 *
 * @author Zucha-M-e5c9
 */
public class Methods {
    
    //JV A
    public static int[] createPalindrom(int[] input) {
        if (input.length == 0) {
            return new int[0];
        }
        
        final int palindromLength = input.length*2 - 1;
        int[] result = new int[palindromLength];
        
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
            result[palindromLength - i - 1] = input[i];
        }
        
        return result;
    }
    
    //JV A/B
    public static boolean constantSumNextTwo(int[] input) {
        if ((input.length % 2 == 1) || (input.length < 2)) {
            return false;
        }
        
        int sum = input[0] + input[1];
        
        for (int i = 2; i < input.length; i=i+2) { //JV jen pozor pokud byste neskakal po i+2 pole by na i+1 preteklo
            if(input[i] + input[i+1] != sum) {
                return false;
            }
        }        
        
        return true;
    }
    
    //JV A
    public static boolean testEven(int[][] input) {
        if (input.length == 0) {
            return false;
        }
        if (input[0].length == 0) {
            return false;            
        }
        
        int testedValue = input[0][0];
        
        if (testedValue % 2 == 1) { //JV ok test, jestli prvni cislo je sude
            return false;
        }
        
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input[0].length; j++) {
                if (input[i][j] != testedValue + 2) {
                    return false;
                }
                
                testedValue = testedValue + 2;
            }
        }
        
        return true;
    }
    
    public static int[][] alter01(int m, int n) {
        int[][] result = new int[m][n];
        
        if (m == 0 || n == 0) {
            return result;
        }
        
        int counter = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = counter;
                counter++;
                counter %= 2;
            }
        }       
        
        return result;
    }
}
