/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.monday_zucha;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Zucha-M-e5c9
 */
public class AppArray {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Vítejte v programu na hledání palindromů.");
        
        boolean continueProgram = true;
        
        while(continueProgram) {
            continueProgram = palindromRuntime();
        }
    }
    
    public static boolean palindromRuntime() {
        boolean continueProgram = true;
        
        System.out.println("Zadejte posloupnost čísel oddělenou mezerami: ");
        
        String input = sc.nextLine();
        
        String[] splitInput = input.split(" ");
        
        if (splitInput.length < 1) {
            System.out.println("Sekvence čísel by měla být dlouhá alespoň 1.");
            return continueProgram;
        }
            
        int[] sequence = new int[splitInput.length];
        
        try {
            for (int i = 0; i < splitInput.length; i++) {
                sequence[i] = Integer.parseInt(splitInput[i]);
            }
        }
        catch (Exception ex) {
            System.out.println("Chyba vstupu");
            return continueProgram;
        }
        
        int[] result = Methods.createPalindrom(sequence);
        
        System.out.print("\n{" + result[0]);
        
        for (int i = 1; i < result.length; i++) {
            System.out.print(", " + result[i]);
        }
        
        System.out.print("}\n\n");
        
        System.out.println("Přejete si pokračovat ve vytváření palindromů? Napiště znak \"y\" pro pokračování, napiště cokoliv jiného pro ukončení programu.");
        
        String continueScan = sc.next();
        
        continueProgram = "y".equals(continueScan);
        sc.nextLine();
        return continueProgram;
    }
}
