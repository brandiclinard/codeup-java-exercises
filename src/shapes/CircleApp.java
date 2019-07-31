package shapes;


import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println();
        double radius = input.getDouble("Please input the radius of your circle:");
        Circle ourFunCircle = new Circle(radius);
        System.out.printf("area: %f%n " ,ourFunCircle.getArea());
        System.out.printf("circumference: %f%n " ,ourFunCircle.getCircumference());
    }
}
