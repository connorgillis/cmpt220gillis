package week5;

import java.util.Scanner;

public class ProblemSixPointEighteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a password: ");
        String password = input.nextLine();


        System.out.println(
                (isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
    } //output result based on method returns (valid || invalid)

    public static boolean isValidPassword(String password) {
        final int LENGTH = 8;
        final int MINIMUM = 2;

        boolean validPassword =
                isLengthValid(password, LENGTH) &&
                        lettersAndDigits(password) &&
                        digits(password, MINIMUM);

        return validPassword;
    }

    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    } //check length of inputed password var with static var for length (8)


    public static boolean lettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            } //test every char of the string, return false if char at is not letter or digit
        }
        return true;
    }

    public static boolean digits(String password, int x) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
            if (numberOfDigits >= x) {
                return true; //increment through digits, checking validitiy and adding to total number of digits, if digits pass return true bool
            }
        }
        return false; //return false if not digits or not greater than min.
    }
}