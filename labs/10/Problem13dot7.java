interface Colorable
{
    //directions
    String howToColor();
}
//create abstract GeometricObject class
abstract class GeometricObject
{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //constructor no-arg Geometric Object
    protected GeometricObject()
    {
        dateCreated = new java.util.Date();
    }

    //constructor GeometricObject with fill
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

    //getter return date created
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

    //abstract getArea
    public abstract double getArea();

    //abstract getPerimeter
    public abstract double getPerimeter();
}
//create square subclass
class Square extends GeometricObject implements Colorable
{
    private double sideLength;

    //constructor no-arg square
    Square()
    {
        this.sideLength=1;
    }
    //constructor with fill
    Square(double sideLength, String color, boolean filled)
    {
        super(color, filled);
        this.sideLength=sideLength;
    }

    //getter retrun sideLength
    public double getSideLength()
    {
        return this.sideLength;
    }

    //setter set side l.
    public void setSideLength(double sideLength)
    {
        this.sideLength=sideLength;
    }

    @Override
    //return area method
    public double getArea()
    {
        return (this.sideLength*this.sideLength);
    }

    @Override
    //returns perimeter method
    public double getPerimeter()
    {
        return this.sideLength*4;
    }

    @Override
    public String howToColor()
    {
        return "Color all four sides";
    }

    @Override
    public String toString()
    {
        String s="";
        s+=super.toString();
        s+="\nSide Length: "+this.getSideLength();
        s+="\nArea: "+this.getArea();
        s+="\nPerimeter: "+this.getPerimeter();
        return s;
    }
}

class Problem13dot7
{
    //main method for exercise
    public static void main(String[] args)
    {
        Square sq = new Square(7, "Green", false);
        System.out.println("Test Results: \n");
        System.out.println(sq.toString());
        System.out.println("How to Color: "+sq.howToColor());
    }
}