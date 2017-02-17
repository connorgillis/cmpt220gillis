package week5;

/**
 * Created by connorgillis on 2/13/17.
 */

public class ProblemSixPointNine {

    public static void main(String[] args) {
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5) {
            System.out.printf("%5.1f     ", feet);
            System.out.printf("%5.3f     ", footToMeter(feet));
            System.out.printf("     |     ");
            System.out.printf("%-10.1f", meters);
            System.out.printf("%7.3f\n", meterToFoot(meters));

        }
    } //f: space.percessionFloat

    public static double footToMeter(double foot)  {
        return 0.305 * foot; //conversion factor foot --> meter
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter; //conversion factor meter --> foot
    }

}
