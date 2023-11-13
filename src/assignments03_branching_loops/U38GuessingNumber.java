package assignments03_branching_loops;

import java.util.Scanner;

public class U38GuessingNumber {
    public static Scanner sc = new Scanner(System.in); //globalni promenna
    
    public static void main(String[] args) {
        
        boolean end = false;
        int choice;
        do{
            //zobrazit menu
            displayMenu();
            //nacist volbu
            choice = readChoice();
            //zpracovat volbu
            end = processChoice(choice);
            
        }while(!end); //end == false
            
    }

    private static void displayMenu() {
        System.out.println("1. Hada pocitac");
        System.out.println("2. Hada uzivatel");
        System.out.println("3. Zmen rozsahy");
        System.out.println("0. Konec");
    }
    
    private static int readChoice(){
        System.out.println("Zadej volbu");
        int choice = sc.nextInt();
        return choice;
    }

    private static boolean processChoice(int choice) {
        switch (choice){
            case 1: computerGuesses(); break;
            case 2: userGuesses(); break;
            case 3: changeRange(); break;
            case 0: return true;
            default: System.out.println("Nevalidni vstup");
        }
        return false;
    }

    private static void computerGuesses() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void userGuesses() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void changeRange() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
