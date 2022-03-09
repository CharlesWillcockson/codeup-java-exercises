//   w3resource.com/java-exercises/basic/index.php


import java.util.Scanner;

public class practiceFromW3 {
    String str;
    public static void characterAt (String str){
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);
        System.out.println((char)index1);
        System.out.println((char)index2);
    }

    public static double smallest(double a, double b, double c){
        return Math.min(a, Math.min(b,c));
    }



    public static void main(String[] args) {
        characterAt("Java exercises!");
        System.out.println("smallest(25.1, 32.2, 1.4) = " + smallest(25.1, 32.2, 1.4));
    }
}
