/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week03_more_numbers;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class Notes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //in
        System.out.println("Zadej castku");
        Scanner sc = new Scanner(System.in);
        //int sum= 4874;
        int sum = sc.nextInt();
        int remainder = sum;
        
        //comp
        int n100 = remainder / 100; //100, 50, ... definovat jako konstanty
        remainder = remainder % 100;
        int n50 = remainder / 50;
        remainder = remainder % 50;
        int n20 = remainder / 20;
        remainder = remainder % 20;
        int n10 = remainder / 10;
        remainder = remainder % 10;
        int n5 = remainder / 5;
        remainder = remainder % 5;
        int n2 = remainder / 2;
        remainder = remainder % 2;
        int o = remainder;
        //out
        System.out.println(sum + ": Stokorun je " + n100 + " padesatikorun je " + n50
                + " dvacetikorun je " + n20 + " desetikorun je " + n10
                + " petikorun je "
                + n5 + " dvoukorun je " + n2 + " korun je " + o);

     
     
        
    }
    
}
