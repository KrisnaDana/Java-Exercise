package com.tutorial;

public class Player {
    private String name;
    private static int count;

    Player() {
        this.name = "Player";
        addCount();
    }

    Player(String name) {
        this.name = name;
        addCount();
    }

    private static void addCount() {
        Player.count++;
    }

    public static void showCount() {
        System.out.println(Player.count);
    }

    public void showName() {
        System.out.println(this.name);
    }

}
