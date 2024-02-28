package hu.package1;

public class divisibleBy3 {
    public static void main(String[] args) {

        //Write all numbers in range of [-100, 100], which are divisible by 3

        //first solution
        for (int i = -100; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        //second solution
        for (int i = -99; i < 100; i+=3) {
            System.out.println(i);
        }
    }
}
