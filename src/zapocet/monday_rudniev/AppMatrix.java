package zapocet.monday_rudniev;

import java.util.Scanner;

public class AppMatrix {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter length and hight of matrix:");
        int length = sc.nextInt();
        int hight = sc.nextInt();

        int[][] matrix = new int[hight][length];

        System.out.println("Enter matrix:");
        for (int y = 0; y < hight; y++) {
            for (int x = 0; x < length; x++) {
                matrix[y][x] = sc.nextInt();
            }
        }
        if (Methods.testEven(matrix)) {
            System.out.println("Matrix is even");
        } else {
            System.out.println("Matrix is not even");
        }
    }

}
