package com.study.java_study.ch16_제네릭;

public class SenderMain {
    public static void main(String[] args) {


//        [ Wrapper 자료형]
//        Integer   int
//        Boolean   boolean
//        Characte  char
//        Double    double
//        Long      long
//        Float     float

        Integer num = new Integer(10);
        int num2 = num.intValue();

        Sender<Integer, String, Double> sender1 = new Sender<>(10, "20", 3.14);

    }
}
