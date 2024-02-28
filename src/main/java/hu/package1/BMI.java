package hu.package1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Weight(kg): ");
        double weight = sc.nextDouble();

        System.out.print("Height(m): ");
        double height = sc.nextDouble();

        if ( weight <= 0 || height <= 0) {
            System.out.println("INVALID");
        }

        double BMI = weight / ( height * height );
        System.out.print("BMI: " + BMI);

        if ( BMI < 18.5) {
            System.out.println(" => MALNOURISHED");
        } else if ( BMI >= 18.5 && BMI <= 24.9) {
            System.out.println(" => NORMAL");
        } else if ( BMI >= 25.0 && BMI <= 29.9) {
            System.out.println(" => OVERWEIGHT");
        } else if ( BMI >= 30.0 ) {
            System.out.println(" => OBESE");
        }

    }
}
