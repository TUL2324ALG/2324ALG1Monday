package zapocet_monday.monday_iker;
import java.util.Scanner;
/**
 *
 * @author Iker-L-9691
 */
public class AppMatrix {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadejte pocet radku a slopcu matice: ");
        //Generace matice od uzivtele
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] Matice = new int [rows][columns];
        System.out.println("Zadejte hodnoty matice");
        for(int i = 0; i < Matice.length; i++){
            for(int j = 0; j < Matice[i].length;j++){
            Matice[i][j] = sc.nextInt();
            }
        }
        //import metody
        boolean testEven = Methods.testEven(Matice);
        //vypis True/False //JV v programu to uzivateli vypisujte jako vetu napr. pomoci ternarniho operatora
        System.out.println(testEven);
    }    
}
