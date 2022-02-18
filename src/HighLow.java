import java.util.Scanner;
import java.util.Random;

public class HighLow {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random rando = new Random();
        int numTries = 1;
        int maxTries = 10;
        int correctAnswer = rando.nextInt(100);
        System.out.println(correctAnswer);
        while (true) {
            System.out.print("Enter a number betwixt 1 and 100:  ");
            int guess = sc.nextInt();
            System.out.printf("You have guessed %s times!%n", numTries);
            if (numTries == maxTries){
                System.out.println("You've reached the max number of guesses and you didn't get it...go flog yourself!");
                break;
            }

            if (guess < 1 || guess > 100){
                System.out.println("Not a valid entry!");
            }
            else if (guess < correctAnswer) {
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
