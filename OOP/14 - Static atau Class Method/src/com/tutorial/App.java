package com.tutorial;

import java.util.ArrayList;

class Player {
    private static int numberPlayer = 0;
    private static ArrayList<String> NamaPlayer = new ArrayList<String>();
    // ArrrayList<Tipe data> namaVariabel = new ArrayList<Tipe Data>();
    // Biar lebih gampang dan bebas buat naruh valuenya tanpa pakai index

    private String name;

    Player(String name) {
        this.name = name;
        addNumberPlayer();
        addNamePlayer(name);
    }

    private static void addNumberPlayer() {
        Player.numberPlayer++;
    }

    private static void addNamePlayer(String name) {
        NamaPlayer.add(name);
    }

    public static void showAllName() {
        System.out.println(Player.NamaPlayer);
    }

    public static void showNumberPlayer() {
        System.out.println(Player.numberPlayer);
    }

    public void showName() {
        System.out.println(this.name);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Pino");
        Player player2 = new Player("Coki");
        Player player3 = new Player("Boby");

        player1.showName();
        player2.showName();
        player3.showName();
        System.out.println("");

        // Method static buat nandain nempel ke classnya jadi biar gk bingung method
        // object atau method class
        Player.showNumberPlayer();
        Player.showAllName();
    }
}
