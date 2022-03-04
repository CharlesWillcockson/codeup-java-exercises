import util.Input;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class GroceryApplication {
    static Input input = new Input();
    private ArrayList<String> categories;
    private HashMap<String, >


   public static void groceryListApp(){


       System.out.println("Would you like to create a grocery list?");
       boolean choice = input.yesNo();
       if (choice) {
           System.out.println("Would you like to enter an item?");
           boolean cont = input.yesNo();
           while (cont) {
               System.out.println("----- Categories -----\n" +
                       "\n" +
                       "0. Exit program\n" +
                       "1. Dairy\n" +
                       "2. Meats\n" +
                       "3. Fruits\n" +
                       "4. Vegetables\n" +
                       "5. Hygiene\n" +
                       "6. Snacks\n" +
                       "7. Other\n");
               System.out.println();
               System.out.println("Which category would you like to add an item to? [0-7]");
               int selectedCategory = input.getInt();

               String category;
               switch (selectedCategory){
                   case 0:
                    cont = false;
                       System.out.println("Thank you for using Charles' super grocery app, voted (by my mom) the best grocery app in the world!");
                       break;
                   case 1:
                       category = "Dairy";
                       break;
                   case 2:
                       category = "Meats";
                       break;
                   case 3:
                       category = "Fruits";
                       break;
                   case 4:
                       category = "Vegetables";
                       break;
                   case 5:
                       category = "Hygiene";
                       break;
                   case 6:
                       category = "Snacks";
                   case 7:
                       category = "Other";
                   default:
                       System.out.println("Please select a real category, dummy!");

               }

               String name = input.getString("Enter the item you wish to add: ");
               int quantity = input.getInt("Enter how many you want to get: ");

               System.out.println();
               System.out.println("Would you like to add another item?");
               boolean addMore = input.yesNo();
           }
       }
   }

    public static void main(String[] args) {
        groceryListApp();
    }
}
