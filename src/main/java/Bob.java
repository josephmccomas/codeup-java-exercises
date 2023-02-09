import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ask Bob a question: ");
        String userResp = input.nextLine();
        if (userResp.endsWith("?")) {
            System.out.println("Bob: 'Sure.'");
        } else if (userResp.endsWith("!")){
            System.out.println("Bob: 'Whoa, chill out!'");
        } else if (userResp.equals("")) {
            System.out.println("Bob: 'Fine, be that way!");
        } else {
            System.out.println("Bob: 'Whatever...'");
        }
        input.nextLine();



        input.close();
    }
}
