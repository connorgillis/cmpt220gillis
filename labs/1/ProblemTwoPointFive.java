package Demo;
import java.util.Scanner;
public class ProblemTwoPointFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter subtotal and gratuity rate: ");
		double subtotal = input.nextDouble(); //store subtotal as var.
		double rate = input.nextDouble(); //store rate as var.
		double tip = subtotal * ( rate / 100 ); //calculate tip
		double total = subtotal + tip; //calculate total
		System.out.print("The gratuity is $" + tip + " and the total is $" + total); //output result
	}
}
