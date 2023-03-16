package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//        a사람.나이 = 10;
//        a사람.a왼팔 = new 팔();
//
//        System.out.println(a사람.a왼팔.길이+ "cm");

        전사 a전사 = new 전사();
//        a전사.이름 = "홍길동";
        a전사.소개();
    }
}
class 전사{
    String 이름;
    전사 (){
        this.이름 = "아무개";
    }
    void 소개(){
        System.out.println("전사의 이름은 " + this.이름 + "입니다.");
    }
}


//class 사람{
//    int 나이;
//    팔 a왼팔;
//
//}
//class 팔{
//    int 길이;
//    팔 (){
//        this.길이 = 100;
//    }
//}

