package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Charles");
        Student student2 = new Student("Robert");
        Student student3 = new Student("Nelson");
        Student student4 = new Student("Andrew");

        student1.addGrade(95);
        student1.addGrade(90);
        student1.addGrade(98);

        student2.addGrade(95);
        student2.addGrade(91);
        student2.addGrade(88);

        student3.addGrade(95);
        student3.addGrade(99);
        student3.addGrade(92);

        student4.addGrade(96);
        student4.addGrade(97);
        student4.addGrade(98);

        students.put("ThunderGun", student1);
        students.put("SneakerFreak", student2);
        students.put("MrMundst", student3);
        students.put("TheBeard", student4);



        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("0. Exit application");
        System.out.println("1. View a student's information");
        System.out.println(("2. View all of the students grades."));


        int menuChoice = 0;
        boolean cont = true;

        while (cont) {
            menuChoice = sc.nextInt();
            switch (menuChoice) {
                case 0:
                    cont = false;
                    System.out.println("Thank you for using the grading application");
                case 1:
                    System.out.println("-----Here is a list of the student's GitHub usernames-----");
                    System.out.println();
                    for (String key : students.keySet()) {
                        System.out.printf("|%s|", key);
                    }
                    System.out.println();
                    System.out.println("\nWhich student would you like to see more information on?");
                    String choice = sc.nextLine();
                    Student userChoice = students.get(choice);
                    try {
                        System.out.printf("Github name: %s%n"
                                        + "Real name: %s%n"
                                        + "Current grades: %s%n"
                                        + "Current average: %.1f%n ",
                                choice, userChoice.getName(), userChoice.getGrades(), userChoice.getGradeAverage()
                        );
                    } catch (Exception e) {
                        System.out.println("Sorry, that user does not exist...");
                    }
                case 2:
                    for (String student : students.keySet()){
                        System.out.printf("Name %s%n Grades: %s%n", students.get(student).getName(), students.get(student).getGrades());
                    }


            }
        }
    }
}
