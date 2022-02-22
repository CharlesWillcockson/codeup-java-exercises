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
        System.out.println("Grandpa Rick, can you help me with my coding homework?");
        System.out.printf("It better not be %sing Java, Morty!\n", cuss2);
        System.out.println("It is....but what's wrong with Java?");
        System.out.printf("Sometimes I forget how clueless you are Morty.  Java is a language created by a race of %sing tweeked out aliens from the JuanValdezio nebula.  Get in the ship Morty, I am going to show you where Java was created.  You will need to grab a weapon Morty, what will you choose?\n", cuss2);
        System.out.println("1 -- laser gun");
        System.out.println("2 -- taxidermied swordfish");
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Good choice, let's get going!");
        }else{
            System.out.printf("Morty, I am going to ask your mom to take a DNA test, anyone this stupid cannot be a grandson of mine.  What the %s are you going to do with a %sing stuffed fish?!?!  You are taking the laser gun!\n", cuss1, cuss2);
        }
    }
}


