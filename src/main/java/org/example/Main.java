package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        검은오리 a검은오리 = new 검은오리();
        a검은오리.날다();
        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();

    }
}

class 오리 {
    void 날다() {
        System.out.println("날개로 날수있다.");
    }
}

class 검은오리 extends 오리 {

}

class 흰오리 extends 오리 {

}

class 고무오리 extends 오리 {
    void 날다() {
        System.out.println("고무오리는 날수없다.");
    }
}

class 고무2오리 extends 고무오리 {
}

