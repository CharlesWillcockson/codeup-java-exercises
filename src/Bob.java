import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String question = "?";
        String exclaim = "!";
        String empty = "";
        System.out.println("Say something to Bob.... ");
        String userInput = sc.nextLine();
        if (userInput.endsWith(question)){
            System.out.println("Sure");
        }else if (userInput.endsWith(exclaim)){
                System.out.println("Whoa, chill out!");
            }else if(userInput.equals(empty)){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever." +
                    "");
        }


    }
}
