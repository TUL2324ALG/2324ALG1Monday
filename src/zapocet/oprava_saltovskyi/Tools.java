package zapocet.oprava_saltovskyi;

import java.util.Scanner;

public class Tools {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Napiste rozmer matice 1 a 2 : ");
        int t = sc.nextInt();
        int y = sc.nextInt();
         int n = sc.nextInt();
        
        int[][] matrix1 = new int[t][y];
        int[][] matrix2 = new int[t][y];
        int[][]matrix3=new int[n][n];
        fillArray(matrix1, matrix2);
        CreateOneMatrix(matrix3);
        System.out.println(areSameArrays(matrix1, matrix2));

    }
    public static void fillArray(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Napiste body matice 1: rad: " + (i + 1) + " st: " + (j + 1));
                matrix1[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.println("Napiste body matice 1: rad: " + (i + 1) + " st: " + (j + 1));
                matrix2[i][j] = sc.nextInt();

            }
            System.out.println();
        }

    }

    public static boolean areSameArrays(int[][] matrix1, int[][] matrix2) { //JV meli to byt 2 1D pole
        boolean isSame = true;
        for (int i = 0; i < matrix1.length; i++) {
            isSame = true;
            for (int j = 0; j < matrix2[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) { //JV skontrolujete 2 prvky a hned
                    isSame = false;
                    System.out.println("To neni stajna matice >:( ");
                    break;
                }
                if (matrix1[i][j] == matrix2[i][j]) { //JV pokud prvni 2 prvky budou stejne, rikate, ze matice je stejna - co neni pravda a break preskocite na dalsi radek
                    isSame = true;
                    System.out.println("To je stajna matice >:) ");
                    break;
                }

            }

        }

        return isSame;
    }
     public static int[][] CreateOneMatrix(int[][]matrix3){
    
         for (int i = 0; i < matrix3.length; i++) {
             for (int j = 0; j < matrix3[i].length; j++) {
                if(i==j){
                matrix3[i][j]=1;
                }else
                    matrix3[i][j]=0;
                 System.out.print(matrix3[i][j]);  //JV metoda mala matici vytvorit, nevypisujte ji
             }
             System.out.println();
         }
     
     
     return matrix3;
     }

}
