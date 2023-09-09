package Homework_Swich_Loop;

public class Task2_12 {
    public static void main(String[] args) {

        for (int number = 100; number <= 999; number++) {
            int firstNumber = number / 100;
            int secondNumber = (number / 10) % 10;
            int thirdNumber = number % 10;


            if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber) {
                System.out.println(number);
            }
        }
    }
}
