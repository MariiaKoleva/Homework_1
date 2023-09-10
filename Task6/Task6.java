import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit natural number (between 1000 and 9999): ");
        int number = scanner.nextInt();

        if (number < 1000 || number > 9999) {
            System.out.println("Invalid value. Please enter a four-digit natural number within [1000 - 9999].");
        } else {
            int first2Digits = number / 100;
            int last2Digits = number % 100;


            if (first2Digits > last2Digits)
            {
                System.out.println(first2Digits + " is > " + last2Digits);
            } else if (first2Digits < last2Digits)
            {
                System.out.println(first2Digits + " < " + last2Digits);
            } else
            {
                System.out.println(first2Digits + " = " + last2Digits);
            }
        }


        scanner.close();
    }


}


