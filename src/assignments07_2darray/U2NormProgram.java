package assignments07_2darray;

import java.util.Scanner;
//Test 2 3 1 2 3 4 5 6
public class U2NormProgram {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //in
        System.out.println("Zadej pocet radku a sloupcu matice");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int [m][n];
        System.out.println("Zadej hodnoty matice");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //processing
        double[][] norm = MatrixTools.normMatrix(matrix);
        
        //output
        System.out.println("Normovana matice");
        for(int i = 0; i < norm.length; i++){
            for(int j = 0; j < norm[i].length; j++){
                System.out.format("%10.2f ", norm[i][j]);
            }
            System.out.println("");
        }
    }
    
}
