package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        a전사.재공격();
        a전사.공격("필립", "창");
        a전사.재공격();
        a전사.공격("마크", "지팡이");
        a전사.재공격();

    }
}

class 전사 {
    String name2;
    String weapon2;

    void 공격(String name, String weapon) {
        System.out.printf("%s이(가)  %s(으)로 공격합니다.\n", name, weapon); //c언어 출력
        System.out.println(name + "이(가) " + weapon + "(으)로 공격합니다."); // JAVA 출력

        this.name2 = name;
        this.weapon2 = weapon;
    }

    void 재공격() {
        System.out.printf("%s이(가)  %s(으)로 공격합니다.\n", this.name2, this.weapon2); //c언어 출력
        System.out.println(this.name2 + "이(가) " + this.weapon2 + "(으)로 공격합니다."); // JAVA 출력
    }
}
