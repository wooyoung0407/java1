package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10,20));
        System.out.println(a계산기.더하기(10,20,30));
        System.out.println(a계산기.더하기(10.5,20,30));
    }
}
class 계산기{
    int 더하기(int x,int y){
        return x+y;
    }
    int 더하기(int x, int y, int z){
        return x+y+z;
    }
    double 더하기(double x, double y , double z){
        return x+y+z;
    }
}
