/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.oprava_kluh;

import java.util.Scanner;

/**
 *
 * @author Kluh-P-e56d
 */
public class Average5K {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double times[] = new double[10];
      //double[] times2 = {22.6,21.8,20.03,24.5,21.8,28.4,22.5,23.9,22.9,21.5};
        double max = Double.MIN_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        double min = Double.MAX_VALUE;
        double total = 0;
        int opakovat;
        boolean repeat = true;

        do {

            System.out.println("Zadejte 10 casu");
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < times.length; i++) {
                times[i] = sc.nextDouble();
            }

            //nemaz
            for (int i = 0; i < times.length; i++) {
                if (times[i] < min) {
                    min = times[i];
                    indexMin = i;
                }

            }
            for (int i = 0; i < times.length; i++) {
                if (times[i] > max) {
                    max = times[i];
                    indexMax = i;
                }

            }
            for (int i = 0; i < times.length; i++) {
                if ((i != indexMax) && (i != indexMin)) {
                    times[i] = (times[i] / 5); //JV zbytecne delit v kazdem kroku cyklu
                }

            }
//        print(times);
            for (int i = 0; i < times.length; i++) {
                if ((i != indexMax) && (i != indexMin)) {
//JV mate pod sebou 2x stejne prochazeni pole s vynechavanim min a max, dali sa spojit                   
                    // times[i] = (times[i] / 5);
                    total = total + times[i];
                }

            }
            total = total / 8; //JV delit 5 se mohlo jednou az zde
            System.out.println("Prumer je " + total + "minut");
            System.out.println("Prejete si okapovat? ano = 1/ne = 0");
            opakovat = sc.nextInt();

        } while (opakovat == 1);
    }

    public static void print(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }

}
