package assignments03_branching_loops;

public class CirclePointPos {

    public static void main(String[] args) {
        //input
        int xStred = 1;
        int yStred = 1;
        int polomer = 1;
        int xBod = 2;
        int yBod = 1;

        final double PRESNOST = 0.0001;
        final int IN = 1;
        final int ON = 0;
        final int OUT = -1;
        
        //vypocet
        int pozice;
        //striska nefunguje jako mocnina
        //double velikostVektoru = Math.sqrt(((xBod - xStred) ^ 2) + ((yBod - yStred) ^ 2));

        double velikostVektoru = Math.sqrt(Math.pow(xBod - xStred, 2) + Math.pow(yBod - yStred, 2));

        if (Math.abs(velikostVektoru - polomer) < PRESNOST) {
            pozice = ON;
        } else if (velikostVektoru < polomer) {
            pozice = IN;
        } else {
            pozice = OUT;
        }
        
        //vypis
        switch (pozice) {
            case IN:
                System.out.println("Bod lezi uvnitr kruznice");
                break;
            case ON:
                System.out.println("Bod lezi na kruznici");
                break;
            case OUT:
                System.out.println("Bod lezi vne kruznice");
                break;
            default:
                System.out.println("Tohle nemelo nastat.");
        }
    }

}
