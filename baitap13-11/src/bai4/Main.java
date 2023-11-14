package bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT");
        Student student3 = new Student("Tung", 28, "HT");
        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        Collections.sort(students);
        for (Student st : students){
            System.out.println(st.toString());
        }
        //so sanh tuoi
        AgeComparator comparator = new AgeComparator();
        Collections.sort(students,comparator);
        System.out.println("so sanh theo tuoi ");
        for (Student s : students){
            System.out.println(s);
        }
    }
}
