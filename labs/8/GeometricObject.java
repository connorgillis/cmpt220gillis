public class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //constructor GeometricObject
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    //constructor GeometricObject pt. 2
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    //getter return color
    public String getColor() {
        return color;
    }

    //setter this.color
    public void setColor(String color) {
        this.color = color;
    }

    //getter return filled?
    public boolean isFilled() {
        return filled;
    }

    //setter this.filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //getter retrun dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    //getter return toString!
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}