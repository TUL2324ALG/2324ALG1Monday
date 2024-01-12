/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.monday_arzhenkov;

public class Methods {

    public static void main(String[] args) {
        int[] main = {1, 5, 8};
        
        //int[] Palindom = createPalindom(main);
        //System.out.println("Palindom: " + Palindom); //JV vypise jen odkaz do pameti, vypsani pole pres for
        
        //boolean SumNextTwo = constantSumNextTwo(main);
        //System.out.println("SumNextTwo? " + SumNextTwo);
        
        boolean Even = testEven(main);
        System.out.println("Even? " + Even);
        
        int m = 3;
        int n = 5;
        int[][] alter = alter01(m, n);
        System.out.println(alter);
    }
    
    //JV A/B
    public static int[] createPalindom(int[] main){
        int[] Palindom = {2 * main.length - 1}; //JV delka pole se deklaruje jinak
        for (int i = 0; i < main.length-1; i++){
            Palindom[i] = main[i];
            Palindom[2 * main.length - i - 2] = main[i]; 
            
        }
        return Palindom;
    }
    
    //JV A/B
    public static boolean constantSumNextTwo(int[] main){
        boolean SumNextTwo = true;
        if (main.length % 2 !=0){
            SumNextTwo = false; //JV ukoncujte metodu, kdyz vite vysledek
        }
        for (int i = 0; i < main.length; i+=2){ //JV kdyby tam nebylo i+=2, na i+1 by pole preteklo, teď pretece pokud pocet prvku v poli je lichy
           if(main[i] + main[i + 1] != main[0] + main[1]){
               SumNextTwo = false; //JV hned ukoncujte cyklus, metodu - nema smysl pokracovat
           }    
        }
        return SumNextTwo;
    }
    
    //JV C
    public static boolean testEven(int[] main){ //JV testujete jen sudé a ne ze jsou za sebou a kladne
        boolean Even = true;
        for (int i = 0; i < main.length; i++){
            int test = main[i];
            if( test / 2 != 0){
                Even = false;
            }
        }
        return Even;
    }
    
    //JV A/B
    public static int[][] alter01(int m, int n){
        int[][] alter = new int[m][n];
        for (int i = 0; i < m; i++){
           for (int j = 0; j < n; i++){ //JV tady j++
               alter[i][j] = (i + j) % 2; 
           } 
        }
        return alter;
    }
    
}
