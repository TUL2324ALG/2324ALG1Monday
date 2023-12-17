package zapocet_monday.monday_iker;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Iker-L-9691
 */
public class Methods {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[][] Matice = {
                            {2, 4, 6,},
                            {8, 10, 12},
                            {14, 16, 18}
                            };
        System.out.println("Test even " + testEven(Matice));    //Funguje z 1/2
        System.out.println("Palindom je " + createPalindom(a));
        System.out.println("Alter" + alter01());
        System.out.println("Sum Next Two " + constantSuNextTwo(a));
    }
    public static int[] createPalindom(int[] a){
        //projeti pole
        for(int i = 0; i < a.length; i++){
           //posloupnost potrebuje otocit
           //1 2 3 -> 1 2 3 2 1 old + new //JV toto uz bylo napsano v zadani
           
        }
        return a;
    }
    //JV nedela to, co ma
    public static boolean constantSuNextTwo(int[] a){
        int sum = 0;
        //Prosetreni pole
        for(int i = 0; i < a.length; i ++){
            sum += a[i]; //JV z jakeho duvodu delate sumu vsech cisel?
            //Cislo + cislo o jedno vice
            if (a[i] + a[i+1] == a[i] + a[i+1]) //JV toto bude porad true
            {
                return false;
            }
        }
        return true;
    }
    //JV nedela to, co ma
    public static boolean testEven(int[][]Matice){
        int sum = 0;
        int tempsum = 0;
        //Filtr na suda cisla
        for(int i = 0; i < Matice.length; i++){
            for (int j = 0; j <  Matice[i].length;j++){
                //pokud je cislo liche zrusi se cyklus
                sum += Matice[i][j];
                if(sum % 2 == 1)
                {
                    return false;
                }
            }
        }
        
        //Filtr na po sobe jdouci cisla
        for(int i = 0; i < Matice.length; i++){
            for (int j = 0; j <  Matice[i].length;j++){
                tempsum +=Matice[i][j];
                //if(Matice[i][j] == Matice [i+2][j])
                {
                    //return false;
                }
            }
        }
        
        return true;
    }
    public static int[][] alter01(){ //JV velikost matice jako vstupni parametr, ma to tvorit pro libovolnou velikost
        
        int m = 2;
        int n = 2;
        int[][] matice = new int[m][n];
        //projeti radku matice
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice[i].length; j++){
                //i11 = 0, i12 = 1 atd.
                matice[0][0] = 0;
                matice[0][1] = 1;
                matice[1][0] = 0;
                matice[1][1] = 1;
            }
        }
        for(int i = 0; i < matice.length; i++){
            for(int j = 0; j < matice[i].length; j++){
                //System.out.( matice);
            }
        }
        
        return matice;
    }
}

