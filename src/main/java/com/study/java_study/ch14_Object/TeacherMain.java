package com.study.java_study.ch14_Object;

import com.sun.security.jgss.GSSUtil;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("김준일", 31);
        Teacher teacher2 = new Teacher("김준일", 31);
        System.out.println(teacher);

        System.out.println(teacher.hashCode() == teacher2.hashCode());
        System.out.println(teacher.equals(teacher2));
    }
}
