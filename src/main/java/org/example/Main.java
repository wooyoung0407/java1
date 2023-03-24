package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();

        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
    }
}

class 오리 {
    비행아이템 a비행아이템;
    오리 (){
        a비행아이템 = new 비행();
    }
    void 날다 (){
        a비행아이템.날다();
    }
}
class 청둥오리 extends 오리{
//    void 날다 (){
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
}
class 흰오리 extends 오리{
//    void 날다 (){
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
}
class 고무오리 extends 오리{
    고무오리 (){
        a비행아이템 = new no비행();
    }
//    void 날다 (){
//        System.out.println("저는 날 수 없어요 ㅜㅜ");
//    }
}
class 고무2오리 extends 고무오리{
    고무2오리 (){
        a비행아이템 = new no비행();
    }
//    void 날다 (){
//        System.out.println("저는 날 수 없어요 ㅜㅜ");
//    }
}
class 비행아이템 {
    void 날다 (){
//        System.out.println("오리가 날개로 날아갑니다.");
    }
}
class 비행 extends 비행아이템 {
    void 날다 (){
        System.out.println("오리가 날개로 날아갑니다.");
    }
}
class no비행 extends 비행아이템 {
    void 날다 (){
        System.out.println("저는 날 수 없어요 ㅜㅜ");
    }
}
