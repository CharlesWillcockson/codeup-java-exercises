package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean circleTheWagons = true;
        int count = 0;

        while (circleTheWagons) {
            Input input = new Input();

            System.out.println("Enter the radius of the circle:  ");
            double radius = input.getDouble();
            Circle circle1 = new Circle(radius);

            System.out.println("The area of the circle is: " + circle1.getArea());
            System.out.println("The circumfrence is: " + circle1.getCircumfrence());
            count++;

            System.out.println("You have created " + Circle.counter());
            circleTheWagons = input.yesNo("Would you like to make another round thingy?");

        }
    }
}
