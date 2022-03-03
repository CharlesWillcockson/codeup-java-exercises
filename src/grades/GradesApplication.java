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

        System.out.println("-----Here is a list of the student's GitHub usernames-----");
        for (String key : students.keySet()) {
            System.out.printf("%s\n", key);
        }
        System.out.println("Which student would you like to see more information on?");
        String choice = sc.nextLine();
        Student userChoice = students.get(choice);

        try{
            System.out.printf("Github name: %s%n"
            + "Real name: %s%n"
            + "Current grades: %s%n"
            + "Current average: %.1f%n ",
                    choice, userChoice.getName(), userChoice.getGrades(), userChoice.getGradeAverage()
            );
        }catch (Exception e){
            System.out.println("Sorry, that user does not exist...");
        }

    }
}
