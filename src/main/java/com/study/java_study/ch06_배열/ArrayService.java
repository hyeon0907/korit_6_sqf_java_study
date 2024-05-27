package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {
    public static void main(String[] args) {
        ArrayUtills arrayUtills = new ArrayUtills();

        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while(isRun){
            System.out.println("[이름관리 프로그램");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectedMenu = scanner.nextLine();
            String[] newNames = null;
            int findIndex = -1;

            switch (selectedMenu){
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++){
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록할 이름");
                    names[names.length -1] = scanner.nextLine();
                    System.out.println("등록 완료!");

                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("수정 할 이름:");
                    String modifyName = scanner.nextLine();

                    findIndex = arrayUtills.findIndexByname(names, modifyName);
                    if(findIndex == -1){
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 이름: ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    /*
                    System.out.println("[이름 수정]");
                    System.out.print("수정 할 이름: ");
                    String fixName = scanner.nextLine();

                    System.out.print("수정 후 이름:");
                    String fixName_1 = scanner.nextLine();

                    boolean FixName = false;

                    for(int i = 0; i < names.length; i++){
                        if(names[i].equals(fixName)){
                            FixName = true;
                            names[i] = fixName_1;
                            break;
                        }
                    }
                    if(FixName == false){
                        System.out.println("해당 이름은 수정할 수 없습니다.");
                        break;
                    }
                    System.out.println(fixName + "에서 " + fixName_1 + "(으)로 바귀었습니다.");

                     */
                    break;
                case "3":

                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 할 이름:");
                    String removeName = scanner.nextLine();
                    findIndex = arrayUtills.findIndexByname(names, removeName);
                    if(findIndex == -1){
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    newNames = new String[names.length - 1];
                    for(int i = 0; i < newNames.length; i++){
                        if(i < findIndex){
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    System.out.println(removeName + "을(를) 삭제하였습니다.");
                    names = newNames;
                    /*
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제할 이름: ");

                    String delateName = scanner.nextLine();
                    String[] newNames2 = new String[names.length - 1];

                    boolean test = false;
                    for(int i = 0; i < newNames2.length; i++){
                        if(names[i].equals(delateName)){
                            test = true;
                        }
                        newNames2[i] = test == true? names[i+1]: names[i];
                    }
                    if(names[names.length-1].equals(delateName)){ // for문에서 names의 마지막 방은 체크가 되지 않아서 하는 if문
                        test = true;
                    }
                    if(test == false){
                        System.out.println("해당 이름은 삭제할 수 없습니다.");
                        break;
                    }
                    System.out.println(delateName + "을(를) 삭제하였습니다.");
                    names = newNames2;
                    */
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");

                    String findName = scanner.nextLine();
                    findIndex = arrayUtills.findIndexByname(names, findName);
                    if(findIndex == -1){
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++){
                        System.out.println("index[" + i + "]" + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요.");
            }
            System.out.println();
        }
    }
}
