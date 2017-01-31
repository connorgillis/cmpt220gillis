package Demo;
import java.util.Scanner;

public class ProblemThreePointTwo {

	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 8 % 10);
		//declare 3 number vars with random values
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ?");
		
		int answer = input.nextInt();
		//declare answer value for user input
		
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
		//create boolean statement based on sum of numbers
	}

}
