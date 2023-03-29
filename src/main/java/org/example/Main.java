package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al.get(0) + al.get(1) + al.get(2) + al.get(3) + al.get(4));
        System.out.println(al.size());
        al.add(60);
        System.out.println(al.size());
        al.add(70);
        System.out.println(al.size());

        HashMap<String, Integer> arrMap = new HashMap<String, Integer>();

        arrMap.put("영희", 10); // "영희" = 인덱스 뒤가 값
        arrMap.put("철수", 20);
        arrMap.put("길동", 30);

        System.out.println("영희 나이 : " + arrMap.get("영희"));
        System.out.println("철수 나이 : " + arrMap.get("철수"));
        System.out.println("길동 나이 : " + arrMap.get("길동"));

    }
}
