package com.study.java_study.ch09_클래스04.복습;

public class BookMain {
    public static void main(String[] args) {
        BookService bookService = new BookService(); // BookService 받아오기
        System.out.println("프로그램을 실행합니다."); // 프로그램 실행

        while(bookService.run()){} // 반복문 while로 run을 실행시켜 프로그램 반복실행

        System.out.println("프로그램을 종료합니다."); // 프로그램 종료
    }
}
