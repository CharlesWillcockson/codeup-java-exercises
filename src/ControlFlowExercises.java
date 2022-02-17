import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        EXERCISE #1 LOOP BASICS -----------------------
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i++ + " ");
//        }
//    }
//        for(int i = 0; i <= 15; i++){
//            System.out.print(i + " ");
//        }
//        int i = 0;
//        do {
//            System.out.println(i += 2);
//        } while (i < 100);
//
//        for (int i = 2; i < 100; i += 2){
//            System.out.println(i);
//        }
//        int i = 100;
//        do {
//            System.out.println(i -= 5);
//        }while (i > 0);
//        for (int i = 100; i > 0; i -= 5){
//            System.out.println(i);
//        }
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i < 1000000);
//        for (long i = 2; i < 1000000; i *= i){
//            System.out.println(i);

//           EXERCISE #2 FIZZBUZZ -------------------------------
//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }

//        EXERCISE #3 DISPLAY A TABLE OF POWERS
//        System.out.print("What number would you like to go up to? ");
//        int num = scanner.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println("Number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (int i = 1; i <= num; i++){
//            System.out.print(i + "      |");
//            System.out.print(i * i + "        |");
//            System.out.println(i * i * i);
//
//        }

//        EXERCISE #4 CONVERT GIVEN NUMBERS INTO LETTER GRADES ----------------
        System.out.print("Enter a numerical grade from 0 to 100: " );
        int grade = scanner.nextInt();
        if (grade > 88){
            System.out.println("A");
        }else if (grade > 79 && grade < 88){
            System.out.println("B");
        }else if (grade > 66 && grade < 80){
            System.out.println("C");
        }else if (grade > 59 && grade < 67){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
