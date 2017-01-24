package Demo;
import java.util.Scanner;
public class ProblemTwoPointOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a degree in Celsius: "); //prompt for degree c
		double celsius = input.nextDouble(); //store input as var
		double fahrenheit = (9.0 / 5) * celsius + 32; //calculate result
		System.out.print(celsius + " is " + fahrenheit + " in fahrenheit"); //output in fahrenheit
	}
}
