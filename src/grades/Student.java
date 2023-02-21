package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private static String[] name;
    private ArrayList<Integer> grades = new ArrayList<>();

    private static int avjGrade = 0;
    static int sumGrade = 0;


    public Student(String[] name) {
        Student.name = name;
    }

    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public static void main(String[] args) {


        name = new String[]{"John", "Tim", "Steve"};
        System.out.println(Arrays.toString(name));

        ArrayList<Integer> grades = new ArrayList<>();
//        Arrays.asList(88, 82, 91);
        grades.add(88);
        grades.add(82);
        grades.add(91);
        System.out.println(grades);

        for (int i = 0; i < grades.size(); i++) {
            sumGrade += grades.get(i);
            sumGrade++;
            avjGrade = sumGrade / grades.size();
        }
        System.out.println(avjGrade);

    }

}
