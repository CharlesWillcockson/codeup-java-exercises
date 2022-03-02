package grades;
import java.util.ArrayList;

public class Student {
    public String name;
    public ArrayList<Integer> grades;

    public String getName(){
        return name;
    }

    public Student (String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double average = 0.0;
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        average = (double) sum / grades.size();
        return average;
    }

//    public static void main(String[] args) {
//        Student student1 = new Student("Charles");
//        Student student2 = new Student("Joey");
//        Student student3 = new Student("Bilbo");
//        student3.addGrade(91);
//        student3.addGrade(90);
//        student3.addGrade(99);
//        System.out.println(student3.grades);
//        System.out.println(student3.getName());
//        System.out.println(student3.getGradeAverage());
//    }
}
