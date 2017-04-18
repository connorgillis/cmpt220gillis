
//define class Triangle, subclass of GeometricObject
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    //constructor no-arg
    public Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    //constructor
    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        //conditional checking for exception
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            throw new IllegalTriangleException(side1, side2, side3);
        //if, throw exception with side args
        //set args to values
        this.side1 = side1;
        //set args to values
        this.side2 = side2;
        //set args to values
        this.side3 = side3;
    }

    //getter side1
    public double getSide1() {
        return side1;
    }

    //getter side2
    public double getSide2() {
        return side2;
    }

    //getter side3
    public double getSide3() {
        return side3;
    }

    //getter getArea
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //getter getPerimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    //getter toString returns values in string format
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}