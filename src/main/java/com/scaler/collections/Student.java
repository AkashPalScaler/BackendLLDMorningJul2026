package com.scaler.collections;

public class Student implements Comparable<Student> {
    String name;
    Integer age;
    Float psp;

    public Student(String name, Integer age, Float psp) {
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    // Increasing order (Ascending order)
    @Override
    public int compareTo(Student o) {
        // this(first), o(second)
        // +ve, -ve, 0
//        if(this.age < o.age) return -5; // this.age-o.age
//        else if(this.age > o.age) return 10;
//        return 0;
        return this.age - o.age;
    }
}
