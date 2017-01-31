package Demo;
import java.util.Scanner;

public class ProblemFourPointThirteen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a letter: ");
		String word = input.next();
		word = word.toLowerCase();
		char c = word.charAt(0);
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {		
		//check for valid char.
			switch(c)
			{
				case 'a':
				System.out.println(word + " is a vowel");
				break;

				case 'e':
				System.out.println(word + " is a vowel");
				break;

				case 'i':
				System.out.println(word + " is a vowel");
				break;
 
				case 'o':
				System.out.println(word + " is a vowel");
				break;
 
				case 'u':
				System.out.println(word + " is a vowel");
				break;
 
            default:
            System.out.println(word + "is a consanant");
            break;
        }
		} else {
			System.out.print(word + " is not a letter");
		}

	}

}
