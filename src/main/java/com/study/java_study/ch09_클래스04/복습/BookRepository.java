package com.study.java_study.ch09_클래스04.복습;


// 저장소 -> CRUD
public class BookRepository {
    private int bookId;
    private BookEntity[] books;

    public BookRepository(){
        books = new BookEntity[0];
    }

    public int autoIncrementBookId(){
        return ++bookId;
    }

    private void extendBooks(){ // 정부 추가를 위해 배열을 늘리는 메소드
        // 기존 배열보다 크기가 하나 더 큰 배열을 생선한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1]; // 기존보다 하나 더 많은 배열 선언

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 반값이다.
        for(int i = 0; i < books.length; i++){
            newBooks[i] = books[i]; // 기존에 있는 값들을 모두 새 배열로 욺김
        }
        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;   // 새 배열을 기존 배열 주소로 변경
    }

    private int getLastIndex(){
        return books.length - 1;
    }

    public void saveBook(BookEntity book){  // 도서 정보 저장 메소드
        // 배열 확장
        extendBooks();  // 도서 정보를 저장하기 위해 배열을 늘리는 메소드 호출

        // 새로운 배열의 비었는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[books.length - 1] = book; // 새 배열 마지막 방에 추가할려는 도서 정보 대입
    }

    public BookEntity findBookByBookId(int bookId){ // 선형탐색 알고리즘
        BookEntity findBook = null;
        for(BookEntity book : books){
            if(book.getBookId() == bookId){
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    public BookEntity findBookByBookName(String bookName){
        BookEntity findBook = null;
        for(BookEntity book : books){
            if(book.getBookName().equals(bookName)){
                findBook = book;
                break;
            }
        }
        return findBook;
    }
    private int getNewArraySize(int option, String searchText){ // searchBooks의 배열 크기를 알아내는 메소드
        int newArraySize = 0;   // 변수 초기화 // 검색 조건에 해당할때마다 1씩 증가

        switch (option){
            case 1: // 통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2: // 도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: // 저자명
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: // 출판사명검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
        }

        return newArraySize;    // 검색된 횟수 return
    }

    // 다건조회
    public BookEntity[] searchBooks(int option, String searchText){
       int newArraySize = getNewArraySize(option, searchText); // 배열크기를 얻기 위해 getNewArraySize메소드 실행
       BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0;
        switch (option){
            case 1: // 통합검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 2: // 도서명검색
                for(BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: // 저자명
                for(BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사명검색
                for(BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
        }

        return searchBooks;
    }

}