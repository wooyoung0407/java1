package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner 세팅

        new App(sc).run();

        sc.close(); //Scanner 종료
    }
}