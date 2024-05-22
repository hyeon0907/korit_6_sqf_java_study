package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();
        Student st = new Student();

        st.studentCode = 1234;
        st.age = 31;
        st.name = "김준일";
        st.phone = "01099881916";

        //fx.fx01(1234, "김준일", 31, "01099881916");
        fx.fx02(st);

        /*
        fx.fx01(1234, "김준일", 31, "01099881916");
        fx.fx02();

    */
    }
}
