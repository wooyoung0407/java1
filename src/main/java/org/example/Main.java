package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        검은고양이 a고양이 = new 검은고양이();
        흰고양이 b고양이 = new 흰고양이();
        회색고양이 c고양이 = new 회색고양이();

        a고양이.저주하다();
        b고양이.치유하다();
        c고양이.달리다();

    }
}

class 고양이 {
    void 달리다() {
        System.out.println("달리다");
    }
    void 멈추다() {
        System.out.println("멈추다");
    }
    void 울다() {
        System.out.println("울다");
    }
    void 물다() {
        System.out.println("물다");
    }
}

class 검은고양이 extends 고양이 {
    void 저주하다() {
        System.out.println("저주하다");
    }
}

class 흰고양이 extends 고양이 {
    void 치유하다() {
        System.out.println("치유하다");
    }
}
class 회색고양이 extends  고양이{
    void 달리다(){
        //오버라이드
        System.out.println("회색고양이 달리다.");
    }
}
