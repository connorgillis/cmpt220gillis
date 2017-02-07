package Demo;

import java.util.Scanner;

public class ProblemSixPointThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer to be reversed");
		int number = input.nextInt();
		//output returned values from methods
		System.out.println(number + " reversed is " + reverse(number));
		
		if (isPalindrone(number)) {
			//check isPalindrone returned bool.
			System.out.println(number + " is a palindrone!");
		} else {
			System.out.println(number + " is not a palindrone");
		}

	}
	
	public static int reverse(int number) {
		String reversed = "";
		while(number != 0){
			//extract digits, add to reversed string
			reversed += number % 10;
			number = number / 10;
		}
		
		return Integer.parseInt(reversed);
		//return the string as an int thru the method
		
	}
	
	public static boolean isPalindrone(int number) {
		if (number == reverse(number)) {
			//test for equality (attribute of palindrone)
			return true; //palindrone
		} else {
			return false; //not palindrone
		}
		
	}

}
