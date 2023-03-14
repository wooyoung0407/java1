package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        페라리 a페라리 = new 페라리();

        자동차 a자동차 = (자동차)a페라리;

        a자동차 = a페라리;

        페라리 a페라리2 = (페라리)a자동차;

        a페라리2.달리다();
        a페라리2.서다();
        a페라리2.뚜껑이_열리다();

    }
}

class 자동차{
    void 달리다(){
        System.out.println("달리다");
    }
    void 서다(){
        System.out.println("서다");
    }
}
class 페라리 extends 자동차{
    void 뚜껑이_열리다(){
        System.out.println("뚜껑이 열리다");
    }
    void 달리다() {
        System.out.println("달리다2");
    }
    void 서다() {
        System.out.println("서다2");
    }
}

