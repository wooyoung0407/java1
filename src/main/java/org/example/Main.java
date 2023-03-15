package org.example;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int i = 로봇.get정수();
        boolean b = 로봇.get논리();
        사람 a사람 = 로봇.get사람();
//        사람 a사람2 = 로봇.get사람2();
//        사람 a사람3 = 로봇.get사람3();
//        사람 a사람4 = 로봇.get사람4();
//        사람 a사람5 = 로봇.get사람5(123,false);
    }
}
class 로봇 {
    static int get정수(){
        return 1;
    }
    static boolean get논리(){
        return true;
    }
    static 사람 get사람(){
        return new 사람(); // 사람 a사람 = new 사람();
   }
//    static 사람 get사람2(){
//        return new 사람(); 사람 a사람2 = new사람();
//    }
//    static 사람 get사람3(){
//        return new 사람();
//    }
//    static 사람 get사람4(){
//        return new 사람();
//    }
//    static 사람 get사람5(int n,boolean f){
//        return new 사람();
//    }
}
class 사람{}


