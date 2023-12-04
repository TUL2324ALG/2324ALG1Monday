package assignments07_2darray;

public class MatrixTools {

    public static void main(String[] args) {
        int[][] a = {
                     {1, 2, 0, 4},
                     {5, 6, 7, -8},
                     {-5, 4, 3, 2}
                    };
        System.out.println("maxAbs " +maxAbs(a));
        double[][] norm = normMatrix(a);
        System.out.println("");
    }
    
    public static int maxAbs(int[][] a){
        int maxAbs = Integer.MIN_VALUE;
        int absElement;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                absElement = Math.abs(a[i][j]);
                if(absElement > maxAbs){
                    maxAbs = absElement;
                }
            }
        }
        return maxAbs;
    }
    
    public static double[][] normMatrix(int[][] a){
        int maxAbs = maxAbs(a);
        double[][] normA = new double[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                normA[i][j]= (double)a[i][j] / maxAbs;
            }
        }
        return normA;
    }
    
}
