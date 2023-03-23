package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        병사 a병사 = new 병사();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 이병 입니다.
        a병사.공격();

        a병사.진급();

        a병사.자기소개();
        a병사.공격();
        // 안녕하세요. 저는 홍길동 일병 입니다.

        a병사.진급();

        a병사.자기소개();
        a병사.공격();

    }
}
class 병사 {
    String 이름;
    int 계급번호;
    int 공격력;

    병사() {
        계급번호 = 1;
        공격력 = 7;
    }

    String get계급() {

        String 계급 = "";

        if ( 계급번호 == 1 ) {
            계급 = "이병";
        }else if ( 계급번호 == 2 ) {
            계급 = "일병";
        }else if ( 계급번호 == 3 ) {
            계급 = "상병";
        }else if ( 계급번호 == 4 ) {
            계급 = "병장";
        }

        return 계급;
    }

    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.이름 + this.get계급() + " 입니다.");
    }

    void 진급() {
        계급번호++;
        공격력+=2;
    }
    void 공격(){
        System.out.println(this.이름 + this.get계급() + "이 공격합니다.(공격력 :" + this.공격력 +")");
    }
}

