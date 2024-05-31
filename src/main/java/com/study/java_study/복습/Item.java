package com.study.java_study.복습;

import java.io.IOException;

class Item {
    void pause() {
        try {
            System.out.println("일시정지 합니다.");
            System.out.println("계속하려면 아무 키나 누르십시오 . . .");
            System.in.read();
        } catch (IOException e) {
        }
    }
}
