package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        new Solution().run();
//        Person Person1 = new Person("홍길동", 22, 173.5);
//        Person Person2 = new Person("이순신", 40, 172);


    }
}
class Solution {

    void run (){
        Person Person1 = new Person("홍길동", 22, 170.5);
        Person Person2 = new Person("이순신", 40, 173.2);
    }
}

class Person {
    String Name;
    int Age;
    double Height;

    Person(String name, int age, double height) {
        this.Name = name;
        this.Age = age;
        this.Height = height;

        System.out.println("이름 : " + name + " 나이 : " + age + "살 키 : " + height + "cm");
    }

}

