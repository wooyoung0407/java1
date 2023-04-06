package org.example.wisesaying.entitity;

public class WiseSaying {
    private int number;
    private String name;
    private String content;

    public WiseSaying(int number, String name, String content){
        this.number = number;
        this.name = name;
        this.content = content;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getContent() {
        return this.content;
    }
}
