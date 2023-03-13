package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        계산기 a계산기 = new 계산기();
//        void시
//        a계산기.더하기(4, 3);
//        a계산기.빼기(5, 3);
//        a계산기.곱하기(5, 3);
//        a계산기.나누기(6, 3);

//        int 와 return시
        System.out.println("더하기 " + a계산기.더하기(4, 3));
        System.out.println("빼기 " +  a계산기.빼기(5, 3));
        System.out.println("곱하기 " + a계산기.곱하기(5, 3));
        System.out.println("나누기 " + a계산기.나누기(6, 3));
    }
}

class 계산기 {
    int 더하기(int a, int b) {
//        System.out.println("더하기 " + a + "+" + b + "=" + (a + b));
        return a + b;
    }

    int 빼기(int a, int b) {
//        System.out.println("빼기 " + a + "-" + b + "=" + (a - b));
        return a - b;
    }

    int 곱하기(int a, int b) {
//        System.out.println("곱하기 " + a + "*" + b + "=" + (a * b));
        return a * b;
    }

    int 나누기(int a, int b) {
//        System.out.println("나누기 " + a + "/" + b + "=" + (a / b));
        return a / b;
    }
}