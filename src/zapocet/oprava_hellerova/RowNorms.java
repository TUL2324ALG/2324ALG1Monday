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
public class RowNorms {

    /**
     * @param args the command line arguments
     */
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Program pro normu matice");
        boolean pokracovat = true;
        while (pokracovat) {
            System.out.println("Zadej pocet radku matice: ");
            int radky = sc.nextInt();
            System.out.println("Zadej sloupce matice: ");
            int sloupce = sc.nextInt();
            
            int[][] matice = [radky][sloupce];
            
            //vypis matice
            for(int i = 0; i < radky; i ++){
                for(int j = 0; j < sloupce; j++){
                    System.out.println(matice + "");
                }
                System.out.println("");
            }
            
            public static boolean isKladna(int[] matice){
                for(int i = 0; i < matice.length; i++){
                    for(j = 0; j < matice[i].length; i++){
                        if(matice[i][j] < 0){ //pokud záporné - false
                            return false;
                        }
                        if(matice[i] != Math.pow(matice[i])){ 
                        return false;
                    }
                        
                    }
                    return true;
                }
            }
            
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
