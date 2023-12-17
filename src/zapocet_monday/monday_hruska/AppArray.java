package zapocet_monday.monday_hruska;

import java.util.Arrays;
import java.util.Scanner;

public class AppArray {

    public static void main(String[] args) {

        System.out.println("Aplikace pro Palindrom");
        Scanner sc = new Scanner(System.in);

        boolean volba = true;
        while (volba) {            
            System.out.println("Zadejte velikost pole: ");
            int velikost = sc.nextInt();
            int[] pole = new int[velikost];
            
            System.out.println("Zadavejte hodnoty: ");
            for (int i = 0; i < velikost; i++) {
                pole[i] = sc.nextInt();
            }
            
            System.out.println("Vase palindromaticke pole je:");
            int[] palindom = Methods.createPalindom(pole);
            //System.out.println(Arrays.toString(palindom));
            vypisPole(palindom);
            
            System.out.println("Prejete si pokracovat?\n1 - ano\n0 - ne");
            int pokracovat = sc.nextInt();
            switch (pokracovat) {
                case 0:
                    volba = false;
                    break;
                case 1:
                    volba = true;
                    break;
                default: 
                    volba = false;
                    break;
            }
        }
    }

    public static void vypisPole(int[] pole){
        System.out.print("{ ");
        for (int i = 0; i < pole.length-1; i++) {
            System.out.print(pole[i] + ", ");
        }
        System.out.print(pole[pole.length-1] + " }\n");
    }
    
}
