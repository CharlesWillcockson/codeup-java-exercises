package shapes;

public class Square extends Quadrilateral {

    public Square(int side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

}
//    private double side;
//
//    public Square(double side) {
//        super(side, side);
//    }
//
//    public double getArea() {
//        double side = super.length;
//        return Math.pow(side, 2);
//    }
//
//    public double getPerimeter() {
//        double side = super.length;
//        return 4 * side;
//    }
//
//
//}
