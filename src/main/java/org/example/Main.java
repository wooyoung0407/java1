package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        사람 a사람 = new 사람();
//        a사람.달리기_속력 = 20;
//        a사람.달리다();
//        a사람.달리다();
//        a사람.달리기_속력 = 50;
//        a사람.달리다();

//        사람 a사람 = new 사람();
//        a사람.나이 = 20;
//        a사람.a왼팔 = new 팔();

//        전사 a전사 = new 전사();
//        a전사.나이 = 20;
//        a전사.a무기 = new 활();
//        a전사.a무기 = new 칼();

//        전사 a전사 = new 전사();
//
//        String 이름 = "칸";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//
//        a전사.나이++;
//        a전사.자기소개();
//
//        a전사.이름 = "카니";
//        a전사.나이 = 30;
//        a전사.자기소개();
//
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 카니가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.공격();

        전사 a전사 = new 전사();
        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();
        a전사.나이++;
        a전사.자기소개();
        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();
        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.
        a전사.a무기 = new 칼();
        a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
    }
}
class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;
    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
    void 공격(){
        a무기.name = this.이름;
        a무기.공격();
    }
}
class 무기 {
    String name;
    void 공격(){

    }
}

class 칼 extends 무기 {
    void 공격(){
        System.out.println(this.name + "가 칼로 공격합니다.");
    }
}

class 활 extends 무기 {
    void 공격(){
        System.out.println(this.name + "가 활로 공격합니다.");
    }
}

//class 전사 {
//    String 이름;
//    int 나이;
//    무기 a무기;
//
//    void 자기소개() {
//        System.out.println("저의 이름은 " + this.이름 + "이고, 나이는 " + this.나이 + "살입니다.");
//    }
//
//    void 공격() {
//        a무기.공격(this.이름);
//    }
//}
//
//class 무기 {
//    void 공격(String name) {
//    }
//}
//
//class 칼 extends 무기 {
//    void 공격(String name) {
//        System.out.println(name + "가 칼로 공격합니다.");
//    }
//}
//
//class 활 extends 무기 {
//    void 공격(String name) {
//        System.out.println(name + "가 활로 공격합니다.");
//    }
//}

//class 전사 {
//    int 나이;
//    무기 a무기;
//}
//class 무기 {}
//class 활 extends 무기 {}
//class 칼 extends 무기 {}


//class 사람 {int 나이;팔 a왼팔;}
//class 팔 {}


//class 사람{int 달리기_속력;
// void 달리다(){System.out.println("사람이 " + this.달리기_속력 + "km/h로 달립니다.");}
// }