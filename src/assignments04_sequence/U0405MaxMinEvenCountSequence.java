package assignments04_sequence;

import java.util.Scanner;

public class U0405MaxMinEvenCountSequence {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Zadej pocet cisel");
        int n = sc.nextInt();
        int number; //deklarace mimo cyklus
        int max = Integer.MIN_VALUE; //pokud jen kladny, stacila by 0 nebo zaporny 
        int nMax = 0;
        int min = Integer.MAX_VALUE;
        int nEven = 0;
        
        if (n == 0) { //limitni ale validni pripad
            System.out.println("Byla zadana prazdna posloupnost");
        } else {
            System.out.println("Zadavej cisla");
            for (int i = 0; i < n; i++) {
                //System.out.println(i+1 + ". Ahoj"); //lepsi zacit i od 1
                number = sc.nextInt();
                if (number > max) {
                    max = number;
                    nMax = 1;
                }else if(number == max){
                    nMax++;
                }
                
                if(number < min){
                    min = number;
                }
                
                if(number % 2 == 0){
                    nEven++;
                }
            }
                System.out.println("Max hodnota je " + max);
                System.out.println("Min hodnota je " + min);
                System.out.println("Pocet sudych je " + nEven);
                System.out.println("Pocet vyskytu max je " + nMax);
            }

        }

    }
