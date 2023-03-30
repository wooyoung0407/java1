package org.example;

import java.util.*;

public class Main {
    private static int sc;

    public static void main(String[] args) {
        new Sol1().run();
    }
}

class Sol1{

    public void run(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.printf("숫자를 입력해주세요(-1 : 종료) : ");
            int num = sc.nextInt();
            numbers.add(num);
            Collections.sort(numbers);

            if (num == -1) {
                System.out.println("입력을 종료합니다.");
                numbers.remove(0);
                System.out.println("입력한 숫자(오름차순) : " + numbers);
                break;
            }
        }
        sc.close();
    }
}