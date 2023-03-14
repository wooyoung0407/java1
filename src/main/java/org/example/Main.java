package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        샤오미TV a샤오미TV = new 샤오미TV();
//        삼성TV a삼성TV = new 삼성TV();
//        LGTV aLGTV = new LGTV();

        표준TV a표준TV = new 샤오미TV();
        a표준TV.켜기();
        a표준TV.끄기();


        표준TV b표준TV = new 삼성TV();
        b표준TV.켜기();
        b표준TV.끄기();


        표준TV c표준TV = new LGTV();
        c표준TV.켜기();
        c표준TV.끄기();

//
//        a샤오미TV.켜기();
//        a샤오미TV.끄기();
//        a샤오미TV.vr켜기();
//
//        a삼성TV.켜기();
//        a삼성TV.끄기();
//        a삼성TV.vr켜기();
//
//        aLGTV.켜기();
//        aLGTV.끄기();
//        aLGTV.게임전환모드();

    }
}

abstract class 표준TV {

    abstract void 켜기();

    abstract void 끄기();
}

class 샤오미TV extends 표준TV {
    void 켜기() {
        System.out.println("샤오미TV가 켜집니다.");
    }

    void 끄기() {
        System.out.println("샤오미TV가 꺼집니다.");
    }

    void vr켜기() {
        System.out.println("샤오미TV가 vr켜기");
    }
}

class 삼성TV extends 표준TV {
    void 켜기() {
        System.out.println("삼성TV가 켜집니다.");
    }

    void 끄기() {
        System.out.println("삼성TV가 꺼집니다.");
    }

    void vr켜기() {
        System.out.println("삼성TV가 vr켜기");
    }
}

class LGTV extends 표준TV {
    void 켜기() {
        System.out.println("LGTV가 켜집니다.");
    }

    void 끄기() {
        System.out.println("LGTV가 꺼집니다.");
    }

    void 게임모드전환() {
        System.out.println("LGTV가 게임모드전환");
    }
}


