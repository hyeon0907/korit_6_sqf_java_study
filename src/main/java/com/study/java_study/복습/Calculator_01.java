package com.study.java_study.복습;
import java.util.Scanner;

// if문만 사용해서 계산기 만들기
public class Calculator_01 {
    public static void main(String[] args) {
        Item system = new Item();
        Scanner scanner = new Scanner(System.in);
        String operator = null;


        System.out.print("입력: ");
        operator = scanner.nextLine();
        if(operator.equals("+")) System.out.println("출력: " + operator);

        system.pause();

        System.out.print("입력: ");
        operator = scanner.nextLine();
        System.out.println("출력: " + operator);
    }
}


