import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %f.", pi);


//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String userName = input.nextLine();
//        System.out.println("Your name is: " + userName);
//            input.nextLine();
//
//        System.out.print("Enter three words: ");
//        String word1 = input.next();
//        String word2 = input.next();
//        String word3 = input.next();
//        System.out.printf("%s%n%s%n%s%n", word1, word2, word3);
//            input.nextLine();
//
//        System.out.print("Enter a sentence: ");
//        String userSentence = input.nextLine();
//        System.out.println("Your sentence is: " + userSentence);
//            input.nextLine();
//
//
//        input.close();

//        --------------------------------------------------------
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the room's length: ");
//        int length = Integer.parseInt(str);
//        input.nextLine();
//
//        System.out.print("Enter the room's width: ");
//        int width = Integer.parseInt(str);
//        input.nextLine();
//
//        System.out.println("The area of the room is: " + (length * width) + "sq/ft, and the perimeter is: " + ((length * 2) + (width * 2)) + "li/ft");
//
//
//
//        input.close();

//        --------------------------------------------------------

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the room's length: ");
        double length = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the room's width: ");
        double width = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the room's height: ");
        double height = input.nextDouble();
        input.nextLine();

        System.out.println("The area of the room is: " + (length * width) + " sq/ft, the perimeter is: " + ((length * 2) + (width * 2)) + " li/ft, and the volume is: " + (length * width * height) + " cu/ft.");

        input.close();

    }
}
