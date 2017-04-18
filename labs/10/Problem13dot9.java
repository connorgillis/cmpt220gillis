abstract class GeometricObject
{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //constructor no-arg GeometricObject
    protected GeometricObject()
    {
        dateCreated = new java.util.Date();
    }

    //constructor GeometricObject w/ fill
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

    //getter return filled?
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
    //create string rep of obj
    public String toString()
    {
        return "created on " + dateCreated + "\ncolor: " + color +
                "\nfilled: " + filled;
    }

    //abstract getArea
    public abstract double getArea();

    //abstract getPerimeter
    public abstract double getPerimeter();
}
//create circle object, comp.
class Circle extends GeometricObject implements Comparable<Circle>
{
    private double radius;

    //constructor no-arg
    public Circle()
    {
        this.radius=1;
    }
    //constructor Circle
    public Circle(double radius)
    {
        this.radius = radius;
    }
    //constructor with fill
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    //getter return radius
    public double getRadius()
    {
        return radius;
    }

    //setter set radius
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    //returns area
    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    //returns diamter
    public double getDiameter()
    {
        return 2 * radius;
    }

    @Override
    //returns perimeter
    public double getPerimeter()
    {
        return 2 * radius * Math.PI;
    }

    @Override
    //true if radius is equal
    public boolean equals(Object o)
    {
        return this.compareTo((Circle)o) == 0;
    }

    @Override
    //compare method
    public int compareTo(Circle o)
    {
        if (this.radius > o.radius)
            return 1;

        else if (this.radius < o.radius)
            return -1;

        else
            return 0;
    }

    @Override
    //retrun string rep. of obj.
    public String toString()
    {
        String s ="";
        s+=super.toString();
        s+="Radius: "+this.radius;
        s+="Area: "+this.getArea();
        s+="Perimeter: "+this.getPerimeter();
        return s;
    }
}

public class Problem13dot9
{
    public static void main( String[] args)
    {
        Circle c1 = new Circle(2, "yellow", true);
        Circle c2 = new Circle(6, "blue", false);
        Circle c3 = new Circle(9, "red", false);
        System.out.println("Test Results: \n");

        //case: equal
        if(c1.compareTo(c2)==0)
        {
            System.out.print("The "+c1.getColor()+" circle is equal to");
            System.out.println("the "+c2.getColor()+" circle.");
        }
        else
        {
            System.out.print("The "+c1.getColor()+" circle is not equal to ");
            System.out.println("the "+c2.getColor()+" circle.");
        }

        //case: gt
        if(c3.compareTo(c2)>0)
        {
            System.out.print("The "+c3.getColor()+" circle is greater than ");
            System.out.println("the "+c2.getColor()+" circle.");
        }

        else
        {
            System.out.print("The "+c3.getColor()+" circle is not greater than");
            System.out.println("the "+c2.getColor()+" circle.");
        }
    }
}