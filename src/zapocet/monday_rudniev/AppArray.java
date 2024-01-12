package zapocet.monday_rudniev;

import java.util.Scanner;
public class AppArray {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a length of array:");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        
        System.out.println("Enter array:");
        for (int i = 0; i < arrayLength; i++){
            array[i] = sc.nextInt();
        }
        
        int[] polinom = Methods.CreatePolindom(array);
        Methods.PrintArray(polinom);
        
    }
    
}
