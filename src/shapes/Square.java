package shapes;

class Square extends Rectangle{

    protected double side;

    public Square(double side) {
        super(side, side) ;
        this.side =side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return 4 * side;
    }
}
