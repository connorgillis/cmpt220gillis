package week6;

import java.util.Scanner;

public class ProblemSevenPointFourteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialize scanner
        int[] values = new int[5];
        //create values array, five ints

        System.out.print("Please enter five ints: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        //populate values array with input numbers

        System.out.println("The greatest common divisor is " + gcd(values));
    }

    public static int gcd(int... values) {
        int gcd = 1;
        //initialize gcd as 1
        boolean isDivisor;
        //establish bool value for divisibility
        for (int i = 2; i < min(values); i++) {
            isDivisor = true;
            for (int e: values) {
                if (e % i != 0)
                    isDivisor = false;
            }
            if (isDivisor)
                gcd = i;
        }
        return gcd;
    }


    public static int min(int... values) {
        int min = values[0];
        for (int e: values) {
            if (e < min) // JA: You need to include min (<=)
                min = e;
        }
        return min;
    }
}
