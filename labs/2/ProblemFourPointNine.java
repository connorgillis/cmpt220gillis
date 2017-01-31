package Demo;
import java.util.Scanner;

public class ProblemFourPointNine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char c = input.next().charAt(0);
		System.out.println("The unicode value for " + c + " is " + (int)c);
		
	}

}
