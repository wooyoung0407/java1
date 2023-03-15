package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        전사 a전사 = new 전사();
        a전사.이름 = "카니";
        a전사.나이 =  22;
        a전사.a무기 = new 칼(); // 칼 a무기 = new 칼();
        a전사.공격();

        a전사.이름 = "초코";
        a전사.a무기 = new 활();
        a전사.공격();

    }
}

class 전사 {
    String 이름;
    int 나이;
    무기 a무기;
    void 공격 (){
        a무기.공격(this.이름);
    }

}
abstract class 무기 {
    abstract void 공격(String 이름);
}
class 칼 extends 무기 {
    void 공격 (String 이름 ){
        System.out.println(이름 + "가 칼로 공격합니다.");

    }
}
class 활 extends 무기 {
    void 공격 (String 이름){
        System.out.println(이름 + "가 활로 공격합니다.");
    }
}

