
package shapes;

public class Circle {
    private double radius;
    private static int count;

    public Circle (double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumfrence(){
        return 2 * Math.PI * this.radius;
    }

    public static int counter() {
        return count;
    }

    public static void getCount(int cnt){
        count = cnt;
    }
}
