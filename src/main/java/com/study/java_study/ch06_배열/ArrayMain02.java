package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        String a = "김준일";
        String b = new String("김준일");

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] namse2 = {"김준일", new String("김준일")};

        System.out.println(names[0] == namse2[0]);
        System.out.println(names[1] == namse2[1]);
        System.out.println(names == namse2);

        System.out.println("=========================");

        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
        System.out.println("a" + "b");
    }
}
