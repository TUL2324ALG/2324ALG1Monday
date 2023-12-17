
package assignments06_array;

import java.util.Scanner;
public class U3ReverseProgram {

    public static Scanner sc = new Scanner(System.in); //globalni promenna, viditelna v cele tride, ve vsech metodach
    
    public static void main(String[] args) {
        System.out.println("Zadej počet prvků: ");
        int n = sc.nextInt();
        int[] pole = new int[n];
        
        System.out.println("Zadávej prvky: ");
        for (int i = 0; i < pole.length; i++) {
            pole[i] = sc.nextInt();
            
        }
        int[] ra = U2ArrayTools.reverseArray(pole);
        System.out.println("Původní pole: ");
        U2ArrayTools.print(pole);
        System.out.println("");
        System.out.println("Otočené pole: ");
        U2ArrayTools.print(ra);
        System.out.println("");
    }
    
    public static int[] loadArray(){ //mohla by mit vstup Scanner
        System.out.println("Zadej počet prvků: ");
        int n = sc.nextInt();
        int[] pole = new int[n];
        
        System.out.println("Zadávej prvky: ");
        for (int i = 0; i < pole.length; i++) {
            pole[i] = sc.nextInt();
            
        }
        return pole;
    }
    
}
