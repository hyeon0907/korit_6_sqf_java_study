package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("게임 시작");
                System.out.println("게임 종료");
            }
        };

        runnable.run();
        Consumer<String> User =  s -> {
                System.out.println(s + "님 환영합니다.");
        };

        User.accept("김정현");
    }
}
