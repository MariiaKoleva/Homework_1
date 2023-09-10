import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a natural number from the keyboard in the range [0-24]: ");
        int userInput = scanner.nextInt();

        if (userInput < 0 || userInput > 24)
        {
            System.out.println("Invalid number. Please enter a number in the range [0-24].");
        } else {
            if (userInput >= 5 && userInput <= 10)
            {
                System.out.println("Good morning");
            } else if (userInput >= 11 && userInput <= 18)
            {
                System.out.println("Good day");
            } else if (userInput >= 19 && userInput <= 23)
            {
                System.out.println("Good evening");
            } else
            {
                System.out.println("Why aren't you sleeping");
            }
        }

        scanner.close();
    }
}
