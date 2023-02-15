package movies;

import util.Input;

import java.util.Arrays;

////    Create a class named MoviesApplication that has a main method.
////    Give the user a list of options for viewing all the movies.movies or viewing movies.movies by category.
////    Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
////    If a category is selected, only movies.movies from that category should be displayed.
////    Your application should continue to run until the user chooses to exit.
public class MoviesApplication {
private static Movie [] movies;
private static Input input = new Input();

    public static void main(String[] args) {
        movies = MoviesArray.findAll();
        input = new Input();
            // command loop
            // each iteration:
            // 1. print the menu
            // 2. wait for the user to enter a choice
            // 3. do whatever the choice is
            // until the user enters choice 0
        do{
            // 1. print the menu
            printMenu();

            // 2. wait for the user to enter a choice
            int choice = input.getInt(0, 6, "Enter your choice: ");

            // 3. do whatever the choice is
            doChoice(choice);

            // until the user enters choice 0
            if(choice == 0) {
                break;
            }
        } while(true);
        System.out.println("Bye");

    }

    private static void printMenu() {
        System.out.println("""
                What would you like to do?
                        0 - exit
                        1 - view all movies
                        2 - view movies in the animated category
                        3 - view movies in the drama category
                        4 - view movies in the musical category
                        5 - view movies in the drama category
                        6 - add a new movie
                """);
    }


    private static void doChoice(int choice) {
        switch (choice) {
            case 1 ->
                // call function to view all movies
                    viewAllMovies();
            case 2 -> {
                viewMoviesByCategory("animated");
            }
            case 3 -> {
                viewMoviesByCategory("drama");
            }
            case 4 ->  {
                viewMoviesByCategory("musical");
            }
            case 5 -> {
                viewMoviesByCategory("comedy");
            }
//            case 6 -> {
//                input.getString();
//                addMovie();
//            }
            // ...
        }
    }
    private static void viewAllMovies(){
        System.out.println(Arrays.toString(movies));
    }
    private static void viewMoviesByCategory(String category) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getCategory().equals(category)) {
                System.out.println(movies[i]);
            }
        }
    }

//    public static void addMovie(){
//        String movieName = input.getString("Enter movie name: ");
//        String movieCategory = input.getString("Enter movie category: ");
//        Movie movie = new Movie(movieName, movieCategory);
//        movies = Arrays.copyOf(movies, movies.length +1);
//        movies[movies.length -1] = movie;
//    }
}