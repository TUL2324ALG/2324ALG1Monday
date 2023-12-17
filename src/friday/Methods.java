package friday;

import assignments07_2darray.U2NormMatrixProgramMethods;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class Methods {


    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        System.out.println(a.length + " " + a[0].length);
        reverseHorizontal(a);
        U2NormMatrixProgramMethods.printMatrix(a);
        int[] array={-3,-6,-10};
        System.out.println(onlyNegativeDivisibleByTree(array));
    }
    
    public static void reverseHorizontal(int[][] a){
      int[][] b = new int[a.length][a[0].length];
      
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < (a[0].length); j++) {
                b[i][j] = a[a.length-1-i][j];
                
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < (a[0].length); j++) {
                a[i][j] = b[i][j];
            }
        }
        
        //varianta
        int temp;
        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < (a[0].length); j++) {
                temp = a[i][j];
                a[i][j] = a[a.length-1-i][j];
                a[a.length-1-i][j] = temp;
            }
        }
        
        //varianta prohozeni celych radku
        int[] temp1;
        for (int i = 0; i < a.length/2; i++){
                temp1 = a[i];
                a[i] = a[a.length-1-i];
                a[a.length-1-i] = temp1;
        }
      
    }
    public static boolean onlyNegativeDivisibleByTree(int[] a) {
        boolean negthree=true;
        for (int i = 0; i < a.length; i++){
            if (a[i]>=0 || a[i]%3!=0){
                negthree=false;
                return negthree;
            }
        }
        return negthree;
    }
    
    //varianta
    public static boolean onlyNegativeDivisibleByTree1(int[] a) {
        boolean negthree=true;
        for (int i = 0; i < a.length && negthree; i++){
            if(!(a[i]<0 || a[i]%3==0)){ //opak 
                negthree=false;
                //return negthree;
            }
        }
        return negthree;
    }
    
    //varianta
    public static boolean onlyNegativeDivisibleByTree2(int[] a) {
        for (int i = 0; i < a.length; i++){
            if(a[i]>=0){
                return false;
            }
            if(a[i] % 3 != 0){
                return false;
            }
        }
        return true;
    }

//        for (int i = 0; i < a.length/2; i++) {
//            for (int j = 0; j < (a[0].length); j++) {
//                if(a[i][j] != a[a.length-1-i][j];
                    //return false;
//            }
//        }
    //    return true;
    
}
