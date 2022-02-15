import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s", pi);
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
//        System.out.print("Enter an integer:");
//        int userInput = scanner.nextInt();
//        System.out.print("Please enter 3 words:");
//        String input1 = scanner.next();
//        String input2 = scanner.next();
//        String input3 = scanner.next();
//        System.out.printf("%s \n%s \n%s", input1, input2, input3);
//        System.out.print("Please enter a sentence:");
//        String userInput = scanner.nextLine();
//        System.out.println(userInput);
        System.out.print("Enter the length of the classroom:");
        String length = scanner.nextLine();
        System.out.print("Enter the width of the classroom:");
        String width = scanner.nextLine();
        System.out.print("Enter the height of the room:");
        String height = scanner.nextLine();
//        int x = Integer.parseInt(length);
//        int y = Integer.parseInt(width);
//        int z = Integer.parseInt(height);
//        int area = x * y;
//        int perimeter = (x * 2) + (y * 2);
//        int volume = x * y * z;
        double x = Double.parseDouble(length);
        double y = Double.parseDouble(width);
        double z = Double.parseDouble(height);
        double area = x * y;
        double perimeter = (x * 2) + (y * 2);
        double volume = x * y * z;
        System.out.printf("The area of the classroom is %s, the perimeter is %s, and the volume is %s", area, perimeter, volume);



    }
}
