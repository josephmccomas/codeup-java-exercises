import java.util.Scanner;

import static java.lang.Integer.getInteger;

public class MethodsExercises {

        public static void main(String[] args) {

            addMath(3, 7);
            subtMath(10, 5);
            multMath(4, 8);
            divMath(30, 5);
//            modMath(10, 2);
//            int getRange = range(3, 40);
//            System.out.println(getRange);
            factorial(int num);
        }

// #1 Create four separate methods. Each will perform an arithmetic operation:
//
//    Addition

        public static void addMath(int a, int b) {
            System.out.println(a * b);
        }

//    Subtraction

        public static void subtMath(int a, int b) {
            System.out.println(a - b);
        }

//    Multiplication

        public static void multMath(int a, int b) {
            System.out.println(a * b);
        }

//    Division

        public static void divMath(int a, int b) {
            System.out.println(b / a);
        }

//    Each function needs to take two parameters/arguments so that the operation can be performed.
//    Test your methods and verify the output.

//    Add a modulus method that finds the modulus of two numbers.
//private static Scanner input = new Scanner(System.in) {
//
//
//    public static void modMath(int a, int b) {
//        System.out.println(b % a);
//    }
//
//    // #2 Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//    public static int range(int min, int max) {
//        System.out.print("Enter a number: ");
//        int userEntry = input.nextInt();
//        if (userEntry < min || userEntry > max) {
//            System.out.println("Too low or high");
//            return range(min, max);
//        }
//        return userEntry;
//    }
//}
//      The method signature should look like this:
//          public static int getInteger(int min, int max);

//      and is used like this:
//          System.out.print("Enter a number between 1 and 10: ");
//          int userInput = getInteger(1, 10);

//      If the input is invalid, prompt the user again.
//      Hint: recursion might be helpful here!

// #3 Calculate the factorial of a number.
//
//      Prompt the user to enter an integer from 1 to 10.
//      Display the factorial of the number entered by the user.
//      Ask if the user wants to continue.
//      Use a for loop to calculate the factorial.
//      Assume that the user will enter an integer, but verify it’s between 1 and 10.
//      Use the long type to store the factorial.
//      Continue only if the user agrees to.

//      A factorial is a number multiplied by each of the numbers before it.
//      Factorials are denoted by the exclamation point (n!). Ex:
//          1! = 1               = 1
//          2! = 1 x 2           = 2
//          3! = 1 x 2 x 3       = 6
//          4! = 1 x 2 x 3 x 4   = 24
    private static Scanner factScanner = new Scanner(System.in){
    public static int factorial(int num){
        System.out.print("Enter a number between 1 and 10: ");
        long factNum = 1;
        if (factNum >= 1 && factNum <=10) {
            for(int i = 1; i <= num; i++){
                factNum *= i;
            }
        } else {
            System.out.println("Enter a number between 1 and 10: ");
        }
        return factorial();
    }
    };
}
