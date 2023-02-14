package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;
// SCANNER CONSTRUCTOR
    public Input() {
        sc = new Scanner(System.in);
    }
// END CONSTRUCTOR

    public String getString(){
        return sc.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }
    public boolean yesNo(){
        String response = getString();
        if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("n")){
            return true;
        }
        return false;
    }
    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }
    public int getInt(){
    return sc.nextInt();
    }
    public int getInt(int min, int max){
        System.out.printf("Enter a number between $d and %d%n", min, max);
        int anInt = getInt();
        if (anInt < min || anInt > max){
            System.out.printf("That was not between %d and %d%n!!", min, max);
            return getInt(min, max);
        }
        return anInt;
    }
    public int getDouble(){
        return sc.nextInt();
    }
    public int getDouble(int min, int max){
        System.out.printf("Enter a number between $f and %f%n", min, max);
        int aDouble = getDouble();
        if (aDouble < min || aDouble > max){
            System.out.printf("That was not between %f and %f%n!!", min, max);
            return getDouble(min, max);
        }
        return aDouble;
    }

    public static void main(String[] args) {
        Input myInput = new Input();
        System.out.println(myInput.getString());

        int x = myInput.getInt(5, 10);
        System.out.println(x);

        int y = myInput.getDouble(5, 10);
        System.out.println(y);

        myInput.getString();

        myInput.yesNo("Continue Y/N? ");
        System.out.print("Sike!!");
    }
} // END CLASS