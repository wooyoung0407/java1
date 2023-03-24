package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.set_id(20);  // set_id

        System.out.println("제 번호는 "+ a사람.get_id() + "입니다."); // get_id
    }
}
class 사람{
    private int id; // 접근제한자

    void set_id(int id){
        this.id = id;
    }
    int get_id(){
        return this.id;
    }
}