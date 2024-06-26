package com.study.java_study.ch10_추상화01;


public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈");
        Animal tiger = new Tiger("옹이", 5, 100);

        System.out.println(dog.toString());
        System.out.println(tiger.toString());

        dog.move();
        tiger.move();
        ((Tiger) tiger).hunt();
        dog.bark();
        System.out.println("======================");
        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = tiger = new Tiger("옹이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println("======================");

        // animal.getClass() == Tiger.class --> animal instanceof tiger
        for (Animal animal : animals){
            if(animal instanceof Tiger){
                Tiger t = (Tiger) animal;
                t.hunt();
            }else if (animal instanceof Dog){
                Dog d = (Dog) animal;
                d.bark();
            }
        }
        System.out.println();
        for (Animal animal : animals){
            if(animal.getClass() == Tiger.class){
                Tiger t = (Tiger) animal;
                t.hunt();
            }else if (animal.getClass() == Dog.class){
                Dog d = (Dog) animal;
                d.bark();
            }
        }

    }

}
