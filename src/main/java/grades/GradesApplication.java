package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("John", "BigJohn");
//        students.add("Grade", "70");
//        students.add("Grade", "80");
//        students.add("Grade", "90");

        students.put("Tim", "Timbo");
//        johnArr.add("Grade", "70");
//        johnArr.add("Grade", "80");
//        johnArr.add("Grade", "90");

        students.put("Steve", "Stevealicious");
//        johnArr.add("Grade", "70");
//        johnArr.add("Grade", "80");
//        johnArr.add("Grade", "90");

        students.put("Brian", "BoringBrian");
//        johnArr.add("Grade", "70");
//        johnArr.add("Grade", "80");
//        johnArr.add("Grade", "90");

        System.out.println(students);

    }
}
// Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
// It should have keys that are strings that represent github usernames, and values that are Student objects.
// Create at least 4 Student objects with at least 3 grades each, and add them to the map.