/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet_monday.monday_kluh;

/**
 *
 * @author Kluh-P-e56d
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int b[] = {12, 2, 5, 9, 7, 7};
        int c[][] = {{2, 4}, {6, 10}};
        System.out.println(testEven(c));
        System.out.println(constantSumNextTwo(b));
        int d[] = {1,2,3};
        //JV int[] pal = createPalindom(d);

    }

    public static int[] createPalindom(int[] a) {
        int[] b = new int[(a.length) + (a.length - 1)];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];

        }
        
        
        for (int i = 0; i < a.length-1; i++) {
            b[a.length-1+i] = a[i];

        }
        
        return b;
    }
    
    //JV A/B
    public static boolean constantSumNextTwo(int[] a) {
        boolean isConstant = true;
        if ((a.length % 2) != 0) {
            return false;
        }
        //JV stacilo si udelat sumu prvni dvojice a zacit od i = 2 a porovnavat vuci te prvni sume
        for (int i = 0; i < a.length - 2; i = i + 2) {
            if ((a[i] + a[i + 1]) != (a[i + 2] + a[i + 3])) {//JV kdyby nebylo i = i + 2, tak by vam to preteklo, kdyz a.length = 6, posledni i by bylo 3
                                                             //i + 3 by bylo 6 a takovy index neexistuje
                isConstant = false;
                return isConstant;
            }

        }
        return isConstant;

    }

    public static boolean testEven(int[][] a) {
        boolean isEven = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] % 2 != 0) {
                    isEven = false;
                    return isEven;
                }

            }

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length - 1; j++) {
                if (a[i][j + 1] != a[i][j] + 2) { //JV to nebude fungovat - vyuzit promennou predchozi a ulozit si do ni vzdy novy prvek
                    isEven = false;
                    return isEven;

                }

            }
        }

        return isEven;
    }
}
//    public static int alter01(int m, int n){
////    int [][] A = new int [m][n];
////        if (n%2==0){
////          
////        
////        
////        }
////            
////        }
//    
//    }
//    

