package movies;

import util.Input;

public class MoviesApplication {
    public static Input input = new Input();
    public static void main(String[] args) {
        movieSelection();

    }

    public static void menu() {
        Input input = new Input();
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musicals category");
        System.out.println("");

    }

    private static void movieSelection(){
        int choice = 0;
        boolean cont = true;
        while (cont) {
            menu();
            choice = userChoice();
            switch (choice) {
                case 0:
                    System.out.println("Thank you for stopping by!");
                    break;
                case 1:
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
                    }
                    break;
                case 2:
                    viewByCategory("animated");
                    break;
                case 3:
                    viewByCategory("drama");
                    break;
                case 4:
                    viewByCategory("horror");
                    break;
                case 5:
                    viewByCategory("scifi");
                    break;
                case 6:
                    viewByCategory("musical");
                    break;
            }
        }
    }

    public static void viewByCategory(String category) {
        for (Movie movie : MoviesArray.findAll()){
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getName(), movie.getCategory());
            }
        }

    }

    public static int userChoice() {
        int choice = input.getInt("Bubblegum bubblegum in a dish, which category do you wish?");
        return choice;
    }







}
