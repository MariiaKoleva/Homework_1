import java.util.Scanner;

public class Task11 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter a three-digit natural number: ");
            int userInput = scanner.nextInt();

            if (userInput < 100 || userInput > 999)
            {
                System.out.println("Please enter a valid three-digit natural number.");
            } else
            {
                int digit1 = userInput % 10;
                int digit2 = (userInput / 10) % 10;
                int digit3 = userInput / 100;

                if (digit1 == digit2 && digit2 == digit3)
                {
                    System.out.println("The numbers are equal.");
                } else if (digit1 < digit2 && digit2 < digit3)
                {
                    System.out.println("Descending  order.");
                } else if (digit1 > digit2 && digit2 > digit3)
                {
                    System.out.println("Ascending order.");
                } else
                {
                    System.out.println("Try with another number.");
                }
            }

            scanner.close();
        }
    }


