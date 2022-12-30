package com.tutorial;

class Hero {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println(this.name);
    }
}

class Assasin extends Hero {

    public void showName() {
        System.out.println("Nama hero ini adalah: " + this.name);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // Overriding adalah menimpa nama method sama pada subclass ke superclass
        // Jadi yang dipanggil duluan adalah pada subclass tersebut, jika tidak ada
        // Baru dipanggil yang dari super class

        Assasin gossen = new Assasin();
        gossen.setName("Gossen");
        gossen.showName();
    }
}
