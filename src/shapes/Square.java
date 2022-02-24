package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        double side = super.length;
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        double side = super.length;
        return 4 * side;
    }


}
