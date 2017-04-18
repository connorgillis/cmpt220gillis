//import for Scanner obj
import java.util.*;
//define Problem12dot3
public class Problem12dot3 {
    //define main method
    public static void main(String[] args) {
        //create scanner obj
        Scanner input = new Scanner(System.in);
        //declare array of ints, equal to getArray() method
        int[] array = getArray();
        //print instructions to user
        System.out.print("Enter the index of the array: ");
        //exception handler for ArrayIndexOutOfBoundsException
        try {
            // Display the corresponding element value
            System.out.println("The corresponding element value is " +
                    array[input.nextInt()]);
        }
        //handle exception ArrayIndexOutOfBounds
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds :(");
        }
    }
    //define method getArray() return type int[]
    public static int[] getArray() {
        //declare int array of length 100
        int[] array = new int[100];
        //iterate array, appending random vals
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }
        //return array
        return array;
    }
}