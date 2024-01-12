/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.oprava_svoboda;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Svoboda1-J-adc2
 */
public class RowNorms {
    public static void main(String[] args) {
        //System.out.print(Arrays.deepToString(fillmatrix()));
        System.out.print(checknum(fillmatrix()));        
        
        
    }

    public static int[][] fillmatrix() {
     
       System.out.println("Zadej rozměr pole n a m:");
        Scanner input = new Scanner(System.in); 
        int n = input.nextInt();
        int m = input.nextInt();
        
        int[][] matrix = new int[n][m];
        System.out.println("Zadej hodnoty do matice:");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
                
            }
        }
         return matrix;
     
    
    
    }

    public static boolean checknum(int[][] matrix) {
        boolean itis = true;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0){
                    itis = false; //JV ukoncovat test, pokud jedno zaporne cislo metoda muze hned vratit false
                }
                
            }
            
        }
        
        double norm = 0;
        int sum = 0;
        double tempnorm;
        for (int k = 0; k == 0; k++) { //JV tohle je divne, probehne vzdy jenom jednou, napsat v matrix[k][j] misto k 0 matrix[0][j]
            for (int j = 0; j < matrix.length; j++) {
                sum = sum + matrix[k][j]*matrix[k][j]; 
            }
        }
        tempnorm = Math.sqrt(sum);
        sum = 0;
        //System.out.println(tempnorm + "sum" + sum);
        
        for (int i = 1; i < matrix.length; i++) {
            norm = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j]*matrix[i][j]; 
            }
            norm = Math.sqrt(sum);
            //System.out.println(norm + "sum" + sum);
            if (tempnorm != norm){
                itis = false; //JV ukoncovat test, pokud se jednou nerovnaji, metoda muze hned vratit false
            }
            tempnorm = norm;
            
        }
        //itis = (itis = false)? true : false;
    return itis;
    }
    
    
    
}
