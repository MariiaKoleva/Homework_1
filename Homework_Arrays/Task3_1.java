import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        //  Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number of elements in the array: ");
        //  int n = scanner.nextInt();

        //  int[] arr = new int[n];

        //  System.out.println("Enter elements of the array:");
        //  for (int i = 0; i < n; i++) {
        //     arr[i] = scanner.nextInt();
        // }
        int[] arr = {15, 10, 25, 8, 30, 12};

        int p = -2;   //invalid multiple of 5

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num % 5 == 0 && num > p) {
                p = num;
            }
        }

        if (p != -2) {    //to be replaced with other value if present
            System.out.println("Largest multiple of 5: " + p);
        } else {
            System.out.println("No multiple of 5 found in the array.");
        }
    }
}
