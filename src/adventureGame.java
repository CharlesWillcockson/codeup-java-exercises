import java.util.Scanner;

public class adventureGame {
    Scanner sc = new Scanner(System.in);

    String playerName;
    String playerWeapon;
    int playerHP;
    int choice;
    int enemyHP;
    int playerMeleeDmg;
    int playerLevel;

    public static void main(String[] args) {

    }
    public static void characterSetup(){
        System.out.println("What is your name, young one?");
        playerName = sc.nextLine();
        playerHP = 10;
        playerWeapon = "knife";
        playerLevel = 1;
        playerMeleeDmg = 4;
    }
}


