package Demo;
import java.util.Scanner;

public class ProblemThreePointFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = input.nextInt(); 
		String currentDayName = " ";
		String elapsedDayName = " ";
		elapsed = (today + elapsed) % 7;

		switch(today) {
		case 0: currentDayName = "Sunday"; break;
		case 1: currentDayName = "Monday"; break;
		case 2: currentDayName = "Tuesday"; break;
		case 3: currentDayName = "Wednesday"; break;
		case 4: currentDayName = "Thursday"; break;
		case 5: currentDayName = "Friday"; break;
		case 6: currentDayName = "Saturday"; break;
		}
		//switch statemenet tranlastes int. value into day string 
		switch(elapsed) {
		case 0: elapsedDayName = "Sunday"; break;
		case 1: elapsedDayName = "Monday"; break;
		case 2: elapsedDayName = "Tuesday"; break;
		case 3: elapsedDayName = "Wednesday"; break;
		case 4: elapsedDayName = "Thursday"; break;
		case 5: elapsedDayName = "Friday"; break;
		case 6: elapsedDayName = "Saturday"; break;
		}
		System.out.print("Today is " + currentDayName + " and the future day is " + elapsedDayName);
	}
}
