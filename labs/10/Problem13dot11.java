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

    //constructor GeoObj w/ filled
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

    //getter return isfilled?
    public boolean isFilled()
    {
        return filled;
    }

    //setter set filled
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    //getter dateCreated
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    @Override
    //create string rep of GeoObj.
    public String toString()
    {
        return "created on " + dateCreated + "\ncolor: " + color +
                "\nfilled: " + filled;
    }

    //abstract getArea method
    public abstract double getArea();

    //abstract getPerimeter
    public abstract double getPerimeter();
}

//create octagon class sub of GeoObj
class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>
{
    private double side;

    //constructor no-arg
    Octagon()
    {
        this.side=1;
    }
    //constructor Octagon
    Octagon(double side)
    {
        this.side=side;
    }

    //getter return side
    public double getSide()
    {
        return this.side;
    }
    //setter set side
    public void setSide(double side)
    {
        this.side=side;
    }

    @Override
    //getter returns area
    public double getArea()
    {
        return(2+4/Math.sqrt(2)) * side * side;
    }

    @Override
    //getter return perimeter
    public double getPerimeter()
    {
        return 8*side;
    }

    @Override
    //compare method
    public int compareTo(Octagon o)
    {
        if(getArea() > o.getArea())
            return 1;

        if(getArea() < o.getArea())
            return -1;

        else
            return 0;
    }

    @Override
    //clone method
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    //return string rep. of obj.
    public String toString()
    {
        String s="";
        s+="\nSide Length: "+this.side;
        s+="\nArea: "+this.getArea();
        s+="\nPerimeter: "+this.getPerimeter();
        return s;
    }
}
//main class for exercise
public class Problem13dot11
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Octagon oc = new Octagon(2);
        Octagon oc2 = new Octagon();

        //cloning
        oc2 = (Octagon) oc.clone();

        System.out.println("Test Results: \n");

        if(oc.compareTo(oc2)==0)
            System.out.println("Clone Succesful.");
    }
}