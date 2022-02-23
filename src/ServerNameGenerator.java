
import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"enourmous", "doglike", "silly", "yellow", "fun", "fast", "happy", "gross", "purple", "melancholy"};
        String[] nouns = {"mother", "the Alamo", "San Antonio", "chicken", "shoe", "faucet", "window", "mouse", "beach", "tree"};
        System.out.printf("Your server name is: " + randomString(adjectives) + " " + randomString(nouns));
    }

    public static String randomString(String[] array) {
        Random rando = new Random();
        return array[rando.nextInt(array.length-1)];
    }
}


