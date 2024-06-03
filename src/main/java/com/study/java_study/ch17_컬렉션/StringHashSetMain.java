package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;


public class StringHashSetMain {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet<>();

        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet);

        for(String name : strSet){
            System.out.println(Objects.hash(name));
        }

        strSet.addAll(List.of("김준일", "김준일", "김준일"));

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);


        System.out.println(strList);
    }
}
