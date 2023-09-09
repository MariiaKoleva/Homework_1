import java.util.Scanner;

public class Task2_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("The first " + n + " numbers divisible by 3 are: ");
//i = count
            for (int i = 1; i <= n; i++) {
                int num = i * 3;
                System.out.print(num);

                if (i < n) {
                    System.out.print(", ");
                }
            }
        }

        scanner.close();
    }
}
