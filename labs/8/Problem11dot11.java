import java.util.Scanner;
import java.util.ArrayList;

public class Problem11dot11 {

    public static void main(String[] args) {

        //create scanner obj
        Scanner input = new Scanner(System.in);

        //create ArrayList obj type int
        ArrayList<Integer> list = new ArrayList<Integer>();

        //u_i
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            //append ArrayList obj, list, with inputs
            list.add(input.nextInt());
        }

        //sort using java sort method
        sort(list);

        //print as strings
        System.out.println(list.toString());
    }


    public static void sort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);
    }
}