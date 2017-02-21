package week6;

import java.util.Scanner;

//import scanner

public class ProblemEightPointOne {
    public static void main(String[] args) {

        double[][] matrix = getMatrix();
        //create two dimensional array

        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println(
                    "Sum of the elements at column " + col +
                            " is " + sumColumn(matrix, col));
            //for each column, print the sum (from sumColumn method)
        }
    }

    public static double[][] getMatrix() {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLUMNS = 4;
        //declare constants for dimensions of array (3x4)
        double[][] mat = new double[ROWS][COLUMNS];
        //create array based on dimensions

        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int row = 0; row < mat.length; row++)
            for (int col = 0; col < mat[row].length; col++)
                mat[row][col] = input.nextDouble();
        return mat;
        //populate array with inputs
    }

    public static double sumColumn(double[][] mat, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < mat.length; row++) {
            sum = (sum) + mat[row][columnIndex];
        }
        return sum;
    }
}
