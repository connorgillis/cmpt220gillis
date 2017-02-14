package week5;


public class ProblemSixPointTwelve {

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS_PER_LINE = 10;
        //static var defines number of chars per line (from problem)
        char c1 = '1'; //min char
        char c2 = 'Z'; //max char
        System.out.println("Characters 1-Z");
        System.out.println(" ");
        printChars(c1, c2, NUMBER_OF_CHARS_PER_LINE);
    }

    public static void printChars(char c1, char c2, int numberOfCharsPerLine) {
        for (char currentChar = c1, i = 1; currentChar <= c2; currentChar++, i++) {
            if ((i % numberOfCharsPerLine) == 0) {
                System.out.println(currentChar);
            } else {
                System.out.print(currentChar + " ");
            }
        }
    }
}
