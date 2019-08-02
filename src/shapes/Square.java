package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side) ;
    }

//    protected double side;

    @Override
    public void setLength(double side) { super.length = side;
    }

    @Override
    public void setWidth(double side) {
        super.width=side;
    }

    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    //    protected double side;
//
//    public Square(double side) {
//        super(side, side) ;
//        this.side =side;
//    }
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
