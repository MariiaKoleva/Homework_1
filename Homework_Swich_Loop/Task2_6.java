package Homework_Swich_Loop;

import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number 1 ");
        int userNumber1 = sc.nextInt();
        System.out.println("Please enter number 2 ");
        int userNumber2 = sc.nextInt();

        for (int index = userNumber1; index <= userNumber2; index++) {

            System.out.println(index);
        }
    }
}