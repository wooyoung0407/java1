package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격("브라이언", "칼");
        a전사.재공격();
        a전사.공격("필립", "창");
        a전사.공격("마크", "지팡이");
        a전사.재공격();
        a전사.재공격();
    }
}

class 전사 {
    String name2;
    String weapon2;
    void 공격(String name, String weapon) {

        System.out.println(name + "가(이) " + weapon + "으(로) 공격합니다.");

        this.name2 = name;
        this.weapon2 = weapon;
    }
    void 재공격() {
        System.out.println(this.name2 + "가(이) " + this.weapon2 + "으(로) 공격합니다.");
    }
}

