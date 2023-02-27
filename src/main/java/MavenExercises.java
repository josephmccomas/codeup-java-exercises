import org.apache.commons.lang3.StringUtils;
import util.Input;

public class MavenExercises {

    //        Create a new class with a main method that prompts the user for input and does the following (using the StringUtils class)
    public static void main(String[] args) {
        Input input = new Input();
        String userStuff = input.getString("Enter something.");

//        Tells whether or not what the user entered is a number
        System.out.println("What you entered is a number: " + StringUtils.isNumeric(userStuff));

        //        Flips the case of the string
        System.out.println("Flipped case: " + StringUtils.swapCase(userStuff));

        //        Reverses the string
        System.out.println("Reversed: " + StringUtils.reverse(userStuff));
    }
}
