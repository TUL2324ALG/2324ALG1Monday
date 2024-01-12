/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.oprava_hellerova;

import java.util.Scanner;

/**
 *
 * @author Hellerova-S-43d7
 */
public class Average5K {

    /**
     * @param args the command line arguments
     */
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program na prumernou rychlost");
        boolean pokracovat = true;
        while (pokracovat) {
            System.out.println("Zadej 10 časů: ");
            //int[] casy = sc.nextInt
//            double time1 = sc.nextInt();
//            double time2 = sc.nextInt();
//            double time3 = sc.nextInt();
//            double time4 = sc.nextInt();
//            double time5 = sc.nextInt();
//            double time6 = sc.nextInt();
//            double time7 = sc.nextInt();
//            double time8 = sc.nextInt();
//            double time9 = sc.nextInt();
//            double time10 = sc.nextInt();

//            System.out.println("Tvé časy jsou: " + time1 + time2 + time3 + time4 + time5 + time6 + time7 + time8 + time9 + time10);

             // return (double) hod / min (z pouze 8 časů)
             
//             int max =  nejvetsiCas(casy);
//             int min =  nejmensiCas(casy);

//             System.out.println("Nejkratší čas: " + min);
//             System.out.println("Nejdelší čas: " + max);
               //déle pracovat s časy bez těchto
             
//             public static int nejvetsiCas(int maxCas){
//                 int max = Integer.MIN_VALUE;
//                 for(int i = 0; i < casy.legth; i++){
//                     if(cas > max){
//                         max =+ cas;
//                     }
//                 }
//             }
//             
//             public static int nejmensiCas(int minCas){
//                 int min = Integer.MAX_VALUE;
//                 for(int i = 0; i < casy.legth; i++){
//                     if(cas < max){
//                         min =+ cas2;
//                     }
//                 }
//             }

            System.out.println("Chceš pokracovat? 0 - ne, 1 - ano");
            int odpoved = sc.nextInt();

            switch (odpoved) {
                case 0:
                    pokracovat = false;
                    break;
                case 1:
                    pokracovat = true;
                    break;
                default:
                    pokracovat = false;
                    break;
            }

        }

    }

}
