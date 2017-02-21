package week6;

import java.util.Scanner;
//import scanner

public class ProblemSevenPointNineteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //initialize scanner

        // Prompt for user input
        System.out.print("Enter list: ");
        int[] list = new int[input.nextInt()];
        for (int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        //store each value in array

        // Displays whether the list is sorted or not.
        if (isSorted(list)) {
            System.out.println("The list is already sorted");
        } else {
            System.out.println("The list is not sorted");
        }
    }


    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1])
                return false;
            //return false where some element is greater than that element of the next index
        }
        return true;
        //where each value is less than that of next value (index + 1) then return true
    }
}
