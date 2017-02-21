package week6;

import java.util.Scanner;
//import scanner

public class ProblemSevenPointTen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //initialize scanner

        double[] numbers = new double[10]; // Create an array of length ten
        //create array, size 10

        // prompt user
        System.out.print("Enter ten numbers: ");

        //set each input to a value in array
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        // return result based on indexOfSmallestElement method
        System.out.println("The minimum number is " +
                numbers[indexOfSmallestElement(numbers)] + " index " +
                indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {

        double minVal = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minVal) {
                minVal = array[i];
                minIndex = i;
            }
         //iterate over array, stop and return value where the value of the index
        }
        return minIndex;
        //return the index through the function
    }
}
