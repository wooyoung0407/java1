package org.example;

import org.example.system.controller.SystemController;
import org.example.wisesaying.controller.WiseSayingController;

import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        WiseSayingController wiseSayingController= new WiseSayingController(this.sc);
        SystemController systemController = new SystemController();

        while (true) {

            System.out.println("명언)");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                systemController.exit();
                break;
            } else if (command.equals("등록")) {
                wiseSayingController.write();
            } else if (command.equals("목록")) {
                wiseSayingController.list();
            } else if (command.equals("삭제")){

            }
        }
    }
}
