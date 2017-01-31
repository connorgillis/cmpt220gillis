package Demo;
import java.util.Scanner;


public class ProblemFourPointTwenty {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String word = input.nextLine();
		char firstLetter = word.charAt(0); //find character at index 0
		int wordLength = word.length(); //length method applied to word var
		System.out.print("The length of the string " + word + " is " + wordLength + " and the first character is " + firstLetter);
	}

}
