import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random rando = new Random();
        int numTries = 1;
        int correctAnswer = rando.nextInt(100);
        System.out.println(correctAnswer);
        while (true) {
            System.out.println("Enter a number betwixt 1 and 100:  ");
            int guess = sc.nextInt();
            System.out.printf("You have guessed %s times!%n", numTries);

            if (guess < correctAnswer) {
                System.out.println("Your guess is too low...");
                numTries++;
            } else if (guess > correctAnswer) {
                System.out.println("Your guess is too high!");
                numTries++;
            } else if (guess == correctAnswer) {
                System.out.println("Got it!");
                numTries++;
                break;
            } else {
                System.out.println("Not a valid guess...enter an integer betwixt 1 and 100!!");
                numTries++;
            }
        }
    }
}
