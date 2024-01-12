/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.oprava_kluh;

/**
 *
 * @author Kluh-P-e56d
 */
public class Tools {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] a = {4,2,1,3};
       int[] b = {3,1,2,4};
        System.out.println(areSameArrays(a,b));
        
        
        
        
        
        int n = 6;
        print(createOneMatrix(n));
        
    }

    public static boolean areSameArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        int[]rozdil=new int[a.length];
        //JV vhodne naucit se nektery z tradicnich tridicich algoritmu
        boolean sortA = true;
        do {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    
                        
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        
                    

                }

            }
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    sortA = false;
                }

            }
                 
        } while (sortA == false);

        boolean sortB = true;
        do {
            for (int i = 0; i < b.length - 1; i++) {
                if (b[i] > b[i + 1]) {
                    
                        int temp = 0;
                        temp = b[i];
                        b[i] = b[i + 1];
                        b[i + 1] = temp;
                    

                }

            }
            for (int i = 0; i < b.length - 1; i++) {
                if (b[i] > b[i + 1]) {
                    sortB = false;
                }

            }

        } while (sortB == false);
        for (int i = 0; i < a.length; i++) {
             rozdil[i]=a[i]-b[i]; //JV stacilo porovnat a[i] != b[i]
        }
        for (int i = 0; i < rozdil.length; i++) {
            if(rozdil[i]!=0){
            return false;
            }
            
        }
        return true;
    }
    public static double[][] createOneMatrix(int n) {
        double one[][] = new double[n][n];
        for (int i = 0; i < one.length; i++) {
            one[i][i] = 1;

        }
        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < one.length; j++) {
                if (one[i][j] != 1) { //JV mohl jste spojit dohromady if(i == j) one[i][j] = 1;
                    one[i][j] = 0;
                }

            }

        }
        return one;
    }

    public static void print(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println("");
        }
    }

}
