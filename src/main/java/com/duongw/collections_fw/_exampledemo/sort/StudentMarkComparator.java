package com.duongw.collections_fw._exampledemo.sort;

import java.util.Comparator;

public class StudentMarkComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.marks, o2.marks);
    }
}
