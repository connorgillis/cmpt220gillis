abstract class GeometricObject implements Comparable<GeometricObject>
{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //constructor no-arg GeometricObject
    protected GeometricObject()
    {
        dateCreated = new java.util.Date();
    }

    //constructor default GeometricObject
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

    //getter get date
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

    @Override
    //method compareTo returns value based on comparison
    public int compareTo(GeometricObject go)

    {
        if(this.getArea()>go.getArea())
            return 1;

        else if(this.getArea()>go.getArea())
            return -1;

        else
            return 0;
    }

   //method returns max of two comp. objs
    public static GeometricObject max(GeometricObject o, GeometricObject o2)
    {
        return o.compareTo(o2)==1 ? o:o2;
    }

    //method abstract getArea
    public abstract double getArea();

    //method abstract getPerimeter
    public abstract double getPerimeter();
}

class Rectangle extends GeometricObject
{
    private double width;
    private double height;

    //no arg
    public Rectangle()
    {
        this.width=1;
        this.height=1;
    }

    //constructor default rectangle
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }


    //constructor rectangle with filled
    public Rectangle(double width, double height, String color, boolean filled)
    {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    //getter retrun width
    public double getWidth()
    {
        return width;
    }

    //setter set width
    public void setWidth(double width)
    {
        this. width = width;
    }

    //getter return height
    public double getheight() {
        return height;
    }

    //setter set height
    public void setheight(double height)
    {
        this.height = height;
    }

    @Override
    //return area
    public double getArea() {
        return width * height;
    }

    @Override
    //return perimeter
    public double getPerimeter()
    {
        return 2 * (width * height);
    }

    @Override //returns data field listing
    public String toString()
    {
        String s = super.toString();
        s+="\nWidth: "+this.width;
        s+="\nHeight: "+this.height;
        s+="\nArea: "+this.getArea();
        s+="\nPerimeter: "+this.getPerimeter();
        return s;
    }
}

class Circle extends GeometricObject
{
    private double radius;

    //constructor no-arg
    public Circle()
    {
        this.radius=1;
    }

    //constructor default
    public Circle(double radius)
    {
        this.radius = radius;
    }

    //constructor with filled
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    //getter return radius
    public double getRadius() {
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

    //returns 2*radius
    public double getDiameter()
    {
        return 2 * radius;
    }

    @Override
    //returns 2*pi*radius
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    //return string of obj
    public String toString()
    {
        String s = super.toString();
        s+="\nRadius: "+this.radius;
        s+="\nDiameter: "+this.getDiameter();
        s+="\nArea"+this.getArea();
        s+="\nPerimeter: "+this.getPerimeter();
        return s;
    }
}

public class Problem13dot5
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(3, "Green", true);
        Circle c2 = new Circle(7, "Red", false);
        String s = "The ";

        Rectangle r1 = new Rectangle(2, 4, "Blue", true);
        Rectangle r2 = new Rectangle(8, 9, "Yellow", false);

        System.out.print("Test Results: \n\n");
        s+=Circle.max(c1, c2).getColor();
        s+=" circle is larger.";
        System.out.println(s);

        s="The "+Rectangle.max(r1, r2).getColor();
        s+=" rectangle is larger.";
        System.out.println(s);
    }
}