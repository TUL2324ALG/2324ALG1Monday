package assignments03_branching_loops;

import java.util.Scanner;

public class U18SumNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        int sum = 0;
        double average;
        int count = 0;
        System.out.println("Enter numbers: ");
        num = sc.nextInt();

        while (num > 0) {
            count++; //count = count +1;
            sum = sum + num;
            num = sc.nextInt();
        }
        average = (double) sum / count;

        System.out.println("Sum of entering numbers: " + sum);
        System.out.println("Count of entering numbers: " + count);
        System.out.format("Average is %.2f \n", average);
    }
}
