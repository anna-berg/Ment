package com.berg.homework512.streamHomework;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFulName().compareTo(o2.getFulName());
    }
}
