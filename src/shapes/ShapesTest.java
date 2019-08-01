package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.printf("This rectangle's area is: %.2f%n",  box1.getArea());
        System.out.printf("This rectangle's perimeter is: %.2f%n" , box1.getPerimeter());
        Rectangle box2 = new Square(5);
        System.out.printf("This square's area is: %.2f%n", box2.getArea());
        System.out.printf("This square's perimeter is: %.2f%n", box2.getPerimeter());

    }
}
