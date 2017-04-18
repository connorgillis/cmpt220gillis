import java.io.*;
import java.util.*;
//define class Problem12dot13
public class Problem12dot13 {
    //define main method
    public static void main(String[] args) throws Exception {
        //conditional check user input
        if (args.length != 1) {
            System.out.println("Usage: java filename");
            System.exit(1);
        }
        //conditional check file existence
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args [0] + " does not exist");
            System.exit(2);
        }
        //declare character int
        int characters = 0;
        //declare words int
        int words = 0;
        //declare lines int
        int lines = 0;
        //create new scanner object based on file
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                lines++;
                String line = input.nextLine();
                characters += line.length();
            }
        }
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String line = input.next();
                words++;
            }
        }
        //print results
        System.out.println("File " + file.getName() + " has");
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }
}
