package com.students;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Use String's compareTo for order comparison
        return s1.getName().compareTo(s2.getName());
    }
}
