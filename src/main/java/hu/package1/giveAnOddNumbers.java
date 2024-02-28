package hu.package1;

import java.util.Scanner;

public class giveAnOddNumbers {

    public static void main(String[] args) {
        //Keep asking user to give a number until the number is odd!
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Give your number here:");
            int number = sc.nextInt();
            if (number % 2 == 1) {
                break;
            }
        }
    }
}
