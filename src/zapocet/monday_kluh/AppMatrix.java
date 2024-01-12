/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.monday_kluh;

import java.util.Scanner;
import mondaykluh.Methods;

/**
 *
 * @author Kluh-P-e56d
 */
public class AppMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int row;
       int col;
       
       System.out.println("Zadejte pocet radku");
       row = sc.nextInt();
       System.out.println("Zadejte pocet sloupcu");
       col = sc.nextInt();
       int[][]A=new int[row][col];
        System.out.println("Zadavejte cisla po radcich");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j]=sc.nextInt();
                
            }
        }
        printMatrix(A);
        Methods.testEven(A);
        if( Methods.testEven(A)==true){ //JV staci napsat if(Methods.testEven(A))
            System.out.println("Matice obsahuje pouze po sobě jdouci kladna"
                    + " suda cisla ");
        }else{
            System.out.println("Matice neobsahuje jen po sobě jdouci suda"
                    + " kladna cisla");
        }
        
    }
    
    
    
    
    
    public static void printMatrix(int[][]A){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]);
                
            }
            System.out.println("");
        }
    }
    
}
