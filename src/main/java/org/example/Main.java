package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        new Solution1().run();
//        Person Person1 = new Person("홍길동", 22, 173.5);
//        Person Person2 = new Person("이순신", 40, 172);
        new Solutino2().run();
        new Solution3().run();


    }
}
class Solution1 {

    void run (){
        Person Person1 = new Person("홍길동", 22, 170.5);
        Person Person2 = new Person("이순신", 40, 173.2);

        System.out.println(Person1);
        System.out.println(Person2);
    }
}

class Solutino2 {
    public void run(){
        HashMap<String, Object> person1 = new HashMap<String, Object>();
        person1.put("이름","홍길동");
        person1.put("나이",25);
        person1.put("키",162.4);

        System.out.println(person1);
        System.out.println("이름 : " + person1.get("이름") + " 나이 : " + person1.get("나이") + " 키 : " + person1.get("키"));

        HashMap<String, Object> person2 = new HashMap<String, Object>();

        person2.put("이름","이순신");
        person2.put("나이",40);
        person2.put("키",172.2);

        System.out.println(person2);
        System.out.println("이름 : " + person2.get("이름") + " 나이 : " + person2.get("나이") + " 키 : " + person2.get("키"));
    }
}
class Solution3 {
    void run(){
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        int sum = arr.get(0)+arr.get(1)+arr.get(2)+arr.get(3)+arr.get(4);
        System.out.println(sum);
        System.out.println(sum/arr.size());
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
}
//    public String toString() {
//        return "Person{" +
//                "name='" + this.Name + '\'' +
//                ", age=" + this.Age +
//                ", height=" + this.Height +
//                '}';
//    }
//}

