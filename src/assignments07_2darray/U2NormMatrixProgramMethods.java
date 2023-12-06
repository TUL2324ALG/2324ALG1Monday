package assignments07_2darray;

import java.util.Scanner;
//Test 2 3 2 1 -4 -1 5 2
public class U2NormMatrixProgramMethods {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        //in - nacitani matice od uzivatele
        double[][] matrix = loadMatrix();
        //processing - normovani zadane matice
        double[][] normMatrix = normMatrix(matrix);
        //out - vypis normovane matice
        printMatrix(normMatrix);
    }
    
    private static double[][] loadMatrix(){
        System.out.println("Zadej rozmery matice");
        int m = sc.nextInt(); 
        int n = sc.nextInt();
        double[][] matrix = new double[m][n];
        System.out.println("Zadej hodnoty matice");
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextDouble();
            }
        }
        return matrix;
    }
    
    private static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.format("%6.2f ", matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
    private static double[][] normMatrix(double[][] a) {
        double maxAbs = maxAbs(a);
        double[][] normA = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                normA[i][j] = (double) a[i][j] / maxAbs;
            }
        }
        return normA;
    }
    
    private static double maxAbs(double[][] a) {
        double maxAbs = -Double.MAX_VALUE;
        double absElement;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                absElement = Math.abs(a[i][j]);
                if (absElement > maxAbs) {
                    maxAbs = absElement;
                }
            }
        }
        return maxAbs;
    }
}
