package shapes;

public class Square extends Quadrilateral {

    protected double side;

    @Override
    void setLength(double side) {
        this.length = side;
    }

    @Override
    void setWidth(double side) {
        this.width=side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    //    protected double side;
//
    public Square(double side) {
        super(side, side) ;
        this.side =side;
    }
//
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//    }
//
//    public double getArea(){
//        return side * side;
//    }
//
//    public double getPerimeter(){
//        return 4 * side;
//    }
}
