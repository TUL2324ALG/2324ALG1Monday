/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.oprava_svoboda;

import java.util.Scanner;

/**
 *
 * @author Svoboda1-J-adc2
 */
public class Average5K {
    public static void main(String[] args) {
        
      boolean r = false;  
      do {
        fillarr();
          System.out.println("Pokud chcete znovu spustit program, napište číslo 1");
          Scanner sc = new Scanner(System.in); //JV scanner vytvaret jednou na zacatku programu
          int again = sc.nextInt();
          if (again != 1) {
              r = true;
          }
        
        
      }while(!r);
        
        
    }

    private static void fillarr() {
        
        System.out.println("Zadej 10 výsledných časů:");
        double[] time = new double[10];
        Scanner input = new Scanner(System.in); //JV scanner vytvaret jednou na zacatku programu
        double sum = 0;
        double min = 999999999;
        double max = 0;
        
        for (int i = 0; i < time.length; i++) {
            time[i] = input.nextDouble();
            sum += time[i];
            if (time[i] > max){
                max = time[i];
            }
            if (time[i] < min){
                min = time[i];
            }    
            
        }
        double average = (sum - min - max)/40; 
        
    
        System.out.println("Celkový čas " + sum + min + max);
        System.out.println("Průměrný čas za km: " + average + "min");
    }
}
