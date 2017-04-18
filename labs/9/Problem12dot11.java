import java.io.*;
import java.util.*;
//define class Problem12dot11
public class Problem12dot11 {
    //define main method
    public static void main(String[] args) throws Exception {
        //conditional check number of args, args should be two
        if (args.length != 2) {
            System.out.println("Usage: java RemoveText filename");
            System.exit(1);
        }
        //conditional check for existance of file
        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(2);
        }
        //create new arrayList of type <String>, s2
        ArrayList<String> s2 = new ArrayList<>();
        //create new scanner input based on file
        try (Scanner input = new Scanner(file)) {
            //while loop as long as scanner object has another element
            while (input.hasNext()) {
                //create string for each line
                String s1 = input.nextLine();
                //add elements except arg[0] from s1
                s2.add(removeString(args[0], s1));
            }
        }
        //create new PrintWriter object, output, tied to file
        try (PrintWriter output = new PrintWriter(file)) {
            for (int i = 0; i < s2.size(); i++) {
                output.println(s2.get(i));
            }
        }
    }
    //define removeString method
    public static String removeString(String string, String line) {
        StringBuilder stringBuilder = new StringBuilder(line);
        int start = stringBuilder.indexOf(string); // Start index
        int end = string.length(); // End index

        while (start >= 0) {
            end = start + end;
            stringBuilder = stringBuilder.delete(start, end);
            start = stringBuilder.indexOf(string, start);
        }

        return stringBuilder.toString();
    }
}