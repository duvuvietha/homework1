package hu.package1;

public class evenNumbers2 {
    public static void main(String[] args) {
        //Write all the even numbers in range of [1, 10]

        //first solution
        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //second solution
        for (int i = 2; i <= 10 ; i+=2) {
            System.out.println(i);
        }

    }
}
