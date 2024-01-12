
package zapocet.oprava_yovenko;

import java.util.Scanner;

public class RowNorms {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte rozměry matice:");
        
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        double[][] matrix = new double[r][c];
        System.out.println("Zadejte prvky:");
        
            for(int i =0; i<r; i++){
                for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextDouble();
            }
            }
            
        boolean allPositive = true;
        double rNorm = 0;
        
        for(int i=0; i<r;i++){
            double sumNaDruhou=0;
             for(int j=0; j<c; j++){
            sumNaDruhou += Math.pow(matrix[i][j], 2);
             }
             else if (matrix[i][j]){
                     }
            }
         
 }
}
