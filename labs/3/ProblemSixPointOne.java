package Demo;

public class ProblemSixPointOne {
	
	public static int getPentagonalNumber(int n) {
		//method returns calculated result for given int n
		int result = 0;
		result = (n * (3 * n - 1)) / 2;
		return result;
		//result returned thru method after calcs
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 101; i++) {
			//begining at 1, add some space, get the number for each run of loop, if element divisible by 10, add new line
			System.out.printf("%9d ", getPentagonalNumber(i));
			if (i % 10 == 0) {
				System.out.println(" ");
			}
		}

	}

}
