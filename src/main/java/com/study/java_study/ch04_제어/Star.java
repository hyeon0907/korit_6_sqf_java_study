package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {

        /*
        *
        **
        ***
        ****
        *****
         */
    /*
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("*");
                if(i == j) break;
            }
            System.out.println();
        }
        */
        /*
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(i + j > 3) System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
         /*
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
          */

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j < 4 - i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======================");

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j < i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======================");

        for(int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                if(j < 5 - i) System.out.print(" ");
                else if(j - 4 < i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("==========================");
        for(int i = 0; i < 6; i++){
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
