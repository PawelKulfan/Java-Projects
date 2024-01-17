package inheritanceExcersises.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Shape(3.4, 4.5, "Red");
        System.out.println(shape1.getDescription());
        Shape shape2 = new Shape(3, 4, "Blue");
        System.out.println(shape2.getDescription());
        double getDistance1from2 = shape1.getDistance(shape2);
        System.out.println(getDistance1from2);
        Circle circle1 = new Circle(5.6, 3.2, "Yellow", 14.2);
        System.out.println(circle1.getDescription());;
        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircuit());
        System.out.println(shape1.getDistance(circle1));
    }
}
