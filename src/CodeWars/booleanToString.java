//Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.

package CodeWars;

public class booleanToString {

    public static String boolToWord(boolean b)
    {
        if (b == true){
            return "Yes";
        }else{
            return "No";
        }
    }

    public static void main(String[] args) {
        System.out.println("boolToWord(true) = " + boolToWord(true));
    }
}
