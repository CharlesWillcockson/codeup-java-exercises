package JavaPractice;

import java.util.Locale;

public class Assessment {
    public static void main(String[] args) {
        System.out.println("half(34) = " + half(34));
        System.out.println("shout(\"get the flip outta here\") = " + shout("get the flip outta here"));
    }

    public static int half(int num){
        return num / 2;
    }

    public static String shout(String str){
        return str.toUpperCase(Locale.ROOT) + "!!!";
    }
}
