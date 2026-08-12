package com.scaler.collections;

import java.util.Comparator;

public class PSPComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // o1(first), o2(second)
        return (int)(o1.psp - o2.psp);
    }
}
