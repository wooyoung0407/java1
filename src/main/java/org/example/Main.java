package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.a무기 = new 칼();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.a무기 = new 활();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.a무기 = new 창();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.a무기 = new 도();
        a전사타입D.공격();
    }
}
abstract class 전사타입{
//    String 무기;
    String 이름;
    무기 a무기;
    void 공격(){
        a무기.공격(this.이름);
    }
}
class 전사타입A extends 전사타입{
    전사타입A(){
//        무기 = "칼";

        this.이름 = "전사타입A";
    }
}
class 전사타입B extends 전사타입{
    전사타입B(){
//        무기 = "창";

        this.이름 = "전사타입B";
    }
}
class 전사타입C extends 전사타입{
    전사타입C(){
//        무기 = "활";

        this.이름 = "전사타입C";
    }
}
class 전사타입D extends 전사타입{
    전사타입D(){
//        무기 = "도";

        this.이름 = "전사타입D";
    }
}
abstract class 무기 {
    String weapon;
    void 공격(String name){
        System.out.println(name + "가 " + weapon + "로 공격합니다.");
    }
}
class 칼 extends 무기{
    칼(){
        weapon = "칼";
    }
}
class 활 extends 무기{
    활(){
        weapon = "활";
    }
}
class 창 extends 무기{
    창(){
        weapon = "창";
    }

}
class 도 extends 무기{
    도(){
        weapon = "도";
    }

}