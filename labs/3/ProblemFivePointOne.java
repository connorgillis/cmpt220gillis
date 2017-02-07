package Demo;

import java.util.Scanner;


public class ProblemFivePointOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an int, the input ends if it is 0");
		
		int data = input.nextInt();
		int pos = 0; //declare vars for number of pos, neg, sum, avg, and input count
		int neg = 0;
		
		int sum = 0;
		int avg = 0;
		int count = 0;
		while (data != 0) {
			sum += data;
			if (data <= 0) {
				neg++;
			} else {
				pos++;
			};
			System.out.print("Enter an int, the input ends if it is 0");
			data = input.nextInt();
			count++;
		} //execute 'while' data is not 0 or 'until' data = 0 
		
		System.out.println("The number of negatives is " + neg);
		System.out.println("The number of positives is " + pos);
		System.out.println("The total is "  + sum);
		System.out.println("The average is " + (sum / count)); //calculate avg given total (above) and count iterator


	}

}
