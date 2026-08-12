package com.scaler.collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
//        List<Integer> arlist = new ArrayList<>();
//        List<Integer> arlist2 = new LinkedList<>();
//        List<Integer> arlist3 = new Vector<>();
//        List<Integer> arlist4 = new Stack<>();
//        Queue<Integer> arlist5 = new PriorityQueue<>();
//        Queue<Integer> arlist6 = new ArrayDeque<>();
//
//        Set<Integer> arlist7 = new HashSet<>();
//        Map<Integer, Integer> arlist8 = new HashMap<>();
//
//        //Set
//        //It allows no duplicate items
//        // HashSet, LinkedHashSet, TreeSet
//
//        //HashSet - Unordered - Random order
//        Set<Integer> hset = new HashSet<>();
//        hset.add(41);
//        hset.add(8);
//        hset.add(63);
//        hset.add(31);
//        hset.add(21);
//        hset.add(7);
//
//        System.out.println(hset);
//
//        // LinkedHashSet -> Linked + Hashmap -> Insertion order
//        Set<Integer> lset = new LinkedHashSet<>();
//        lset.add(41);
//        lset.add(8);
//        lset.add(63);
//        lset.add(31);
//        lset.add(21);
//        lset.add(7);
//
//        System.out.println(lset);
//
//        // Treeset - Natural order - RnB Trees
//        Set<Integer> tset = new TreeSet<>(); //Collections.reverseOrder for reverse natural order
//        tset.add(41);
//        tset.add(8);
//        tset.add(63);
//        tset.add(31);
//        tset.add(21);
//        tset.add(7);
//
//        System.out.println(tset);

        //Comparable vs comparator
        List<Integer> arrlist = new ArrayList<>();
        arrlist.add(41);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(7);
        Collections.sort(arrlist);
        System.out.println(arrlist);

        List<Student>  studentlist = new ArrayList<>();
        studentlist.add(new Student("Akash", 30, 10.9f));
        studentlist.add(new Student("Sumit", 27, 17.9f));
        studentlist.add(new Student("Nagnath", 32, 9.5f));
        studentlist.add(new Student("Ashish", 35, 12.9f));
//        Student s1 = (Student) studentlist.get(0);
//        Student s2 = (Student) studentlist.get(1);
//        s1.compareTo(s2);

        Collections.sort(studentlist);
        for(Student student : studentlist){
            System.out.println("Name : "+ student.name + " Age: "+ student.age + " PSP: "+student.psp);
        }

        Collections.sort(studentlist, new PSPComparator());
        for(Student student : studentlist){
            System.out.println("Name : "+ student.name + " Age: "+ student.age + " PSP: "+student.psp);
        }

    }
}
