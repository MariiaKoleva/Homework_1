import java.util.Scanner;


public class Task3 {
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double smaller = (num1 < num2) ? num1 : num2;
        double bigger = (num1 > num2) ? num1 : num2;

        // Ascending order
        System.out.println("Ascending Order: " + smaller + " " + bigger);

        // Descending order
        System.out.println("Descending Order: " + bigger + " " + smaller);

        scanner.close();
    }
}