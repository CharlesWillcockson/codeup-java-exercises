package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students= new HashMap<>();

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
        System.out.println(student1);
    }

    public static void cmdLine(HashMap<String, Student> students){
        System.out.println("-----Here is a list of the student's GitHub usernames-----");
        for (String ghUsername : students.keySet()){
            System.out.println(ghUsername);
        }

    }
}
