import java.util.Scanner;

public class Task5 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the current time (0 for day, 1 for night): ");
            int time = scanner.nextInt();

            System.out.print("Enter the amount of money you have: $");
            double money = scanner.nextDouble();

            System.out.print("Am I at work? (true/false): ");
            boolean IamatWork = scanner.nextBoolean();

            if (IamatWork) {
                System.out.println("You are at work and cannot go out.");
            } else {
                if (time == 0) {
                    if (money > 10) {
                        System.out.println("It's daytime, and you have more than $10. You will go to the cinema.");
                    } else {
                        System.out.println("It's daytime, and you have less than $10 or no money. You will go for a walk.");
                    }
                } else {
                    if (money > 20) {
                        System.out.println("It's nighttime, and you have more than $20. You will go to a disco.");
                    } else {
                        System.out.println("It's nighttime, and you have less than $20. You will go to sleep.");
                    }
                }
            }

            scanner.close();
        }
    }
