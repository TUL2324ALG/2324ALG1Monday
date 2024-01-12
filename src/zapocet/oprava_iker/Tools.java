
package zapocet.oprava_iker;
import java.util.Scanner;
/**
 *
 * @author Iker-L-9691
 */
public class Tools {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println();
    }
    //SameArrays
    public static boolean areSameArrays(int[] a){ //JV vstup by meli byt 2 pole
        boolean areSame = true;
        int[] poleVetsi = new int [10];
        int[] poleMensi = new int [5];
        int suma = 0;
        int sum = 0;
        int rozdil;
        //kontrola stejne delky pole
        //pri aplikaci by se jeste napsal cyklus ktery by na vetsi pole dosdil to vetsi z dvou, nejlepe pomoci prohozeni tzv"SWAP"
        for (int i = 0; i < poleVetsi.length;i++){
            if(poleVetsi.length != poleMensi.length){ //JV to neni potreba delat v cyklu, staci jen if
                return false;
            }
        }
        //Kontrola stejnych hodnot
        //Kontrolu provadim rozdilem obou poli a porovnanim vysledku neni to 
        //perfektni, jelikoz se muze stat ze suma jednoho pole je stejna jako
        //suma druheho pole ale s jinymi cisly //JV prave preto to nie je vhodny algoritmus
        for (int i = 0; i < poleVetsi.length; i++){
            suma += poleVetsi[i];
        }
        for (int i = 0; i < poleMensi.length; i++){
            sum += poleMensi[i];
        }
        rozdil = suma - sum;
        
        if(rozdil != 0){
            return false;
        }
        
        return true;
    }
    //Jendotkova matice
    public static int[][] createOneMatrix(){
        //Zadani parametru n od uzivatele
        System.out.println("Zadejte velikost matice (n): ");
        int n = sc.nextInt();
        //Inicializace matice a jeji velikosti
        int matice[][] = new int[n][n];
        //Cyklus pro tvorbu jednotkove matice matice
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice[0].length; j++){
                //na prvky typu 1/1 2/2 3/3 je dosazena 1 coz nam udela diagonalu plnou 1
                if(matice[i][j] == matice[i][j]){
                    matice[i][j] = 1;
                //pokud si prvky nejsou rovny, znamena to ze nejsou na diagonale a jsou nahrazeny 0
                }else{
                    matice[i][j] = 0;
                }
            }
        }
        return matice;
    }
}
