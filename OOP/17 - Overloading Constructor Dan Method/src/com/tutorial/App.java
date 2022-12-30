package com.tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        // method nama sama namun memiliki fungsionalitas dan parameter berbeda

        // Overloading Constructor
        Player player1 = new Player("Broto");
        Player player2 = new Player();
        Player player3 = new Player("Alufeed");

        player1.showName();
        player2.showName();
        player3.showName();

        Player.showCount();
        System.out.println();

        // Overloading Method
        Matematika matematika = new Matematika();
        int a = matematika.tambah(20, 20);
        System.out.println(a);

        double b = matematika.tambah(20.5, 20f);
        System.out.println(b);

    }
}
