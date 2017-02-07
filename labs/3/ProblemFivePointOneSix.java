package Demo;

import java.util.Scanner;

public class ProblemFivePointOneSix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
			
		int n = input.nextInt();
		int test = 2; //declare test var to check factor against total, n

			
			while (n / test != 1) {
			//check for 1, (everything divisible by one and itself), if not, check for remainder 0 which denotes a factor	
				if (n % test  == 0) {
					System.out.print(test + ", ");
					n = (n / test); 
				}
				else
					test++; 
			}
			System.out.println(n + ".");
			//print remaining n value where test = 1
		}
	

}
