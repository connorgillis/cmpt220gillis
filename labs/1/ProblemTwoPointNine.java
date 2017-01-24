package Demo;
import java.util.Scanner;
public class ProblemTwoPointNine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // load input 
		System.out.print("Enter v0, v1, and t: "); // prompt user
		double v0 = input.nextDouble(); //store user inputs 
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double a = ( v1 - v0 ) / ( t ); //acceleration calculation
		
		System.out.print("The average acceleration is " + a); //output result
	}
}
