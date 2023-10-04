package assignments01_introduction;

import java.util.Scanner;



public class Sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //in, vstupy
        String name;
        name = "Filip"; //napevno v kodu
        //String name = args[0]; //jako argument pri spusteni
        System.out.println("Zadej jmeno:");
        name = sc.next(); //nacteni od uzivatele
        int year = 2005;
        char className = 'A';
        final int currentYear = 2023; //konstanta
        final int yearToSchool = 6;

        //vypocty
        int age = currentYear - year;
        int classGrade = age - yearToSchool;

        //out
        System.out.println("Dite " + name + " ma " + age
                + " let a chodi do tridy " + classGrade + "." + className);

    }

}
