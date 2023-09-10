package Homework_Swich_Loop;

import java.util.Scanner;import java.util.Scanner;
public class Task2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a char ");
        char usersChar = sc.next().charAt(0);

        //char y = '1';
        // char Y = '2';

        switch (usersChar) {
            case 'y':
                System.out.println("Yes");
                break;
            case 'Y':
                System.out.println("Yes");
                break;
             case 'N' :
                System.out.println("No");
                break;
            case 'n' :
                System.out.println("No");
                break;
            default:
                System.out.println("Wrong character");

                sc.close();
        }
    }
}

