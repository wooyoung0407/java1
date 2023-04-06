package org.example.wisesaying.controller;

import org.example.Container;
import org.example.wisesaying.entitity.WiseSaying;

import java.util.ArrayList;
import java.util.Scanner;

public class WiseSayingController {
    private int number;

    private ArrayList<WiseSaying> wiseSayings;

    public WiseSayingController() {
        this.number = 1;
        this.wiseSayings = new ArrayList<>();
    }

    public void write() {
        System.out.println("명언 : ");
        String content = Container.getScanner().nextLine().trim();
        System.out.println("작가 : ");
        String name = Container.getScanner().nextLine().trim();

        WiseSaying wiseSaying = new WiseSaying(number, name, content);
        System.out.println(number + "번 명언이 등록되었습니다.\n");
        wiseSayings.add(wiseSaying);
        number++;
    }

    public void list() {
        System.out.println("명언 수 : " + wiseSayings.size());
        System.out.println("번호 / 작가 / 명언");
        System.out.println("=".repeat(30));

        for (int i = 0; i < wiseSayings.size(); i++) { // int i = wiseSayings.size() -1; i>=0;i-- (최신순목록)
            WiseSaying wiseSaying = wiseSayings.get(i);

            System.out.printf("%d / %s / %s\n", wiseSaying.getNumber(), wiseSaying.getName(), wiseSaying.getContent());
        }
    }
}