package com.tutorial;

class Persegi {
    private int sisi;

    Persegi() {
        this.sisi = 0;
    }

    // setter
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    // Getter
    public int getLuas() {
        return this.sisi * this.sisi;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Persegi persegi1 = new Persegi();

        persegi1.setSisi(7);
        System.out.println(persegi1.getLuas());
    }
}
