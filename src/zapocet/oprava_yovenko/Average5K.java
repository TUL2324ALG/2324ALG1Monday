
package zapocet.oprava_yovenko;

import java.util.Arrays;
import java.util.Scanner;

public class Average5K {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      while(true){
          System.out.println("Zadejte čas 10 běhů na 5km, oddělené mezerami(méně  než 10 - program ukonci:");
          
          String input = sc.nextLine();
          String[] t = input.split(""); //JV rozdelit podle mezer
          
            if(t.length!=10){
              break;
            }
            double[] tInmin=new double[10];
             for(int i=0; i<10; i++){ //JV vhodne 10 nastavit jako konstantu
                     tInmin[i]=Double.parseDouble(t[i]);
             }
             
             Arrays.sort(tInmin); 
             double sum=0;
             for( int i = 0; i<9; i++){ //JV nemel se zapocitat nejpomalejsi a nejrychlejsi cas
                 sum+= tInmin[i]; 
             }
             double average = sum/8;
             double averagePerKm = average /5;
             System.out.println("Průměrný čas na 1 km je:" + String.format("%.2f", averagePerKm)+ "min");
             System.out.println("");
             
             }
    }
    }

