package lab6;
import java.util.Scanner;

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    //initialize variables

    LinearEquation(double a1, double b1, double c1, double d1, double e1, double f1) {
        this.a=a1;
        this.b=b1;
        this.c=c1;
        this.d=d1;
        this.e=e1;
        this.f=f1;
    } //construct object for equation

    public double getA() {
        return(this.a);
    }

    public double getB() {
        return(this.b);
    }

    public double getC() {
        return(this.c);
    }

    public double getD() {
        return(this.d);
    }

    public double getE() {
        return(this.e);
    }

    public double getF() {
        return(this.f);
    }

    public boolean isSolvable()
    {
        double x = this.a*this.d;
        double y = this.b*this.c;

        if(x-y==0)
            return false;
        return(true);
    } //check if a*c - b*c = 0. No solution if 0

    public double getX() {
        if(!this.isSolvable())
            return(0); //return 0 if no solution

        double x=0;
        double n1 = this.e*this.d;
        double n2 = this.b*this.f;

        double d1 = this.a*this.d;
        double d2 = this.b*this.c;

        n1 = n1-n2;
        d1 = d1-d2;
        x = n1/d1;

        return(x);
    }

    public double getY() {
        if(!this.isSolvable())
            return(0);

        double y = 0;
        double n1 = this.a*this.f;
        double n2 = this.e*this.c;

        double d1 = this.a*this.d;
        double d2 = this.b*this.c;

        n1 = n1-n2;
        d1 = d1-d2;
        y = n1/d1;

        return(y);
    }
}

public class ProblemNinePointEleven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        LinearEquation eq;
        double[] arr = new double[6];
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        char x = 'a';

        //fill array based on user inputs
        for (int i = 0; i < 6; i++, x++) {
            System.out.print("Enter value for " + x + ": ");
            arr[i] = reader.nextInt();
        }


        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];
        e = arr[4];
        f = arr[5];

        //create equation object, if solvable get x and y values
        eq = new LinearEquation(a, b, c, d, e, f);
        if (eq.isSolvable()) {
            System.out.println("x = " + eq.getX());
            System.out.println("y = " + eq.getY());
        } else
            System.out.print("Equation has no solution");
        reader.close();
    }
};



