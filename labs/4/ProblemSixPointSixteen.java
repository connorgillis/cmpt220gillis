package week5;



public class ProblemSixPointSixteen {

    public static void main(String[] args) {
        System.out.println("Year     Number of Days in Year"); //print header
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "         " + numberOfDaysInAYear(year));
        } //loop while calling method with year pram.
    }
    public static int numberOfDaysInAYear(int year){
        if (LeapYear(year))
            return 366;
        else
            return 365;
    }

    public static boolean LeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0);
		// JA: There is a problem with this logic. It is missing the year % 400 term. Year 2000 was a leap year.
    } //leap year logic determines
}