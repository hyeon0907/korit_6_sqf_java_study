package com.study.java_study.ch02_클래스01;

public class StudntMain {
    public static void main(String[] args) {
        String name = " 손경태";
        int age = 29;
        String name2 = "신선애";
        int age2 = 25;

        Student std1 = new Student();
        Student std2 = new Student();

        std1.name = "손경태";
        std1.age = 29;

        std1.name = "신선애";
        std1.age = 25;
    }
}
