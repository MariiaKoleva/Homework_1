import java.util.Scanner;

public class Task2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between [10-300]: ");
        int n = scanner.nextInt();

        if (n < 10 || n > 300) {
            System.out.println("Enter a number (N) between [10-300]: ");
        } else {
            System.out.println("Multiples of 7 smaller than " + n + ": ");

            for (int i = n - 1; i >= 10; i--) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}
