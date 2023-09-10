
import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  A: ");
        int A = scanner.nextInt();

        System.out.print("Enter  B: ");
        int B = scanner.nextInt();

        System.out.print("Enter  C: ");
        int C = scanner.nextInt();


        int temp; ///not sure if it is the correct one

        temp = A; // Store the value of A in temp
        A = B;
        B = C;
        C = temp;

        System.out.println("After swapping:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);

        scanner.close();
    }
}