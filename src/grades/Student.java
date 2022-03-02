package grades;
import java.util.ArrayList;

public class Student {
    public String name;
    public ArrayList<Integer> grades;

    public String getName(){
        return name;
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
}
