package bai2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 20, "HN");
        Student student3 = new Student("Ha", 20, "HN");

        Map<Integer, Student> stundentMap = new HashMap<>();
        stundentMap.put(1, student1);
        stundentMap.put(2, student2);
        stundentMap.put(3, student3);
        stundentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student : stundentMap.entrySet()) {
            System.out.println(student.toString());
        }


        System.out.println("--------------------Set");

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);

        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
