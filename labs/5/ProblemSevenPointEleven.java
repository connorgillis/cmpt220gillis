package week6;

import java.util.Scanner;
//import scanner

public class ProblemSevenPointEleven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialize scanner
        double[] values = new double[10];
        //create array values to hold the set of x's
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < values.length; i++)
            values[i] = input.nextDouble();
        //take user input and store it across values array
        System.out.println("The mean is " + mean(values));
        System.out.println("The standard deviation is " + deviation(values));
        //display results based on method
    }

    public static double deviation(double[] x) {
        double deviation = 0;
        double mean = mean(x);
        for (double e: x) {
            deviation += Math.pow(e - mean, 2);
        }
        return Math.sqrt(deviation / (x.length - 1));
    }

    public static double mean(double[] x) {
        double mean = 0;
        for (double e: x) {
            mean += e;
        }
        return mean / x.length;
    }
}
