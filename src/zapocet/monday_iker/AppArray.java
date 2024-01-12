package zapocet.monday_iker;
import java.util.Scanner;
/**
 *
 * @author Iker-L-9691
 */
public class AppArray {
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Zadejte pocet prvku");
        //generace posloupnosti od uzivatele
        int rows = sc.nextInt();
        int[] a = new int [rows];
        int Palindom = 0;
        System.out.println("Zadejte prvky");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        //import metody
        int[] createPalindrom = Methods.createPalindom(a);
        //vypis //JV vypis pole pres prechod pole
        System.out.println("Palindom je " + Palindom);
    }
}
