/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet_monday.monday_zucha;

import java.util.Scanner;

/**
 *
 * @author Zucha-M-e5c9
 */
//JV A - na zkousce nemusite zatim osetrovat vstupy
public class AppMatrix {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Vítejte v programu na testování matic.");
        
        boolean continueProgram = true;
        
        while(continueProgram) {
            continueProgram = matrixRuntime();
        }
    }
    
    public static boolean matrixRuntime() {
        boolean continueProgram = true;
        int[][]matrix;
        
        int rows = 0;
        int columns = 0;
        System.out.print("Zadejte počet řádků matice jako jedno celé číslo: ");
        
        try {
            rows = sc.nextInt();
        }
        catch (Exception ex) {
            System.out.println("Chyba vstupu");
            return continueProgram; //JV delala bych jeden try catch, kdyz je stejny pro oba pripady
        }
        
        System.out.print("Zadejte počet sloupců matice jako jedno celé číslo: ");
        
        try {
            columns = sc.nextInt();
        }
        catch (Exception ex) {
            System.out.println("Chyba vstupu");
            return continueProgram;
        }
        
        sc.nextLine(); 
        matrix = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            System.out.print("Zadejte prvky " + (i + 1) + ". řádku matice jako celá čísla oddělená mezerami: ");
            String[] splitInput = sc.nextLine().split(" ");
            if (splitInput.length != columns) {
                System.out.println("Délka vstupu neodpovídá");
                return continueProgram;
            }

            int[] sequence = new int[splitInput.length];

            try {
                for (int j = 0; j < splitInput.length; j++) {
                    sequence[j] = Integer.parseInt(splitInput[j]);
                }
            }
            catch (Exception ex) {
                System.out.println("Chyba vstupu");
                return continueProgram;
            }
            
            matrix[i] = sequence;
            
        }
        
        
        System.out.println("Matice, kterou jste zadali: ");
        
        for (int i = 0; i < rows; i++) {
            System.out.print("\n{" + matrix[i][0]);
            for (int j = 1; j < columns; j++) {
                System.out.print(", " + matrix[i][j]);
            }
            System.out.print("}\n");
        }
        
        boolean isEven = Methods.testEven(matrix);        
        
        System.out.println(isEven ? "Prvky matice splňují podmínku na sudost a posloupnost" : "Prvky matice nesplňují podmínku na sudost a posloupnost");
            
        System.out.println("Přejete si pokračovat ve vytváření palindromů? Napiště znak \"y\" pro pokračování, napiště cokoliv jiného pro ukončení programu.");
        
        String continueScan = sc.next();
        
        continueProgram = "y".equals(continueScan);
        sc.nextLine();        
        
        return continueProgram;
    }
    
}
