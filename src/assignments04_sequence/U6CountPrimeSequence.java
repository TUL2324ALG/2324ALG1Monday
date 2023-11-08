/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignments04_sequence;

import java.util.Scanner;

public class U6CountPrimeSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int nPrime = 0;
        boolean prime = true;
        System.out.println("zadej kladna cisla (Zadej 0 nebo min abych ukoncit): ");
        while ((num = sc.nextInt()) > 0) {
            prime = true; //reinicializece pro nove num
            if(num == 1){ //limitni pripad, neplati na nej stejna pravidla
                prime = false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {

                nPrime++;
            }

        }
        System.out.println(nPrime);

//            if (prime) {
//
//                nPrime++;
//            }
//            System.out.println(nPrime);
    }

}


