package hu.package1;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //calculate the factorial of "n"
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculate the factorial of ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Result: " + fact);
    }
}

