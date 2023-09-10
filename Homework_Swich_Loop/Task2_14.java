package Homework_Swich_Loop;

public class Task2_14 {

    public static void main(String[] args) {
        int n = 10;
        for (int f = 1; f <= n; f++) {
            for (int j = 1; j <= n; j++) {
                int multiple = f * j;
                System.out.println(f + " * " + j + " = " + multiple);
            }
        }
    }
}