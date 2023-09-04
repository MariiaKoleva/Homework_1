package Task7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = scanner.nextInt();

        System.out.print("Enter B: ");
        int B = scanner.nextInt();

        int multiple = A * B;

        if (multiple % 2 == 0) {
            System.out.println("Even value");
        } else {
            System.out.println("Odd value");
        }
        int lastDigit = multiple % 10;
        if (lastDigit == 0) {
            System.out.println("Last digit is 0 and does not divide by 3");
        } else if (lastDigit % 3 == 0) {
            System.out.println("Last digit is divisible by 3");
        } else {
            System.out.println("Last digit is not divisible by 3");
        }

        scanner.close();
    }
}