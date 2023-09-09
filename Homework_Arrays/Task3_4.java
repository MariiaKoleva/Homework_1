package Homework_Arrays;

public class Task3_4 {
    public static void main (String[] args) {

        int[] arr = {1,2,2,3};
        boolean isMirrored = true;
        int length = arr.length;

        for (int i =0; i < length / 2; i++) {
            if (arr[i] != arr[length -1 -i]) {
                isMirrored = false;
                break;
            }
        }



        if (isMirrored) {
            System.out.println("Array is mirrored.");
            System.out.print("Array elements: ");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i]);
                if (i < length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Array is not mirrored.");
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i]);
                if (i < length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}






