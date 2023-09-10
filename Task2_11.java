package Homework_Swich_Loop;

import java.util.Scanner;

public class Task2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.println("Enter a positive number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
        } else {

                        for (int i = 1; i <= n; i++) {             //кількість рядків

                            for (int p = 1; p <= n - i; p++) {
                                System.out.print(" ");
                            }

                            for (int k = 1; k <= 2 * i - 1; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }

                    scanner.close();
                }
            }


