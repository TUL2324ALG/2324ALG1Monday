package zapocet.oprava_saltovskyi;

import java.util.Scanner;

public class Average5K {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double matrix[][] = new double[1][2];
        double time = 0;
        fillArray(matrix);
        AvarageTime( matrix, time);
    }

    public static void fillArray(double[][] matrix) { //JV stacilo jednorozmerne pole
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Napiste body matice 1: rad: " + (i + 1) + " st: " + (j + 1));
                matrix[i][j] = sc.nextDouble();

            }
            System.out.println();
        }

    }

    public static void AvarageTime(double[][] matrix, double time) {
      time=0;
      double sum=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                  sum=matrix[i][j];
                  sum+=matrix[i][j];
               
            }
               time=sum / matrix[i].length-1;
               
                  System.out.println(time+" min");
          
        }
    }
}
