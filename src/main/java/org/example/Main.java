package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        캐릭터 a플레이어_캐릭터; //캐릭터 a 플레이어_캐릭터 = new 캐릭터(); //32강 1번문제
//
//        a플레이어_캐릭터 = new 전사();
//        a플레이어_캐릭터.공격();
//        // 출력 : 전사가 대검으로 공격합니다.
//
//        a플레이어_캐릭터 = new 마법사();
//        a플레이어_캐릭터.공격();
//        // 출력 : 마법사가 파이어볼로 공격합니다.

//        전사 a전사0 = new 전사(); //32강 2번문제
//        a전사0.나이 = 20;
//        a전사0.이름 = "칸";
//        a전사0.성격 = "차가움";
//        a전사0.a무기 = new 활();
//
//        전사 a전사1 = new 전사();
//        전사 a전사2 = new 전사();
//        전사 a전사3 = new 전사();
//        전사 a전사4 = new 전사();
//        전사 a전사5 = new 전사();
//
//        System.out.println(a전사0.이름);
//        // 출력 : 칸
//        System.out.println(a전사1.이름);
//        // 출력 : No Name
//        System.out.println(a전사2.이름);
//        // 출력 : No Name
//        System.out.println(a전사3.이름);
//        // 출력 : No Name
//        System.out.println(a전사4.이름);
//        // 출력 : No Name
//        System.out.println(a전사5.이름);
//        // 출력 : No Name

//        사람 a사람 = new 사람(); //32강 3번문제
//        a사람.나이 = 10;
//        a사람.a왼팔 = new 팔();
//
//        System.out.println(a사람.a왼팔.길이 + "cm");
//        // 출력 : 100cm

//        new 사람().걷다(); //32강 4번문제
//
//        System.out.println(new 사람().a왼팔.길이 + "cm");
//        // 출력 : 100cm

        // 지역변수 => 하루살이 변수
//        int k = 10; // main 함수 안에서만 산다. //32강 5번문제
//
//        사람 a사람 = new 사람();
//        a사람.나이 = 20;
//
//        int dan = 8;  // main 함수 안에서만 산다.
//        for ( int i = 1; i < 9; i++ ) {
//            // i => for block 안에서만 산다.
//            System.out.println(dan + " * " + i + " = " + dan * i);
//        }
//
//        System.out.println(a사람.나이);
//        a사람.걷다();
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이; // 32강 6,7,8문제

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm

    }
}

class 사람 { //32강 6,7,8문제
    팔 a왼팔; // 6문제

    사람() {
        a왼팔 = new 팔();
    }
}

class 팔 {
    손 a손; // 6문제
    팔() {
        a손 = new 손();
    }
}

class 손 {
    손가락 a엄지손가락; // 6문제
    손() {
        a엄지손가락 = new 손가락();
        a엄지손가락.길이 = 5; //7번문제
    }
}

class 손가락 {
    int 길이; // 6문제
    손가락() { //6문제
//        길이 = 5;
    }
}

//class 사람 { //32강 5번문제
//    // 인스턴스 변수
//    int 나이;
//
//    void 걷다() {
//        int 나이 = 22;
//
//        System.out.println(this.나이 + "살인 홍길동씨가 걷습니다.");
//    }
//}
//class 사람 { //32강 4번문제
//    팔 a왼팔;
//    사람 () {
//        a왼팔 = new 팔(); //왼팔을 팔 객체에 연결
//    }
//    void 걷다() {
//        System.out.println("사람 걷는다.");
//    }
//}
//class 팔 {
//    int 길이;
//    팔(){
//        길이 = 100;
//    }
//}

//class 사람 { //32강 3번문제
//    int 나이;
//    팔 a왼팔;
//
//}
//class 팔{
//    int 길이;
//    팔 () {
//        길이 = 100;
//    }
//}

//class 전사 { //32강 2번문제
//    int 나이;
//    String 이름;
//    String 성격;
//    무기 a무기;
//
//    // `전사()` 는 생성자 메서드 이다.
//    // 클래스 명과 같은 이름의 메서드를 생성자 메서드 라고 한다.
//    // 생성자 메서드는 자동으로 호출됩니다.
//    // 생성자 메서드는 new 할때(객체 생성할 때) 자동으로 호출됩니다.
//    // 생성자 메서드는 다른 모든 메서드 보다 가장 먼저 딱 1번 실행됩니다.
//    // 생성자 메서드는 리턴타입이 없습니다.
//    // 당연하지만 생성자 메서드는 리턴값도 없습니다.
//    전사() {
//        // 수정가능지역 시작
//        this.나이 = 20;
//        this.이름 = "No Name";
//        this.성격 = "온순함";
//        this.a무기 = new 칼();
//        // 수정가능지역 끝
//    }
//}
//abstract class 무기 {}
//class 칼 extends 무기 {}
//class 활 extends 무기 {}

//abstract class 캐릭터 { //32강 1번문제
//      abstract void 공격() {
//
//    }
//}
//class 전사 extends 캐릭터 {
//    void 공격() {
//        System.out.println("전사가 대검으로 공격합니다.");
//    }
//}
//class 마법사 extends 캐릭터 {
//    void 공격() {
//        System.out.println("마법사가 파이어볼로 공격합니다.");
//    }
//}

