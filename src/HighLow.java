public class HighLow {
    public static void main(String[] args) {
//    Generate a random number
        double myNumber = (int) (Math.random() * 100) + 1;
        int totalGuesses = 0;
//    Prompt user to guess a number
        do {
            System.out.print("Guess a number between 1 & 100: ");
//    validate whether user number is within 1 - 100
            int userInput = MethodsExercises.getInteger(1, 100);
//    compare the number to the
            if (userInput > myNumber) {
                System.out.println("Lower");
            } else if (userInput < myNumber) {
                System.out.println("Higher");
            } else {
                System.out.println("Good Guess!");
            }
            totalGuesses++;
            if (totalGuesses > 10){
                break;
            }
        } while (userInput != myNumber);
        System.out.println("Game over");
        System.out.println("You made " + totalGuesses + " guesses.");
    }
}

//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"
//Hints
//
//Use the random method of the java.lang.Math class to generate a random number.
//Bonus
//
//Keep track of how many guesses a user makes.
//Set an upper limit on the number of guesses.