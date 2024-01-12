/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zapocet.monday_rudniev;

public class Methods {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        PrintArray(CreatePolindom(array1));
        System.out.println("");

        int[] array2 = {5, 5, 6, 4, 7, 3, 5};
        System.out.println(constantSumNextTwo(array2));
        System.out.println("");

        int[][] matrix1 = {{2, 8, 12}, {8, 16, 22}};
        System.out.println(testEven(matrix1));
        System.out.println("");

        PrintMatrix(alter01(5, 7));

    }

    public static void PrintArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length-1; i++) {
                System.out.print(array[i]);
                System.out.print(", ");
        }
        System.out.print(array[array.length-1]);
        System.out.print("}");
        System.out.println("");
    }

    public static void PrintMatrix(int[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                System.out.print(matrix[y][x]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    //JV A/B
    public static int[] CreatePolindom(int[] array) {
        int[] polinom = new int[(array.length * 2) - 1];

        for (int i = 0; i < array.length; i++) {
            polinom[i] = array[i];
        }

        for (int i = array.length - 1, j = array.length - 1; i < polinom.length; i++, j--) { //JV stacilo by jit i = array.length, j = array.length - 2
            polinom[i] = array[j];
        }

        return polinom;
    }
    
    //JV A
    public static boolean constantSumNextTwo(int[] array) {
        if (array.length % 2 != 0) {
            return false;
        }
        int firstSum = array[0] + array[1];
        for (int i = 2; i < array.length; i += 2) {
            if (firstSum != array[i] + array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    //JV B
    public static boolean testEven(int[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {

                if (matrix[y][x] % 2 != 0 || matrix[y][x] <= 0) { //JV stacilo otestovat prvni prvek a ostatni jsou jen o 2 vzdy vetsi, ulozit si predchozi
                    return false;
                }
                if (x + 1 > matrix[y].length && matrix[y][x] + 2 != matrix[y + 1][x]) { //?
                    return false;
                }
                else if(matrix[y][x] + 2 != matrix[y][x + 1]){ //?
                        return false;
                }

            }
        }
        return true;
    }

    //JV A
    public static int[][] alter01(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[y].length; x++) {
                if ((x + y) % 2 == 0) {
                    matrix[y][x] = 0;
                } else {
                    matrix[y][x] = 1;
                }
            }
        }
        return matrix;
    }
}
