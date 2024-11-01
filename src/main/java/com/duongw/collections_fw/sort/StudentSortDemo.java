package com.duongw.collections_fw.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 167, 97));
        students.add(new Student("Smith", 168, 92));
        students.add(new Student("Will", 169, 92));
        students.add(new Student("Madan", 170, 99));
        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);

        var students1 = new ArrayList<Student>();
        students1.add(new Student("John", 167, 97));
        students1.add(new Student("Smith", 168, 92));
        students1.add(new Student("Will", 169, 92));
        students1.add(new Student("Madan", 170, 99));
        Collections.sort(students1,new StudentMarkComparator());
        // students1.sort(new StudentComparator());
        System.out.println(students1);
    }
}
