package week6;


public class ProblemEightPointTen {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        //create 4 by 4 matrix

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                //math.random creates dec, parse as int for 0|1
            }
        } //for each index (row & column) populate with random number 1|0

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        } //print every element from arrays


        System.out.println("The largest row index: " + largestRow(matrix));
        System.out.println("The largest row column: " + largestColumn(matrix));
        //output results based on methods
    }

    public static int largestRow(int[][] mat) {
        int maxRowIndex = 0;
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRowIndex = i;
            } //where the count is grater than max (only changes if count > max) set max to count
        }//check for 1, if one add to count for row
        return maxRowIndex;
        //return method result
    }

    public static int largestColumn(int[][] mat) {
        int maxColumnIndex = 0;
        int max = 0;
        for (int col = 0; col < mat[0].length; col++) {
            int count = 0;
            for (int row = 0; row < mat.length; row++) {
                if (mat[row][col] == 1)
                    count++;
            } //check for 1, if 1 add to count
            if (count > max) {
                max = count;
                maxColumnIndex = col;
                //where the count is grater than max (only changes if count > max) set max to count
            }
        }
        return maxColumnIndex;
        //return method result
    }
}
