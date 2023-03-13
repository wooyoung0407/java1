package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        계산기 a계산기 = new 계산기();

        a계산기.합산(3,6);
        // System.out.println(a계산기.합산(8)); //int 시
    }
}

class 계산기 {

    int sum;

    void 합산(int n , int m) { // int
        // int sum = 0;
        for (int i = n; i <= m; i++) {
            sum += i;
        }
        System.out.println(sum); //return sum;
    }
}