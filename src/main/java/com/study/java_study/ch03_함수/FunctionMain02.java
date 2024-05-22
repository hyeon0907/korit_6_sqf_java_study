package com.study.java_study.ch03_함수;

public class FunctionMain02 {
    public static void main(String[] args) {
        Function02 function02 = new Function02();

        function02.fx01();

        function02.fx02(10, 20);

        System.out.println(function02.빙수만들기("딸기", 10) + "주문 완료");
        String 빙수 = function02.빙수만들기("초코", 5);
        System.out.println(빙수);
    }
}
