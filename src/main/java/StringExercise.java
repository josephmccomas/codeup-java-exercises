import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String weEd = "We don't need no education\n" +
                "We don't need no thought control\n";
        System.out.println(weEd);
        String check = "Check \"this\" out!, \"s inside of \"s!\n";
        System.out.println(check);
        String winDrive = "In windows, the main drive is usually C:\\";
        System.out.println(winDrive);
        String slashesLineOne = "I can do backslashes \\, double backslashes \\\\,";
        System.out.println(slashesLineOne);
        String slashesLineTwo = "and the amazing triple backslash \\\\\\!";
        System.out.println(slashesLineTwo);

        String test = """
                We don't need no education
                We don't need no thought control
                """;
        System.out.println(test);
        input.close();
    }
}
