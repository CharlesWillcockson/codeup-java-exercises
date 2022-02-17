import java.security.PublicKey;
import java.util.Scanner;


public class MethodsExercise {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        add(3, 7);
        subtract(10, 4);
        multiply(3, 3);
        divide(6, 3);
        modulus(10, 3);
        System.out.println(times(3, 6));
        System.out.println(getInteger(1, 10));
        System.out.println(factorial(1));

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
    public static long times(int num1, int num2) {
        if (num2 > 0) {
            return num1 + times(num1, num2 - 1);
        } else if (num2 < 0) {
            return -num1 + times(num1, num2 + 1);
        }
        return 0;
    }

    //EXERCISE 2 -------------------------
    public static int getInteger(int min, int max) {
        System.out.printf("Enter an number betwixt %s and %s:  ", min, max);
        int input = sc.nextInt();
        if (!(input >= min && input <= max)) {
            input = getInteger(min, max);
        }
        return input;
    }

//    EXERCISE 3 ----------------------------

    public static long factorial(int num) {
        int userInput = getInteger(1, 10);
        long output = 1;
        for (int i = 1; i <= userInput; i++) {
            output *= i;
        }
        return output;
    }


    //     EXERCISE 4---------------------------------------
    public static int diceRoll(int die1, int die2) {
        System.out.println("Enter the number of side on your dice:  ");
        int userInput = sc.nextInt();
        System.out.println(userInput);
        return userInput;
    }

}