package com.study.java_study.ch18_빌더;

public class Student {
    private int studentCode;
    private String name;
    private int age;

    public Student(int studentCode, String name, int age) {
        this.studentCode = studentCode;
        this.age = age;
        this.name = name;
    }

    private static StudentBuilder builder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private int age;

        public Student build(){
            return new Student(studentCode, name, age);
        }

        public StudentBuilder studentCode(int studentCode){
            this.studentCode = studentCode;
            return this;
        }
        public StudentBuilder age(int age){
            this.age = age;
            return this;
        }
        public StudentBuilder name(String name){
            this.name = name;
            return this;
        }
    }
}
