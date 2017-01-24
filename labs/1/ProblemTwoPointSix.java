package Demo;
import java.util.Scanner;
public class ProblemTwoPointSix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a number between 0 and 999: "); //prompt user 
		int number = input.nextInt(); //store input in var.
		int un = number % 10; //extract and remove digits 
		number = number / 10;
		int deux = number  % 10;
		number = number / 10;
		int trois = number % 10;
		int sum = ( un + deux + trois); //summation of digits 
		System.out.print("The sum of the digits is " + sum); //output result
	}
}
