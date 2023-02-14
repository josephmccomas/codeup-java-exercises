package movies;

import util.Input;

import java.util.Scanner;

////    Create a class named MoviesApplication that has a main method.
////    Give the user a list of options for viewing all the movies.movies or viewing movies.movies by category.
////    Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
////    If a category is selected, only movies.movies from that category should be displayed.
////    Your application should continue to run until the user chooses to exit.
public class MoviesApplication {

    public static Scanner response = new Scanner(System.in);
    public static void main(String[] args) {
        Input input = new Input();
            // command loop
            // each iteration:
            // 1. print the menu
            // 2. wait for the user to enter a choice
            // 3. do whatever the choice is
            // until the user enters choice 0
        System.out.println("See all movies, or sort by category? (M/C)");
        String response = input.getString();
        do{
            if (response.equalsIgnoreCase("M")) {
                System.out.println(Movie.name);
            } else System.out.println(Movie.category);
        } while(true);
            // 1. print the menu
            printMenu();

            // 2. wait for the user to enter a choice
            int choice = input.getInt(0, 5, "Enter your choice: ");

            // 3. do whatever the choice is
            doChoice(choice);

            // until the user enters choice 0
            if(choice == 0) {
                break;
            }
        }

        System.out.println("Bye");

    }

    private static void printMenu() {
        System.out.println("Menu goes here");
    }

    private static void doChoice(int choice) {
        switch(choice) {
            case 1:
                // call function to view all movies
                break;
            // ...
        }
    }

}