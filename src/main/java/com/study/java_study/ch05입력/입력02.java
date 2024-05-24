package com.study.java_study.ch05입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name = null; //next()
        int age = 0;    //nextInt()
        String address = null;  //nextLine()
        String gender = null;   //next()
        String phone = null;    //nextLine()

        /*
        이름: 김준일
        나이: 31
        주소: 부산 동래구 중앙대로
        성별: 남
        연락처: 010-9988-1916
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 >>");
        name = scanner.next();
        System.out.println("나이를 입력하세요 >>");
        age = scanner.nextInt();

        scanner.nextLine(); // int 입력 후 enter의 버퍼가 남기때문에 이것을 없애주기 위한것
        System.out.print("주소를 입력하세요 >>");
        address = scanner.nextLine();
        System.out.print("성별을 입력하세요 >>");
        gender = scanner.next();

        scanner.nextLine();
        System.out.print("연락처를 입력하세요 >>");
        phone = scanner.nextLine();

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("주소: " + address);
        System.out.println("성별: " + gender);
        System.out.println("연락처: " + phone);

    }
}
