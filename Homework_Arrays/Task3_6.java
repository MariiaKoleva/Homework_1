package Homework_Arrays;
import java.util.Scanner;
public class Task3_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first array, devide the elements with coma");
        String input1 = scanner.nextLine();

        System.out.println("Enter the second array, devide the elements with coma");
        String input2 = scanner.nextLine();

        if (input1.equals(input2)) {
            System.out.println("Identical");
        } else {
            System.out.println("Not identical");
        }
            }
            }

