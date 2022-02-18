import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keepGoing;
        do {
            String question = "?";
            String exclaim = "!";
            String empty = "";
            System.out.println("Say something to Bob.... ");
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Got sumpin else ta say?  [y/n]");
            keepGoing = sc.nextLine();


        } while (keepGoing.equalsIgnoreCase("y"));
    }
}
