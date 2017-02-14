package week5;


import java.util.Scanner;

public class ProblemSevenPointFour {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt ther user to enter an scores
        System.out.print("Enter scores: (negative number signifies end): ");

        int[] scores = new int[100];  //declare array with max number 100
        int num;
        int numScores;
        int average;
        numScores = 0;
        average = 0;



        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0)
                break;

            scores[i] = num;
            average += num;
            numScores++;

            // increment through inputs, call each num
            // avarge is sum of scores at this point
            // increment number of scores for each round of loop

            average /= numScores; //statement calculates actual average by didving by number of scores and setting itself equal to this num
        }
        int aboveOrEqual;
        int below;
        aboveOrEqual = below = 0;

        for (int i = 0; i < numScores; i++) {
            if (scores[i] >= average)
                aboveOrEqual++; //increment above or equal
            else
                below++; //increment below
        }

        // Print results to screen: avg, number above, number below
        System.out.println("\nAverage of scores: " + average);
        System.out.println(
                "Number of scores above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average: " + below);
    }

}