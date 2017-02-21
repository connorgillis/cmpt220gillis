package week6;
import java.util.Scanner;

//import scanner

public class ProblemEightPointFive {
    public static void main(String[] args) {
        double[][] matrix1 = getmatrix(1);
        double[][] matrix2 = getmatrix(2);

        double[][] matrix3 = addMatrix(matrix1, matrix2);
        //create two matrices, from inputs (getmatrix method)
        print(matrix1, matrix2, matrix3);
        //print matrices using print method
    }

    public static double[][] getmatrix(int n) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix" + n + ": ");

        double[][] mat = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                mat[i][j] = input.nextDouble();
        }
        //accept inputs into array for 9 total values (3 rows, 3 columns ea.)

        return mat;
        //return populated matrix
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        //calculate sum of each value based on corresponding indices, let the sum be the value for those indices
        return c;
    }

    public static void print(double[][] m, int r) {
        for (int j = 0; j < m[r].length; j++) {
            System.out.print(m[r][j] + " ");
        }
    }

    public static void print(double[][] mat1, double[][] mat2, double[][] result) {
        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 3; i++) {
            print(mat1, i);
            print(mat2, i);
            print(result, i);
        } //print matrices row by row
    }
}
