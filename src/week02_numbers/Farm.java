/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week02_numbers;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class Farm {
    public static void main(String[] args) {
        //input
        int pocetHus = 5;
        int pocetKraliku = 4;
        final int pnk = 4; //pocet nohou kraliku
        final int pocetNohouHus = 2;
                
        //vypocty
        int pocetZvirat = pocetHus + pocetKraliku;
        int pocetNohou = pocetHus * pocetNohouHus + pocetKraliku * pnk;
        
        //output
        System.out.println(pocetHus);
        System.out.println(pocetKraliku);
        System.out.println("Na farme je " + pocetZvirat + " zvirat a maji "
                + pocetNohou + " nohou.");
    }
}
