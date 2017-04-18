//define class Problem12dot1
public class Problem12dot1 {
    //define main method
    //main throws NumberFormatException if args != 3
    public static void main(String[] args) throws NumberFormatException {
        //conditional est. exception
        if (args.length != 3) {
            System.out.println("syntax: operand operator operand");
            System.exit(0);
        }
        //declare int result
        int result = 0;
        //exception handler for exception
        try {
            //switch conditional determines operand/operator and performs
            //arithmetic based on array of arguments, parsed as ints
            switch (args[1].charAt(0)) {
                case '+' : result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                    break;
                case '-' : result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                    break;
                case '.' : result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                    break;
                case '/' : result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
                    break;
            }
            //println returns result to user
            System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                    + " = " + result);
        }
        //catch handles NumberFormatException
        catch (NumberFormatException e) {
            System.out.println("Wrong Input: " +
                    e.getMessage().substring(e.getMessage().indexOf("\"") + 1,
                            e.getMessage().lastIndexOf("\"")));
        }
    }
}