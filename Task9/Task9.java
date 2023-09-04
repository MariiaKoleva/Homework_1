
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an number from 0 to 100: ");
        int userInput = scanner.nextInt();

        if (userInput < 0 || userInput > 100)
        {
            System.out.println("Invalid number. Please enter a number from [0-100].");
        } else if (userInput == 0)
        {
            System.out.println("It will not rain.");
        } else if (userInput <= 5)
        {
            System.out.println("Minimal chance of precipitation.");
        } else if (userInput <= 20)
        {
            System.out.println("A small chance of precipitation.");
        } else if (userInput <= 50)
        {
            System.out.println("There is a chance of precipitation.");
        } else if (userInput <= 80)
        {
            System.out.println("High chance of precipitation.");
        } else
        {
            System.out.println("It will rain.");
        }

        scanner.close();
    }
}


