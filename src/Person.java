import java.util.Scanner;

class Person {
    private String name;
    public String getName(){
//TODO: return the person's name
        return this.name;
    }
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello %s!", this.name);
    }
    public Person (String name){

    }

    public static void main(String[] args) {

    }
}

