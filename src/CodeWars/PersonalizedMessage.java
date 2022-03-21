//Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
//
//        Use conditionals to return the proper message:
//
//        case	return
//        name equals owner	'Hello boss'
//        otherwise	'Hello guest'


package CodeWars;

public class PersonalizedMessage {

    public static String greet(String name, String owner){
        if (name == owner){
            return "Hello boss";
        }else{
            return "Hello guest";
        }
    }

    public static void main(String[] args) {
        System.out.println("greet(\"Bob\", \"Bob\") = " + greet("Eva", "Eva"));
        System.out.println("greet(\"Bob\", \"John\") = " + greet("Bob", "John"));
    }
}
