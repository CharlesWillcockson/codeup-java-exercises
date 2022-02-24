package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("yes or no?");
        String userEntry = this.scanner.next();
        return userEntry.contains("y");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userEntry = this.scanner.next();
        return userEntry.contains("y");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.printf("Enter a number betwixt %s and %s!\n", min, max);
            userInput = this.scanner.nextInt();
        } while (userInput < min || userInput > max);
        return userInput;
    }


    public int getInt() {
//        System.out.println("Enter an integer:  ");
        return this.scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Enter un doble betwixt %s and %s!\n", min, max);
            userInput = this.scanner.nextDouble();
        } while (userInput <= min || userInput >= max);
        return userInput;
    }

    public double getDouble(){
        System.out.println("Enter a double:  ");
        return this.scanner.nextDouble();
    }
}








