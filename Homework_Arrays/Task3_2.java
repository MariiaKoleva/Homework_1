package Homework_Arrays;

import java.util.Scanner;

public class Task3_2 {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the number of elements in the array: ");
        //int n = scanner.nextInt();

       // int[] arr = new int[n];

        //System.out.println("Enter elements of the array:");

        int[] arr = {1, 2, 3, 4, 5, 6};
        int length = arr.length;
        int [] updated = new int[length];

        for (int i = 0; i < length/2; i++) {
            updated[i] = arr[length / 2 +i];
            updated [length - i - 1] = updated[length / 2 + i];
        }


        for (int i = 0; i < length; i++) {
            System.out.print(updated[i]);
            if (i < length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("  ");  // i stop here


    }
}