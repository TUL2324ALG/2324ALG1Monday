package assignments03_branching_loops;

import java.util.Scanner;
/**
 * 
 * Test: 780123, 3540
 */
public class U15BirthNumber {

    public static void main(String[] args) {
        String first;  //051011
        String second; //4832
        String birthNumber;
        boolean isValidBirthNumber;
        Scanner sc = new Scanner(System.in);

        //nacteni hodnot ze vstupu TODO: Ověřit načítání čísel
        System.out.print("Zadejte první část rodného čísla: ");
        first = sc.next();
        System.out.print("Zadejte druhou část rodného čísla: ");
        second = sc.next();

        //vypocty
        //1. ziskat prvnich 9 cislic
        birthNumber = first + second;
        int nineDigits = Integer.parseInt(birthNumber.substring(0, 9));

        //2. ziskat zbytek 9 cislic deleno 11
        int remainder = nineDigits % 11;

        //3. ziskat posledni cislic
        int lastDigit = Integer.parseInt(birthNumber.substring(9));

        //4. porovnani posledni cislice a zbytku
        if (remainder == 10) {
            isValidBirthNumber = lastDigit == 0;
        } else {
            isValidBirthNumber = remainder == lastDigit;
        }
        
        //isValidBirthNumber = validateBirthNumber(first, second);
        
        //print the result
        if (isValidBirthNumber) {
            System.out.println("Rodné číslo je platné.");
        } else {
            System.out.println("Rodné číslo je neplatné.");
        }
    }

    //varianta s vyuzitim cisel
    public static boolean validateBirthNumber(int first, int second) {
        //1. ziskat prvnich 9 cislic
        long birthNumber = first * 10000 + second; //nemusi se vejit do int
        int nineDigits = (int) (birthNumber / 10);

        //2. ziskat zbytek 9 cislic deleno 11
        int remainder = nineDigits % 11;

        //3. ziskat posledni cislic
        int lastDigit = second % 10;

        //4. porovnani posledni cislice a zbytku
        boolean isValidBirthNumber;
        if (remainder == 10) {
            isValidBirthNumber = lastDigit == 0;
        } else {
            isValidBirthNumber = remainder == lastDigit;
        }
        return isValidBirthNumber;
    }
}
