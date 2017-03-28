import java.util.Scanner;

public class Problem11dot1 {
    public static void main(String[] args) {

        //create an instance of scanner
        Scanner input = new Scanner(System.in);

        //u_i
        System.out.print("Enter three side of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        //u_i
        System.out.print("Enter a color: ");
        String color = input.next();

        //u_i
        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        //create instance of triangle!
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        //return the getters
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ") + "filled");
    }
}