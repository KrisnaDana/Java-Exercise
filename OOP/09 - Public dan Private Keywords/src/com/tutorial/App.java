package com.tutorial;

class Player {
    String name; // Dapat diakses dan diubah dari luar class dan dalam class
    public String ability; // Dapat diakses dan diubah dari luar class dan dalam class
    private int level; // Hanya dapat diakses dan diubah dari dalam class saja

    Player(String name, String ability, int level) {
        this.name = name;
        this.ability = ability;
        this.level = level;
    }

    void setName(String name) { // Dapat diakses dan diubah dari luar class dan dalam class
        this.name = name;
    }

    public void setAbility(String ability) { // Dapat diakses dan diubah dari luar class dan dalam class
        this.ability = ability;
    }

    private void setLevel(int level) { // Hanya dapat diakses dan diubah dari dalam class saja
        this.level = level;
    }

    public void show() {
        this.setLevel(100);
        System.out.println("Name    : " + this.name);
        System.out.println("Ability : " + this.ability);
        System.out.println("Level   : " + this.level);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Bocil", "Pengaduan", 1);

        // VARIABEL
        // Default
        player1.name = "Babang";

        // Public
        player1.ability = "Mengalah";

        // Private
        // player1.level = 10;

        // METHOD
        // Default
        player1.setName("Mamok");

        // Public
        player1.setAbility("Mengtololkan diri");

        // Private
        // player1.setLevel(100);

        player1.show();
    }
}
