package assignments06_array;

public class U2ArrayTools {

    public static void main(String[] args) {
        //int[] b = new int[5];
        int[] b = {2, 8, 4, 6, -5}; //staticky inicializator
        int sum = U2ArrayTools.sum(b);
        System.out.println(sum);
        print(b);
        print2(b);
    }
    
    public static int sum(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
           sum = sum + a[i];
       }
       return sum;
    }
    
    public static void print(int[] a){
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
    public static void print2(int[] a){
        System.out.print("[");
        for(int i = 0; i < a.length-1; i++) {
                System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1]);
        System.out.println("]");
    }
    
}
