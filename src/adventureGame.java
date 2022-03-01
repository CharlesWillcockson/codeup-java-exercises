import java.util.Scanner;

public class adventureGame {
    Scanner sc = new Scanner(System.in);

    String playerName = "Morty";
    String playerWeapon = "laser gun";
    String cuss1 = "sh#@";
    String cuss2 = "f@%k";
    int playerHP = 0;
    int enemyHP = 0;
    int playerWeaponDmg;
    int playerLevel;

    public static void main(String[] args) {
        
        adventureGame rickAndMorty;
        rickAndMorty = new adventureGame();
        rickAndMorty.breakfastTable();
    }
//    public void characterSetup(){
//        System.out.println("What is your name, young one?");
//        playerName = sc.nextLine();
//        playerHP = 10;
//        playerWeapon = "knife";
//        playerLevel = 1;
//        playerMeleeDmg = 4;
//    }

    public void breakfastTable() {
        System.out.println("Morty -- Grandpa Rick, can you help me with my coding homework?");
        System.out.printf("Rick -- It better not be %sing Java, Morty!\n", cuss2);
        System.out.println("Morty -- It is....but what's wrong with Java?");
        System.out.printf("Rick -- Sometimes I forget how clueless you are Morty.  Java is a language created by a race of %sing tweeked out aliens from the Folgerio nebula.  Get in the ship Morty, I am going to show you where Java was created.  You will need to grab a weapon Morty, what will you choose?\n", cuss2);
        System.out.println("1 -- laser gun");
        System.out.println("2 -- taxidermied swordfish");
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Rick -- Good choice, let's get going!");
        }else{
            System.out.printf("Rick -- Morty, I am going to ask your mom to take a DNA test, anyone this stupid cannot be a grandson of mine.  What the %s are you going to do with a %sing stuffed fish?!?!  You are taking the laser gun!\n", cuss1, cuss2);
        }
        System.out.println("Morty -- Ok, I'm ready Grandpa Rick, but my assignment says you need to ask my name so I can set it to a variable with the scanner.");
        System.out.printf("Rick -- Seriously Morty?  I know your %sing name is Morty and I am not going to call you Bob or Joey or whatever the idiot at the keyboard types in.  But fine, ask the user to enter a name, and I will ignore it and call you Morty or dip%s!\n", cuss2, cuss1);
        System.out.println("Morty -- Please enter your name... ");
        String name = sc.next();
        if (name == "Morty") {
            System.out.println("Good, this user is not a complete idiot!");
        }else{
            System.out.printf("Holy %s, what kind of name is %s?  I am still calling you Morty!  Let's go!", cuss1, name);
        }
//        do {
            System.out.println();
            System.out.println();
            System.out.println("Rick -- Look Morty, there it is...see the planet where the oceans look like diarrhea...or as the Javatonians like to say the oceans look like a cafe latte?");
            System.out.printf("Morty -- I see it Grandpa Rick, it definitely looks more like watery %s than coffee!\n", cuss1);
            System.out.println();
            System.out.println("Rick -- Look Morty, there it is...see the planet where the oceans look like diarrhea...or as the Javatonians like to say the oceans look like a cafe latte?");
            System.out.printf("Morty -- I see it Grandpa Rick, it definitely looks more like watery %s than coffee!\n", cuss1);
            System.out.printf("Rick -- Holy %s Morty, these %sing Javatonians are already trying to trap us in a do while loop!  We have to figure out what the while is Morty, so we can stop doing it and break this %sing loop!", cuss1, cuss2, cuss2);
//        }
    }
}


//When they get to the planet where Java was invented (Planet CodeUp?), they get stuck in a do while loop and have to fight syntax (sin tacks) errors to survive and eventually break the loop and get back to Earth.
//They have to figure out what the while is in the do while loop...and stop f#$Cing doing it!
//Attacks deal random number between 1 and 5 HP damage when landed.
