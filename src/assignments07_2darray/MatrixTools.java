package assignments07_2darray;

public class MatrixTools {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 0, 4},
            {5, 6, 7, -8},
            {-5, 4, 3, 2}
        };
        System.out.println("maxAbs " + maxAbs(a));
        double[][] norm = normMatrix(a);
        System.out.println("");
        System.out.println("Stochastic?: " + Stochastic(a));
        System.out.println("Symetric " + isSymetric(a));
    }

    public static int maxAbs(int[][] a) {
        int maxAbs = Integer.MIN_VALUE;
        int absElement;
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

    public static double[][] normMatrix(int[][] a) {
        int maxAbs = maxAbs(a);
        double[][] normA = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                normA[i][j] = (double) a[i][j] / maxAbs;
            }
        }
        return normA;
    }

    public static boolean Stochastic(int[][] a) {
        boolean isStochastic = true;

        for (int i = 0; i < a.length && isStochastic; i++) {
            int sum = 0;
           
            for (int j = 0; j < a[i].length && isStochastic; j++) {
                if (a[i][j] < 0) {
                    isStochastic = false;
                    //return isStochastic;
                }
                sum += a[i][j];
            }
            if (sum != 1) {
                isStochastic = false;
                //return isStochastic;
            }
        }
        return isStochastic;

    }
    public static boolean isSymetric (int [][] a){
        
        for (int i = 0; i < a.length-1; i++){
            for (int j = i+1; j < a[i].length; j++){
                
                if (a[i][j] != a[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}