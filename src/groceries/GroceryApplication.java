package groceries;

import util.Input;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class GroceryApplication {
    private ArrayList<String> keys;
    private HashMap<String, ArrayList<String>> itemlist;
    private HashMap<String, Integer> quantityList;

    public GroceryApplication() {
        itemlist = new HashMap<String, ArrayList<String>>();
        quantityList = new HashMap<String, Integer>();
    }

    public void SortList() {
        keys = new ArrayList<String>(this.itemlist.keySet());
        Collections.sort(keys);
        for(String key: this.itemlist.keySet()) {
            Collections.sort(this.itemlist.get(key));
        }
    }

    public static void main(String [] args) {

        GroceryApplication grocery = new GroceryApplication();

        Input input = new Input();
        String choice;

        choice = input.getString("Would you like to create a grocery list? Y/N ");
        System.out.println();
        if(choice.contains("Y")) {
            do{
                choice = input.getString("Would you like to enter a new item? Y/N");
                System.out.println();
                if(choice.contains("Y")) {

                    System.out.printf("Please select a category: \n" +
                            "\n" +
                            "0. Exit\n" +
                            "1. Dairy\n" +
                            "2. Meat\n" +
                            "3. Fruit\n" +
                            "4. Vegetable\n" +
                            "5. Canned goods\n" +
                            "6. Other\n");
                    choice = input.getString("Enter your choice: ");

                    String category = null;
                    switch(choice) {
                        case "0":
                            System.out.println("Thank you for using Charles' super grocery app, voted (by my mom) the best grocery app in the world!"); break;
                        case "1": category = "Dairy"; break;
                        case "2": category = "Meat"; break;
                        case "3": category = "Fruit"; break;
                        case "4": category = "Vegetable"; break;
                        case "5": category = "Canned goods"; break;
                        case "6": category = "Other"; break;
                        default: System.out.print("That was not a option, dummy.\n"); continue;
                    }

                    String name = input.getString("Enter the name of the item: ");
                    int quantity = input.getInt("Enter how many of the item: ");

                    grocery.itemlist.putIfAbsent(category, new ArrayList<String>());
                    grocery.itemlist.get(category).add(name);
                    grocery.quantityList.put(name, quantity);

                    System.out.println();
                } else { System.out.print("You have decided not to enter an item.\n"); break; }
            }while(true);
        } else { System.out.print("Please type Y next time, like the prompt said.\n"); }
        System.out.print("Thank you for using the app.\n\n");

        grocery.SortList();

        if(!grocery.itemlist.isEmpty()) {
            for (String key : grocery.keys) {
                for(String item: grocery.itemlist.get(key)) {
                    System.out.printf("Category: %s, Name: %s, Quantity: %d%n",
                            key, item, grocery.quantityList.get(item));
                }
            }
        } else {
            System.out.print("Your grocery list is empty. Exiting Application.");
        }
    }
//    public static Input input = new Input();
//    public static String[] category = {"Dairy", "Meats", "Fruits", "Vegetables", "Hygiene", "Snacks", "Other"};
//    public static HashMap<String, Integer> item = new HashMap<>();
//
//
//   public static void groceryListApp(){
//
//
//       System.out.println("Would you like to create a grocery list?");
//       boolean choice = input.yesNo();
//       if (choice) {
//           System.out.println("Would you like to enter an item?");
//           boolean cont = input.yesNo();
//           while (cont) {
//               System.out.println("----- Categories -----\n" +
//                       "\n" +
//                       "0. Exit program\n" +
//                       "1. Dairy\n" +
//                       "2. Meats\n" +
//                       "3. Fruits\n" +
//                       "4. Vegetables\n" +
//                       "5. Hygiene\n" +
//                       "6. Snacks\n" +
//                       "7. Other\n");
//               System.out.println();
//               System.out.println("Which category would you like to add an item to? [0-7]");
//               int selectedCategory = input.getInt();
//
//               String category;
//               switch (selectedCategory){
//                   case 0:
//                    cont = false;
//                       System.out.println("Thank you for using Charles' super grocery app, voted (by my mom) the best grocery app in the world!");
//                       break;
//                   case 1:
//                       category =  "Dairy";
//                       break;
//                   case 2:
//                       category = "Meats";
//                       break;
//                   case 3:
//                       category ="Fruits";
//                       break;
//                   case 4:
//                       category ="Vegetables";
//                       break;
//                   case 5:
//                       category ="Hygiene";
//                       break;
//                   case 6:
//                       category= "Snacks";
//                       break;
//                   case 7:
//                       category = "Other";
//                       break;
//                   default:
//                       System.out.println("Please select a real category, dummy!");
//
//               }
//
//               String name = input.getString("Enter the item you wish to add: ");
//               int quantity = input.getInt("Enter how many you want to get: ");
//
//               System.out.println();
//               System.out.println("Would you like to add another item?");
//               boolean addMore = input.yesNo();
//           }
//       }
//   }
//
//    public static void main(String[] args) {
//        groceryListApp();
//    }
}
