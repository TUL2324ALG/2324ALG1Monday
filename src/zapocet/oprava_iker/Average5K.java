package zapocet.oprava_iker;
import java.util.Scanner;
/**
 *
 * @author Iker-L-9691
 */
public class Average5K {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int prumer;
        int pocetbehu = 10;
        int celkcas = 0;
        int casy;
        int min = 0;
        int max = 0;
        int onekm;
        int y = 1;
        int[] pole = new int [10];
        
        //opakovanost programu od uzivatele se docili smyckou while ktera bude mit podminku, kterou muze uzivatel na konci zadat, zn muze program ukoncit ci pokracovat
        //Zatim jdou nacist pouze cela cisla desetinna jsem nestihl ale program jde pro ne upravit pomoci prepsani na !!! double !!!
        
        //Nacteni pole od uzivatele
        System.out.println("Zadejte 10 casu vaseho behu: ");
        for(int i = 0; i < pole.length; i++){
            pole[i] = sc.nextInt();
        }
        //JV suma, min a max by se dali delat najednou pri jednom pruchodu polem
        //Secteni casu v poly
        for(int i = 0; i < pole.length; i++){
            celkcas += pole[i];
        }
        
        //Separovani nejmensiho casu
        for(int i = 0; i < pole.length; i++){
            //Docasna promenna na nejmensi cas
            min = pole[0];
            //pokud je nejaky cas pole mensi (na i) nez jiny prvek priradi se mu jeho hodnota
            if(pole[i] < min)
            {
                min = pole[i];
            } 
        }
        for(int i = 0; i < pole.length; i++){
            //Docasna promenna na nejdelsi cas
            
            //Pokud je prvek vetsi nez dosavadni maximum priradi se do maxima
            if(pole[i] > max)
            {
                max = pole[i];
            } 
        }
        
        //odecteni nejkratsiho a nejdelsiho casu
        casy = (celkcas - min - max);
        //vypocet prumeru
        prumer =(casy / pocetbehu); //JV pokud jste dali pryc min a max musíte delit 8
        //Cas na 1 km
        onekm = prumer / 5 ;
        
        System.out.println(casy);
        
        System.out.println("vas prumerny cas behu na 5 kilometru je : " + prumer);
        System.out.println("Vas prumerny cas na 1 km je : " + onekm);
    } 
}
