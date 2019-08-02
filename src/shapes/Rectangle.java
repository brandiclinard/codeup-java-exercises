package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    @Override
    void setLength(double length) {
        this.length = length;
    }

    @Override
    void setWidth(double width) {
        this.width= width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return (length * width);
    }


//    protected double length;
//    protected double width;
//
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getArea(){
//        return this.length * this.width;
//    }
//
//    public double getPerimeter(){
//        return 2*(this.length) + 2*(this.width);
//    }

}
