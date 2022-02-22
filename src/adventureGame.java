import java.util.Scanner;

public class adventureGame {
    Scanner sc = new Scanner(System.in);

    String playerName;
    String playerWeapon;
    String cuss1 = "sh#@";
    String cuss2 = "f@%k";
    int playerHP;
    int choice;
    int enemyHP;
    int playerMeleeDmg;
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
        System.out.printf("Rick -- Sometimes I forget how clueless you are Morty.  Java is a language created by a race of %sing tweeked out aliens from the JuanValdezio nebula.  Get in the ship Morty, I am going to show you where Java was created.  You will need to grab a weapon Morty, what will you choose?\n", cuss2);
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
            System.out.printf("Holy %s, what kind of name is %s?  I am still calling you Morty!", cuss1, name);
        }
    }
}


