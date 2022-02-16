import java.security.PublicKey;
import java.util.Scanner;


public class MethodsExercise {
    public static void main(String[] args) {
        add(3, 7);
        subtract(10, 4);
        multiply(3, 3);
        divide(6, 3);
        modulus(10,3);
        System.out.println(times(3, 6));
        System.out.println(getInteger(1, 10));
    }

//    EXERCISE 1------------------------
    public static long add(int num1, int num2) {
        long sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }
    public static long subtract(int num1, int num2) {
        long sum = num1 - num2;
        System.out.println(sum);
        return sum;
    }
    public static long multiply(int num1, int num2) {
        long sum = num1 * num2;
        System.out.println(sum);
        return sum;
    }
    public static long divide(int num1, int num2) {
        long sum = num1 / num2;
        System.out.println(sum);
        return sum;
    }
    public static int modulus(int num1, int num2) {
        int mod = num1 % num2;
        System.out.println(mod);
        return mod;
    }

//    BONUS----------------------
    public static long times(int num1, int num2){
        if (num2 > 0){
            return num1 + times(num1, num2 - 1);
        }else if (num2 < 0){
            return -num1 + times(num1, num2 + 1);
        }
        return 0;
    }

//EXERCISE 2 -------------------------
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter an number betwixt %s and %s:  ", min, max);
        int input = sc.nextInt();
        if (!(input >= min && input <= max)){
            input = getInteger(min, max);
        }
        return input;
    }

//    EXERCISE 3 ----------------------------

    public static long factorial(int num){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter an number betwixt 1 and 10:  ");
        int input = sc.nextInt();

    }
}
