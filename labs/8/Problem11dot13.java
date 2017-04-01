import java.util.Scanner;
import java.util.ArrayList;

public class Problem11dot13 {

    public static void main(String[] args) {

        //create scanner obj
        Scanner input = new Scanner(System.in);

        //create ArrayList obj type int
        ArrayList<Integer> list = new ArrayList<Integer>();

        //u_i
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
            //append ArrayList obj, list, with inputs
        }

        //remove duplicates using method
        removeDuplicate(list);

        // Display the distinct integers
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    //remove duplicates methods, takes ArrayList obj
	// JA: A better approach is to replicate the arraylist without the duplicates.
    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j))
                    list.remove(j);
            }
        }
    }
}