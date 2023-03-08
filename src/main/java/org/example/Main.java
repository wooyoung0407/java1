package org.example;

public class Main {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 10;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        System.out.println("============");
//
//        int c = a;
//        a = b;
//        b = c;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);

//        int x = 10;
//
//        System.out.println(x + 1);
//        System.out.println(x - 1);
//        System.out.println(x * 2);
//        System.out.println(x / 2);
//        System.out.println(x % 3);

        int age = 25;

        System.out.println("당신의 나이 : " + age);
        // 20 <= age <= 34 청년
        if (age >= 20 && age <= 34) {
            System.out.println("청년입니다.");
        } else if (age < 20) {
            System.out.println("미성년입니다.");
        } else {
            System.out.println("어른입니다.");
        }
    }
}