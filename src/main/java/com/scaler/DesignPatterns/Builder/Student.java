package com.scaler.DesignPatterns.Builder;

public class Student {
    String name;
    int age;
    String email;
    String password;
    String batch;
    float psp;
    int gradYear;
    // Batch batch;

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    public Student(StudentBuilder builder) {
        if(builder.getName() == null){
            throw new IllegalArgumentException("Student name cannot be null");
        }
        this.name = builder.name;
        if(builder.getAge() < 18){
            throw  new IllegalArgumentException("Student age cannot be less than 18");
        }
        this.age = builder.age;
        if(builder.getEmail() == null){
            throw new IllegalArgumentException("Student email cannot be null");
        }
        // Rest of the validations are homework
        this.email = builder.email;
        this.password = builder.password;
        this.batch = builder.batch;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
//        this.batch = builder.batch; // Shallow copy
    }

    // Inner class - Only to be used by Student
    public static class StudentBuilder {
        String name;
        int age;
        String email;
        String password;
        String batch;
        float psp;
        int gradYear;

        private StudentBuilder(){}

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public StudentBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public float getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(float psp) {
            this.psp = psp;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build(){
            // Validations can be done here - before calling student constructor
            if(this.getEmail() == null){
                throw new IllegalArgumentException("Student email is null");
            }
            return new Student(this);
        }
    }
}
