import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE; // Ініціалізуємо з великим значенням
        int largest = Integer.MIN_VALUE;  // Ініціалізуємо з малим значенням

         int number;
        boolean validInputEntered = false; // Flag to track valid input
        System.out.println("Enter a nutural number. Enter 0 to exit: ");

        while (true) {                 //infinite loop
            System.out.print("Entered number: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;

            }

            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
            validInputEntered = true;
        }

        if (validInputEntered) {
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }
}
