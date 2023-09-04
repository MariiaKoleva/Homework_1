import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner User_Input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = User_Input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = User_Input.nextInt();

        int NumbersSum = number1 + number2;
        int NumberDifference = number1 - number2;
        int NumberMultiple = number1 * number2;
        int NumberRemaining; // Declare the variable without initializing
        int NumberDivision = 0; // Initialize with a default value

        // Display the results
        System.out.println("Sum: " + NumbersSum);
        System.out.println("Difference: " + NumberDifference);
        System.out.println("Multiple: " + NumberMultiple);

        if (number2 != 0) {
            NumberDivision = number1 / number2;
            NumberRemaining = number1 % number2;
            System.out.println("Division result: " + NumberDivision);
            System.out.println("Remaining: " + NumberRemaining);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        if (NumberDivision == 0) {
            System.out.println("Note: The division result is zero due to integer division.");
        }

        User_Input.close();
    }
}
