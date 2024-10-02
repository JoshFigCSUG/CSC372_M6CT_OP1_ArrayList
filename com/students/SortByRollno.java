package com.students;

import java.util.Comparator;

public class SortByRollno implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Use Integer.compare for order comparison
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}