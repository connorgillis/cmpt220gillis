public class TenPointElevenClient {

    public static void main(String[] args) {
        // create circle object
        Circle2D circle = new Circle2D(2, 2, 5.5);

        // Display results
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println(
                "Contains the point (3, 3)? " + circle.contains(3, 3));
        System.out.println(
                "Contains the circle centered (4, 5) and radius 10.5? "
                        + circle.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(
                "Overlap the circle centered at (3, 5) and radius 2.3? "
                        + circle.overlaps(new Circle2D(3, 5, 2.3)));
    }
}