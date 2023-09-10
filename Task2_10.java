package Homework_Swich_Loop;

import java.util.Scanner;

public class Task2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = scanner.nextInt();

        boolean prime = true;
        int i = 2;
        while (i <= n/2) {

            if (n %i == 0) {
                prime = false;
                        break;
            }
            i++;

        }

        if (prime && n > 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

    }
}
