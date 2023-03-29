package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        // HashMap<String,integer> arrMap = new HashMap<String,integer>();
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
    }
}
