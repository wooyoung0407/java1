package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

//        int[] arr = new int[3];
//
//        arr[0] = 11;
//        arr[1] = 123;
//        arr[2] = 1234;
//
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);


//        int[] arr1 = {1, 2, 3}; // new int[3];(배열의 수만 선언)
//
//        System.out.println(arr1);
//
//        int sum = 0;
//        for (int i = 0; i < arr1.length; i++) {
//
//            sum += arr1[i];
//            System.out.println(arr1[i]);
//        }
//        System.out.println(sum);
//        System.out.println(sum / arr1.length);

//        자동차 제네시스 = new 자동차(); // class 명 object 명 = new class명();
//        // 자동차 car_1;   car_1 = new 자동차();
//        자동차 포르쉐 = new 자동차();
////        제네시스.color = "blue";
////        제네시스.price = "몇천만원";
////        포르쉐.color = "red";
////        포르쉐.price = "몇억";
//
////        System.out.println(제네시스.color);
////        System.out.println(제네시스.price);
////        System.out.println(포르쉐.color);
////        System.out.println(포르쉐.price);
//        제네시스.달리다();
//        포르쉐.달리다();

//        charater carick = new charater();
//        charater carick_1 = new charater();
//
//        carick.name = "루피";
//        carick.age = 20;
//        carick.height = 175;
//
//        carick_1.name = "조로";
//        carick_1.age = 30;
//        carick_1.height = 185;
//
//        carick.자기소개();
//        carick_1.자기소개();

//        자동차 car_1 = new 자동차();
//        자동차 car_2 = new 자동차();
//
//        car_1.번호 = 1;
//        car_1.속도 = 20;
//
//        car_2.번호 = 2;
//        car_2.속도 = 40;

//        car_1.car(); //함수 실행
//        car_2.car();

        Person aPerson = new Person();
        aPerson.나이 = 20;
        aPerson.인류평균나이 = 20;

        Person bPerson = new Person();
        bPerson.나이 = 30;
        bPerson.인류평균나이 += 40;

        Person cPerson = new Person();
        cPerson.나이 = 30;
        cPerson.인류평균나이 += 50;

        Person dPerson = new Person();
        dPerson.나이 = 25;
        dPerson.인류평균나이 += 30;

        Person.인류평균나이소개();


    }
}

class Person {
    int 나이;

    static int 인류평균나이;

    void 자기소개() {
        System.out.println("제 나이는" + this.나이 + "살 " + "살입니다.");
    }

    static void 인류평균나이소개() {
        System.out.println("인류평균나이는 " + 인류평균나이 / 4 + "살 입니다.");
    }
}


//class 자동차 {
//    int 속도;
//    int 번호;
//
//    void car() { //함수 void
//        System.out.println(this.번호 + "번 자동차는 " + this.속도 + "km로 달린다.");
//    }
//
//}

//
//class charater {
//    int age;
//    int height;
//    String name;
//
//    void 자기소개() {
//        System.out.println("안녕하세요. 저는 " + this.name + "입니다. 저의 나이는 " + this.age + "살입니다. 저의 키는" + this.height + "cm입니다."); //this.name
////        System.out.println("저의 나이는 " + age + "살입니다.");//this.age
////        System.out.println("저의 키는 " + height + "cm입니다.");//this.height
//    }
//}

