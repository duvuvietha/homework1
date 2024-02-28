package hu.package1;

import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        //Choose 2 numbers in range of [-100; 100]
        // Then write all the even numbers between them
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the first number: ");
        int num1 = scanner.nextInt();

        if (num1 < -100 || num1 > 100) {
            System.out.println("INVALID");
        }

        System.out.println("Choose the second number: ");
        int num2 = scanner.nextInt();

        if (num2 < -100 || num2 > 100) {
            System.out.println("INVALID");
        }

        System.out.println("The event number(s) between them is/are: ");

        if (num1 < num2) {
            for (int i = num1; i < num2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }

            }
        } else {
            for (int i = num2; i < num1; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
