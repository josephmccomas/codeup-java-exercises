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
//            } while (result < 100);

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

        for (int j = 2; j < 1000000; j=(int)Math.pow(j, 2)){
            System.out.println(j);

        }
        
        
        input.close();
    }
}


