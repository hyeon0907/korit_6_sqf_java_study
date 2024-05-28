package com.study.java_study.ch09_클래스04.복습;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService(){
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu(){
        String menus = "1234q";
        String seltedMenu = null;
        while(true) {
            System.out.print("메뉴 선택: ");
            seltedMenu = scanner.nextLine();
            if(menus.contains(seltedMenu)){
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }

        return seltedMenu;
    }

    public boolean run(){   // 프로그램 실행시 메뉴선택, 메뉴 실행하는 메소드
        boolean isRun = true;   // true == 프로그램 실행중, false == 프로그램 종료

        System.out.println("[ 도서 관리 프로그램]");    // 프로그램 설명
        System.out.println("1. 도서 등록"); // 1번 선택시 도서 등록
        System.out.println("2. 도서 검색"); // 2번 선택시 도서 검색
        System.out.println("3. 도서 수정"); // 3번 선택시 도서 수정
        System.out.println("4. 도서 삭제"); // 4번 선택시 도서 삭제
        System.out.println("q. 프로그램 종료");   // q 입력시 프로그램 종료

        String selectedMenu = selectMenu();   // selectedMenu에 메뉴선택 번호 저장

        switch (selectedMenu){  // 메뉴 입력시 switch문 진입
            case "q":   // q선택시 진입(프로그램 종료)
                isRun = false;  // 프로그램을 종료하기 위해서 isRun을 false로 바꿔줌
                break;  // switch문 탈출을 위한 break
            case "1":   // 1번 선택후 case문진입(도서 등록)
                registerBook(); //registerBook메소드 실행
                break;  // switch문 탈출을 위한 break
            case "2":   // 2번 선택후 case문진입(도서 검색)
                search();   // 도서 검색 메소드 실행
                break;  // switch문 탈출을 위한 break
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println("입력 오류!");
        }
        System.out.println();

        return isRun;
    }

    private String validateValue(String title){
        String value = null;
        while(true) {
            System.out.println(title + "명 입력: ");
            value = scanner.nextLine();

            if(!value.isBlank()) { // 공백이 아니라면
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시입력하세요");
        }
        return value;
    }

    private String duplicateBookName(){ //도서명 중복 체크 메소드
        String bookName = null;     // bookName을 선언 후 null로 비워줌

        while(true){    // 무한반복
            bookName = validateValue("도서"); // validateValue로 공백 입력 확인
            if(bookRepository.findBookByBookName(bookName) == null){    // 입력 도서명이 findBookName을 사용하여 중복인지 체크 후 중복이 아니면 null
                break;
            }
            // 중복이라면 if문 이 성립하지 않으므로 중복입니다 메시지 출력
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요.");
        }
        return bookName;    // 중복되지 않았다면 책 이름을 return
    }

    private void registerBook() {   // 도서 등록을 위한 메소드
        System.out.println("[ 도서 등록 ]");    // 도서 등록 창
        int bookId = bookRepository.autoIncrementBookId();  // autoIncrementBookId메소드로 bookId받아오기(그리고 ++해주기)
        String bookName = duplicateBookName();  //입력한 도서명이 중복인지 체크 후 아니면 도서명 return후 bookName에 저장
        String author = validateValue("저자");    //공복을 입력한지 만 체크 후 저자를 author에 저장
        String publisher = validateValue("출판사"); //공복을 입력한지 만 체크 후 출판사를 publisher에 저장

        BookEntity book = new BookEntity(bookId, bookName, author, publisher);  // 중복 이나 공백이 없다면 book에 도서 정보 저장
        bookRepository.saveBook(book);  // saveBook 메소드 호출
        System.out.println("새로운 도서를 등록하였습니다."); // 도서 정보를 추가한 후 도서등록 하엿다는 메시지 출력
    }

    private void search(){  // 도서 검색 메소드
        System.out.println("[ 도서 검색 ]");    // 도서 검색 메뉴 출력
        System.out.println("1. 통합 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.println("옵션 선택");
        int option = scanner.nextInt(); // 도서 검색 메뉴 선택
        scanner.nextLine(); // nextLine을 제외한 다른 입력들은 enter를 입력 받지 않으므로 nextLine을 사용하여 enter를 개행
        System.out.print("검색어 입력: ");
        String searchText = scanner.nextLine(); // 검색할려는 도서 정보 입력
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);  // 도서 검색 결과 메소드 실행

        System.out.println("[ 검색 결과 ]");
        if(searchBooks.length == 0){
            System.out.println("검색 결과가 없습니다.");
            return;
        }
        for(BookEntity book : searchBooks){
            System.out.println(book.toString());
            System.out.println();
        }
    }
}
