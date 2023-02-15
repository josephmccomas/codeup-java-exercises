import java.util.Random;

public class ServerNameGenerator {

    private static String [] adjectives = {"heavy", "light", "dark", "bright", "warm", "cold", "young", "old", "worn", "tight"};
    private static String [] nouns = {"mother", "father", "sister", "brother", "dog", "cat", "rat", "bird", "bill", "girl"};


    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//Create a method that will return a random element from an array of strings.
//Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    public static String getRandAdj() {
        int rnd = new Random().nextInt(adjectives.length);
        String aResult = adjectives[rnd];
        return aResult;
    }
    public static String getRandNoun() {
        int rnd = new Random().nextInt(nouns.length);
        String nResult = nouns[rnd];
        return nResult;
    }

    public static void main(String[] args) {
        String rando1 = getRandAdj();
        String rando2 = getRandNoun();
        System.out.printf("Here is your server name: " + rando1 + "-" + rando2);
    }

//Example Output:
//Here is your server name:
//dedicated-photon


} // END CLASS