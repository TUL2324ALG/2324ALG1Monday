package zapocet.monday_lukes;

import java.util.Scanner;

public class AppArray {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double y = 1;
        while (y > 0) {
            System.out.println("Zadejte počet čísel v posloupnosti:");
            int size = sc.nextInt();
            int[] matice = new int[size];
            if (size > 0) {
                System.out.println("Zadejte posloupnost:");
                for (int i = 0; i < matice.length; i++) {
                    matice[i] = sc.nextInt();
                }
                int[] x = Methods.createPalindrom(matice);
                System.out.println("Vytvořený palindrom:");
                System.out.print("{");
                for (int k = 0; k < x.length; k++) {
                    if (k < x.length - 1) { //JV posledni prvek vypsat mimo for, aby jste se porad (v kazdem kroku cyklu) neptal "je to posledni prvek?"
                        System.out.print(x[k] + ", ");
                    } else {
                        System.out.print(x[k]);
                    }
                }
                            System.out.println("}");
          }
            else{
                System.out.println("Zadali jste neplatný údaj.");
            }
            System.out.println("Pokud nechcete dál pokračovat, zadejte záporné číslo, pokud ano, zadejte kladné.");
            y = sc.nextDouble();
        }
    }
}
