//import for scanner obj
import java.util.Scanner;
//define class Problem12dot5
public class Problem12dot5 {
    //define main method
    public static void main(String[] args) {
        //create scanner obj
        Scanner input = new Scanner(System.in);
        //print instructions to user
        System.out.print("Enter a color: ");
        String color = input.next();
        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        boolean repeatSidesInput = true;
        //loop iterates until bool (above) is false
        do {
            //print instructions to user
            System.out.print("Enter three side of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
            //exception handler for IllegalTriangleException
            try {
                // Create triangle object with user input
                Triangle triangle = new Triangle(side1, side2, side3);
                repeatSidesInput = false;

                triangle.setColor(color);
                triangle.setFilled(filled);

                System.out.println(triangle.toString());
                System.out.println("Area: " + triangle.getArea());
                System.out.println("Perimeter: " + triangle.getPerimeter());
                System.out.println("Color: " + triangle.getColor());
                System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ")
                        + "filled");
            }
            //handle exception and continue to accept inputs
            catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        } while (repeatSidesInput);
    }
}