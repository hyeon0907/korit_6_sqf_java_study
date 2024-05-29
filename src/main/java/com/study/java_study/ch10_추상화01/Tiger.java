package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal{
    private int power;

    public Tiger() {
        super();
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상송관계에서만 가능
    public void move(){
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();
    }
    public void hunt(){
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다.");
    }
    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
