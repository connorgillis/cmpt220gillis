package lab6;


class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        this.width=1;
        this.height=1;
    } //construct defualt rectangle

    Rectangle(double myWidth, double myHeight) {
        this.width=myWidth;
        this.height=myHeight;
    } // main rectangle constructor



    public double getArea() {
        double area = this.width*this.height;
        return(area);
    } //return area


    public double getPerimeter() {
        double side1 = this.width*2;
        double side2 = this.height*2;

        return(side1+side2);
    } //return perimeter
}

public class ProblemNinePointOne {
    public static void main(String[] args)
    {
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Area: "+rec1.getArea());
        System.out.println("Perimeter: "+rec1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.println("Area: "+rec2.getArea());
        System.out.println("Perimeter: "+rec2.getPerimeter());
    }

}
