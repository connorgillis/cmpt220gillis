
//define GeometricObjectClass
public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    //no-arg constructor with date property
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }
    //constructor
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    //getter getColor
    public String getColor() {
        return color;
    }
    //setter setColor
    public void setColor(String color) {
        this.color = color;
    }
    //getter isFilled
    public boolean isFilled() {
        return filled;
    }
    //setter setFilled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //getter dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    //getter toString returns string desc. of obj.
    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}