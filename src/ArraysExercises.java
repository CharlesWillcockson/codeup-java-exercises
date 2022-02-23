import util.Input;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person person1 = new Person("Charles");
        Person person2 = new Person("Nelson");
        Person person3 = new Person("Andrew");
        Person[] personas = {person1, person2, person3};
        for (int i = 0; i < personas.length; i++){
            System.out.println(personas[i].getName());
        }
        Person person4 = new Person("Gerald");
        personas = addPerson(personas, person4);
        for (int i = 0; i < personas.length; i++){
            System.out.println(personas[i].getName());
        }
    }

    public static Person[] addPerson(Person[] personas, Person person) {
        Person[] personas2 = new Person[personas.length + 1];
        for (int i = 0; i < personas.length; i++){
            personas2[i] = personas[i];
        }
        personas2[personas2.length -1] = person;
        return personas2;
    }
}
