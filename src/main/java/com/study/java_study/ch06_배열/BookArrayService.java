package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookArrayUtils bookArrayUtils = new BookArrayUtils();

        boolean isRun = true;
        String books[] = new String[0];
        while(isRun){
            System.out.println("[메뉴 선택]");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 조회");
            System.out.println("5. 전체 도서목록");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");
            String num = scanner.nextLine();

            String NewBooks[] = null;
            int FindIndex = -1;
            String bookNames = null;

            switch (num){
                case "1":
                    System.out.println("[도서 등록]");
                    String namePlus = null;
                    System.out.print("등록할 도서: ");
                    namePlus = scanner.nextLine();
                    NewBooks = new String[books.length + 1];

                    FindIndex = bookArrayUtils.findIndexBybook(books, namePlus);
                    if(FindIndex > -1){
                        System.out.println("해당 도서는 이미 존재합니다.");
                        break;
                    }
                    for(int i = 0; i < books.length; i++){
                        NewBooks[i] = books[i];
                    }
                    NewBooks[NewBooks.length - 1] = namePlus;
                    System.out.println(namePlus + "(를)을 등록완료하였습니다.");
                    books = NewBooks;
                    break;
                case "2":
                    System.out.println("[도서 수정]");
                    System.out.print("수정할 도서: ");

                    String modifyName = scanner.nextLine();
                    FindIndex = bookArrayUtils.findIndexBybook(books, modifyName);

                    if(FindIndex == -1){
                        System.out.println("해당 도서는 존재하지 않습니다.");
                        break;
                    }

                    System.out.print("새 이름: ");
                    String newbook = scanner.nextLine();
                    System.out.println(books[FindIndex] + "를 " + newbook + "(으)로 수정하였습니다.");
                    books[FindIndex] = newbook;
                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제할 도서 이름: ");
                    String removeName = scanner.nextLine();

                    FindIndex = bookArrayUtils.findIndexBybook(books, removeName);
                    if(FindIndex == -1){
                        System.out.println("해당 도서는 존재하지 않습니다.");
                        break;
                    }
                    NewBooks = new String[books.length - 1];
                    for(int i = 0; i < NewBooks.length; i++){
                        if(i < FindIndex){
                            NewBooks[i] = books[i];
                            continue;
                        }
                        NewBooks[i] = books[i + 1];
                    }
                    System.out.println(removeName + "을(를) 삭제하였습니다.");
                    books = NewBooks;
                    break;
                case "4":
                    System.out.println("[도서 조회]");
                    System.out.print("조회할 도서명: ");
                    String findName = scanner.nextLine();

                    FindIndex = bookArrayUtils.findIndexBybook(books, findName);
                    if(FindIndex == -1){
                        System.out.println("해당 도서는 존재하지 않습니다.");
                        break;
                    }
                    System.out.println(findName + "도서는 index[" + FindIndex + "]에 있습니다. ");
                    break;
                case "5":
                    System.out.println("[전체 도서목록]");

                    for (int i = 0; i < books.length; i++){
                        System.out.println("index[" + i + "]" + books[i]);
                    }
                    break;
                case "q":
                    System.out.println("[프로그램 종료]");
                    System.out.println("프로그램을 종료하시겠습니까?");
                    System.out.println("예 | 아니요");
                    System.out.print("선택: ");
                    String choose = scanner.nextLine();

                    if(choose.equals("예")){
                        isRun = false;
                        System.out.println("프로그램 종료!!!");
                    }
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
            System.out.println();
        }
    }
}
