package zapocet.oprava_iker;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Iker-L-9691
 */
public class RowNorms {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Inputs
        System.out.println("Zadejte X velikost matice:");
        int x = sc.nextInt();
        System.out.println("Zadejte Y velikost matice");
        int y = sc.nextInt();
        //Vytvoreni matice
        int matice[][] = new int[x][y];
        
        //Nacteni bodu matice od uzivatele
        System.out.println("Zadejte body matice : ");
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j <matice.length; j++){
                matice[i][j] = sc.nextInt();
            }
        }
        //Testovani zdali je nejake cislo zaporne
        boolean positive = true;
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice.length; j++){
                if(matice[i][j] < 0){
                    positive = false; //JV vhodne ukoncit cykly hned, jak najdu jedno zaporne 
                }
            }
        }
        if(positive = false){
            System.out.println("Matice ma v sobe zaporne cislo");
        }
        
        //Kontrola radkovych norem
        boolean isNorm = true;
        //Hodnoty jednotlivych radku umocnime na druhou a nasledne odmocnime a samozdrejme secteme
        //Nasledne je porovname se zbytkem radku pokud jsou stejne program vrati True pokud ne tak False
        
        //Porovnani jednoho raku s dalsim radkem, pokud se jiz prvni dva nebudou rovnat nema cenu pokracovat a program vrati false
        //if(norm[i] != norm[i +1]){
        //    isNorm false;  
        //}
        //Nasledne muzeme pridat podminku na vyhodnoceni jestli je matice RowNorms
        if(isNorm = false){
         System.out.println("Matice neni normovana na radkach");
        }else{
        System.out.println("Matice je normovana na radkach");
        }
        
        //prvne hodnoty radku secteme
        for(int i = 0; i < matice.length; i++){
            double sumaRadku;
            
        //radkz secteme
            
        //odmocnime radky   
            //Math.sqrt(sumaRadku);
        }
        
    }
}
