
package zapocet.oprava_saltovskyi;

import java.util.Scanner;


public class RowNorms {

     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int matrix[][] = new int[1][2];
        fillArray(matrix);
    }
     public static void fillArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Napiste body matice 1: rad: " + (i + 1) + " st: " + (j + 1));
                matrix[i][j] =  sc.nextInt();

            }
            System.out.println();
        }

    }
      public static boolean radkovaNorma(int[][] matrix){
          boolean isNorm=true;
          
      for (int i = 0; i < matrix.length; i++) {
              // int norma=Math.abs(2);
              int norma=0;
            for (int j = 0; j < matrix[i].length; j++) {
            if(norma%2==0){
            isNorm=false;
            break;
            }
      
            }
      }
      return isNorm;
      }
}
