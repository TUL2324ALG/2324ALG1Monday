/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zapocet.oprava_kluh;

import java.util.Scanner;

/**
 *
 * @author Kluh-P-e56d
 */
public class RowNorms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean matrix = true;
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Zadejte pocet radku");
        n = sc.nextInt();
        System.out.println("Zadejte pocet sloupcu");
        m = sc.nextInt();
        System.out.println("Zadavejte hodnoty po radcich");
        double test[][] = new double[n][m];
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[0].length; j++) {
                test [i][j]=sc.nextDouble();
                
            }
            
        }
        
        
        double norms[] = new double[test.length];

        for (int i = 0; i < norms.length; i++) {
            double temp = 0;
            for (int j = 0; j < test[0].length; j++) {
                temp = temp + (test[i][j] * test[i][j]);

            }
            norms[i] = Math.sqrt(temp);
            temp = 0;

        }
        System.out.println("Norms");
        for (int i = 0; i < norms.length; i++) {
            System.out.print(norms[i] + " ");
            

        }
        System.out.println("");
        for (int i = 0; i < norms.length - 1; i++) { //JV doplnit podminku i < norms.length - 1 && matrix,
            //aby se cyklilo jen pokud je matrix jeste porad true 
            if (norms[i] != norms[i + 1]) {
                matrix = false;
            }

        }
        for (int i = 0; i < test.length; i++) {//JV doplnit podminku i < test.length && matrix,
            //aby se cyklilo jen pokud je matrix jeste porad true
            for (int j = 0; j < test[0].length; j++) {//JV doplnit podminku i < test[0].length && matrix,
                if (test[i][j] < 0) {
                    matrix = false;
                }

            }

        }

//        System.out.println(matrix);
        if(matrix==true){ //JV staci psat if(matrix)
            System.out.println("Podminky zadani byly splneny");
            System.out.println("Matice obsahuje pouze kladna cisla a norma"
                    + "je u vsech radku stejna");
        }else{
            System.out.println("Podminky zadani nebyly splněny");
            System.out.println("Matice nema stejne radkove normy, nebo obsahuje"
                    + "zaporna cisla ");
        
        }

    }

}
