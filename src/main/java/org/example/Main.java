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

        System.out.println(Person1);
        System.out.println(Person2);
    }
}

class Person {
    private String Name;
    private int Age;
    private double Height;

    Person(String name, int age, double height) {
        this.Name = name;
        this.Age = age;
        this.Height = height;

//        System.out.println("이름 : " + name + " 나이 : " + age + "살 키 : " + height + "cm");
    }
    public String toString() {
        return "Person{" +
                "name='" + this.Name + '\'' +
                ", age=" + this.Age +
                ", height=" + this.Height +
                '}';
    }
}

