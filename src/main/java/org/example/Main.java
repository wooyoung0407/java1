package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        int i = 로봇.get정수(); //30강 1번문제
//        boolean b = 로봇.get논리();
//        사람 a사람 = 로봇.get사람();
//        사람 a사람2 = 로봇.get사람2();
//        사람 a사람3 = 로봇.get사람3();
//        사람 a사람4 = 로봇.get사람4();
//        사람 a사람5 = 로봇.get사람5(123, false);

//        사람 a사람 = new 사람(); //30강 2번문제
//        a사람.달리기_속력 = 20;
//        a사람.달리다();
//        // 사람이 20km/h로 달립니다.
//        a사람.달리다();
//        // 사람이 20km/h로 달립니다.
//
//        a사람.달리기_속력 = 50;
//        a사람.달리다();
//        // 사람이 50km/h로 달립니다.
//
//        사람 a사람 = new 사람(); //30강 3번문제
//
//        a사람.나이 = 20;
//        a사람.a왼팔 = new 팔();

//        전사 a전사 = new 전사(); //30강 4번문제
//
//        a전사.나이 = 20;
//        a전사.a무기 = new 활();
//        a전사.a무기 = new 칼();


//        전사 a전사 = new 전사(); // 30강 5번째문제
//
//        String 이름 = "칸";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//
//        a전사.나이++;
//        a전사.자기소개();
//
//        a전사.나이 = 30;
//        a전사.이름 = "카니";
//        a전사.자기소개();
//
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 카니가 활로 공격합니다.
//
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 : 카니가 칼로 공격합니다.

//        전사 a전사 = new 전사(); //30강 6번째 문제 (매개변수 금지)
//        String 이름 = "칸";
//        a전사.이름 = 이름;
//        a전사.나이 = 20;
//        a전사.자기소개();
//        a전사.나이++;
//        a전사.자기소개();
//        a전사.나이 = 30;
//        a전사.이름 = "카니";
//        a전사.자기소개();
//        a전사.a무기 = new 활();
//        a전사.공격();
//        // 출력 : 카니가 활로 공격합니다.
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 : 카니가 칼로 공격합니다.
//
//        전사 a전사 = new 전사(); //30강 7번째 문제
//        a전사.공격();
//        // 출력 => 아직 무기가 없습니다.
//        a전사.a무기 = new 칼();
//        a전사.공격();
//        // 출력 => 칼로 공격합니다.

    }
}
//class 전사 { //30강 7번째 문제
//    무기 a무기;
//
//    void 공격(){
//        if (a무기 == null) {
//            System.out.println("아직 무기가 없습니다.");
//        }else{
//            a무기.공격();
//        }
//    }
//}
//abstract class 무기 {
//    abstract void 공격();
//}
//class 칼 extends 무기{
//    void 공격(){
//        System.out.println("칼로 공격합니다.");
//    }
//}
//class 전사 { //30강 6번째 문제 (매개변수 금지)
//    String 이름;
//    int 나이;
//    무기 a무기;
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
//    }
//    void 공격(){
//        a무기.name = this.이름;
//        a무기.공격();
//    }
//}
//
//class 무기 {
//    String name;
//    void 공격(){
//
//    }
//}
//
//class 칼 extends 무기 {
//    void 공격(){
//        System.out.println(name + " 칼로 공격합니다.");
//    }
//}
//
//class 활 extends 무기 {
//    void 공격(){
//        System.out.println(name + " 활로 공격합니다.");
//    }
//}
//class 전사 { // 30강 5번째문제
//    int 나이;
//    String 이름;
//    무기 a무기;
//    void 자기소개(){
//        System.out.println("저의 이름은 " + this.이름 + " 저의 나이는" + this.나이+ "입니다.");
//    }
//    void 공격 (){
//        a무기.공격(this.이름);
//    }
//}
//class 무기 {
//    void 공격 (String name){
//
//    }
//}
//class 활 extends 무기{
//    void 공격 (String name){
//        System.out.println(name + "가 활로 공격합니다.");
//    }
//}
//class 칼 extends 무기{
//    void 공격 (String name){
//        System.out.println(name + "가 칼로 공격합니다.");
//    }
//}



//class 전사{ //30강 4번문제
//    int 나이;
//    무기 a무기;
//}
//class 무기 {
//
//}
//class 활 extends 무기{
//
//}
//class 칼 extends 무기{
//
//}


//class 사람 { //30강 3번문제
//    int 나이;
//
//    팔 a왼팔;
//}
//class 팔 {
//
//}
//class 사람 { //30강 2번문제
//    int 달리기_속력;
//    void 달리다(){
//        System.out.println("사람이 " + 달리기_속력 + "km/h로 달립니다.");
//    }
//}

//class 로봇{ //30강 1번문제
//    static int get정수(){
//        return 1;
//    }
//    static boolean get논리(){
//        return true;
//    }
//
//    static 사람 get사람(){
//        return new 사람();
//    }
//    static 사람 get사람2(){
//        사람 a사람2 = new 사람();
//        return a사람2;
//    }
//    static 사람 get사람3(){
//        return null;
//    }
//    static 사람 get사람4(){
//        사람 a사람 = null;
//        return null;
//    }
//    static 사람 get사람5(int n,boolean b){
//        return new 사람();
//    }
//}
//class 사람 {
//
//}