package assignments04_sequence;

import java.util.Scanner;

public class U6CountPrimeSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean prime;
        int nPrime = 0;
        
        //1. Nacti cisla a zpracuj je
        System.out.println("Zadej kladna cisla, zadavani ukonci 0 nebo zapornym cislem: ");
        while ((num = sc.nextInt()) > 0) {
            //1.1. zjisti pro kazde cislo prvociselnost
            prime = true; //reinicializece pro nove num
            if(num == 1){ //limitni pripad, neplati na nej stejna pravidla
                prime = false;
            }
            for (int i = 2; i < num; i++) { //stacilo by jit po num/2, nebo dokonce odmocnina z num
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            //1.2. pokud je cislo prvocislo, zvys pocet prvocisel o 1
            if (prime) {
                nPrime++;
            }
        }
        //2. Vypis pocet prvocisel
        System.out.println(nPrime);
    }
}


