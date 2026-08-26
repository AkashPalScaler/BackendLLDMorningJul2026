package com.scaler.DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
//        StudentBuilder studentBuilder = new StudentBuilder();
//        studentBuilder.setAge(20);
//        studentBuilder.setName("Sam");
//        studentBuilder.setEmail("sam@gmail.com");
//        studentBuilder.setPassword("12345");
//
//        Student s = new Student(studentBuilder);

        // Responsibility of providing the builder object goes to Student itself
//        StudentBuilder sb = Student.getBuilder();
//        sb.setAge(20);
//        sb.setName("Sam");
//        sb.setEmail("sam@gmail.com");
//        sb.setPassword("12345");
//
//        Student s = new Student(sb);

        // Function chaining helps us to set properties in a neat and readable manner (syntactical sugar)
//        StudentBuilder sb = Student.getBuilder()
//                .setAge(20)
//                .setName("Akash")
//                .setEmail("akash@gmail.com")
//                .setPsp(50.0f);
//
//        Student s = new Student(sb);


        Student s = Student.getBuilder()
                .setAge(20)
                .setName("Akash")
                .setEmail("akash@gmail.com")
                .setPsp(50.0f)
                .build();


    }
}

// Give a prompt to create a builder
