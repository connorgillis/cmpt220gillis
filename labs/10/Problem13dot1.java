import java.util.Scanner;

//create GeometricObject abstract class
abstract class GeometricObject
{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //constructor, protected, for GeometricObject
    protected GeometricObject()
    {
        dateCreated = new java.util.Date();
    }

    //constructor, protected, for GeometricObject
    protected GeometricObject(String color, boolean filled)
    {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //getter return color
    public String getColor()
    {
        return color;
    }

    //setter set color
    public void setColor(String color)
    {
        this.color = color;
    }

    //getter return is filled?
    public boolean isFilled()
    {
        return filled;
    }

    //setter set fill
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    //getter return dateCreated
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    @Override
    public String toString()
    {
        return "created on " + dateCreated + "\ncolor: " + color +
                "\nfilled: " + filled;
    }

    //abstract getArea()
    public abstract double getArea();

    //abstract getPerimeter
    public abstract double getPerimeter();
}

//create Triangle class
class Triangle extends GeometricObject
{
    private double side1;
    private double side2;
    private double side3;

    //constructor no-arg
    public Triangle()
    {
        this.side1=1;
        this.side2=1;
        this.side3=1;
    }

    //constructor
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //constructor with fill status attribute
    public Triangle(double side1, double side2, double side3, String color, boolean filled)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.setColor(color);
        this.setFilled(filled);
    }

    //getter return side 1
    public double getSide1()
    {
        return this.side1;
    }

    //setter set side 1
    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    //getter get side 2
    public double getSide2()
    {
        return this.side2;
    }

    //setter set side 2
    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    //getter for side 3
    public double getSide3()
    {
        return this.side3;
    }

    //setter for side 3
    public void setSide3(double side3)
    {
        this.side3 = side3;
    }

    @Override //returns area
    public double getArea()
    {
        double sides = (side1+side2+side3)/2;
        return Math.sqrt(sides*(sides-side1)*(sides-side2)*(sides-side3));
    }

    @Override
    //getPerimeter method
    public double getPerimeter()
    {
        return this.side1 + this.side2 + this.side3;
    }

    @Override //returns string listing of fields
    //toString method
    public String toString()
    {
        String listing = super.toString();
        listing+="\nArea: "+this.getArea();
        listing+="\nPerimeter: "+this.getPerimeter();

        return listing;
    }
}

public class Problem13dot1
{
    //main method
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String color = "";
        double s1, s2, s3;
        boolean filled;

        System.out.print("Enter side 1: ");
        s1=reader.nextDouble();
        System.out.print("Enter side 2: ");
        s2=reader.nextDouble();
        System.out.print("Enter side 3: ");
        s3=reader.nextDouble();

        System.out.print("Enter a color: ");
        color=reader.next();
        System.out.print("is it filled? (true/false): ");
        filled=reader.nextBoolean();

        Triangle t1 = new Triangle(s1, s2, s3, color, filled);
        System.out.println("\n"+t1.toString());

        reader.close();
    }
}