package lab6;
import java.util.GregorianCalendar;

public class ProblemNinePointFive {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();

        //print current data
        System.out.println("Today's Date:");
        System.out.print(date.get(GregorianCalendar.YEAR));
        System.out.print(" / ");
        System.out.print(date.get(GregorianCalendar.MONTH));
        System.out.print(" / ");
        System.out.println(date.get(GregorianCalendar.DAY_OF_MONTH));

        //print time since 1/1/70
        date.setTimeInMillis(1234567898765L);
        System.out.println("Time since 1/1/1970");
        System.out.print(date.YEAR);
        System.out.print(" / ");
        System.out.print(date.MONTH);
        System.out.print(" / ");
        System.out.println(date.DAY_OF_MONTH);
    }
}



