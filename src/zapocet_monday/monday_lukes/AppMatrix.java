package zapocet_monday.monday_lukes;

import java.util.Scanner;
import static mondayLukes.AppArray.sc;

public class AppMatrix {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadejte počet čísel v posloupnosti:"); //JV tady melo byt nacteni matice
        int size = sc.nextInt();
        int[] matice = new int[size];
        if (size > 0) {
            System.out.println("Zadejte posloupnost:");
            for (int i = 0; i < matice.length; i++) {
                matice[i] = sc.nextInt();
            }
            boolean testEven = Methods.testEven(matice);
            if (testEven == false) {
                System.out.println("Matice není posloupnost celých po sobě jdoucích kladných sudých čísel.");
            } else {
                System.out.println("Matice je posloupnost celých po sobě jdoucích kladných sudých čísel.");
            }

        }
    }
}
