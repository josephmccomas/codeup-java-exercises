import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %f.", pi);


        Scanner input = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String userName = input.nextLine();
//        System.out.println("Your name is: " + userName);
//            input.nextLine();

        System.out.print("Enter three words: ");
        String threeWords = input.nextLine();
        System.out.println("Your three words are: " + threeWords);
            input.nextLine();


        input.close();
    }
}
