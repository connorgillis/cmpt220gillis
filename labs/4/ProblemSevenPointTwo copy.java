package week5;


import java.util.Scanner;

public class ProblemSevenPointTwo {

    public static void main(String[] args) {
        int[] array = new int[10]; //create an array with 10 values

        // scan for 10 inputs, populate array with inputs
        System.out.print("Enter ten ints: ");


        fill(array); //call the method which populates the array
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println(); //reverse and output integers, add space and line between
    }

    public static void fill(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();
    } // method takes each input and adds them to the array based on the iterator (which describes each index of the array)
}