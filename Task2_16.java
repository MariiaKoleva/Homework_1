package Homework_Swich_Loop;

import java.util.Scanner;

public class Task2_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N) between [10-30000]: ");
        int N = scanner.nextInt();
        int reverse = 0, temper = N;
        while (temper > 0) {
            int remainder = temper % 10;
            reverse = (reverse * 10) + remainder;
            temper = temper / 10;
        }
        if (N == reverse)
        System.out.println("Number is palindrom");
        else System.out.println("Number is not palindrom");
    }




}
