import java.util.Scanner;

// Problem A
public class ControlFlowExercise {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
////      Create an integer variable i with a value of 5.
//        int i = 5;
////        Create a while loop that runs so long as i is less than or equal to 15

//        while (i <= 15) {
////         Each loop iteration, output the current value of i, then increment i by one.
//            System.out.println(i++);
//        }
//        input.close();


        // Problem B
        Scanner input = new Scanner(System.in);
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int result = 0;
//        do {
//                result += 2;
//                System.out.println(result);
//
//            } while (result <= 100);

//        Alter your loop to count backwards by 5's from 100 to -10.

//        int result = 100;
//        do {
//            System.out.println(result);
//            result -= 5;
//        } while (result >= -10);

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        2
//        4
//        16
//        256
//        65536
//        int result = 2;
//        do {
//            System.out.println(result);
//            result = (int) Math.pow(result, 2);
//        } while (result < 1000000);

//        Refactor the previous two exercises to use a for loop instead.
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (int j = 2; j < 1000000; j=(int)Math.pow(j, 2)){
//            System.out.println(j);
//
//        }

////        Write a program that prints the numbers from 1 to 100.
////        For multiples of three: print “Fizz” instead of the number.
////        For the multiples of five: print “Buzz”.
////        For numbers which are multiples of both three and five: print “FizzBuzz”.

//        int num = 100;
//        for (int i = 1; i <= 100 ; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

//        System.out.println("Enter an integer: ");
//        int num = input.nextInt();
//        int sq = (num * num);
//        int cu = (num * num * num);
//        input.nextLine();
//        System.out.printf("""
//                Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----%n
//                %-6d | %-7d | %-5d""", num, sq, cu);
//        System.out.println("Would you like to continue? Y/N ");
//        if (!input.equals("Y")){
//            continue;
//        } else {
//            break;
//        }

        input.close();
    }
}



