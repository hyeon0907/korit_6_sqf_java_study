package com.study.java_study.클래스03;

public class ColorMain {
    public static void main(String[] args) {
        /*
            문제.
            Color 객체 5개를 담을 수 있는 배열을 생성하여
            #CA848A, Brandied Apricot
            #FFBE98, Peach Fuzz
            #964F4C, Marsala
            #A78C78, Almodine
            #D8C88D, Almond peach
            색상 데이터를 저장 한 후에 for문을 사용하여 배열에 들어있는
            모든 색상 정보를 printINfo()로 호출하여 출력한다.
            이후에 모든 code와 name의 값을 null로 바꾸에 출력한다.
            이때 null로 바꿀때에는 반복문을 사용한다.
         */
        Color[] color = new Color[5];

        color[0] = new Color("#CA848A", "Brandied Apricot");
        color[1] = new Color("#FFBE98", "Peach Fuzz");
        color[2] = new Color("#964F4C", "Marsala");
        color[3] = new Color("#A78C78", "Almodine");
        color[4] = new Color("#D8C88D", "Almond peach");

        for(int i = 0; i < color.length; i++) {
            color[i].printInfo();
        }

        for(int j = 0; j < color.length; j++){
            color[j].setCode(null);
            color[j].setName(null);
        }
        System.out.println("==================");
        for(int i = 0; i < color.length; i++) {
            color[i].printInfo();
        }
    }
}
