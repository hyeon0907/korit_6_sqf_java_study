package com.study.java_study.ch15_Static;

/*
    싱글톤 디자인 페턴
    1.객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성 할 수 없다.
 */

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menus = {"1", "2", "3", "4", "q"};
        boolean aaa = true;
        String selectedMenu = null;

        while(aaa == true){
            System.out.print("메뉴 선택:");
            selectedMenu = scanner.nextLine();
            for(String name : menus){
                if(name == selectedMenu ){
                    System.out.println(selectedMenu);
                    aaa = false;
                    break;
                }
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요");
        }
//        StudentService studentService = StudentService.getInstance();
//        StudentService studentService2 = StudentService.getInstance();
//
//        studentService.addStudent();
//        StudentRepository.getInstance().add("김준이");
//        studentService2.addStudent();
//
//        studentService.getStudentData();

    }
}
