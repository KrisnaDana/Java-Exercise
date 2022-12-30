package com.tutorial;

class Print {
    // static merupakan class variable yang nempel pada class
    // nilai static nilainya sama pada setiap kelas
    static int angka = 0;

    public void setAngka(int angka) {
        Print.angka = angka;// Cara yang direkomendiasikan dengan nyebut classnya dulu
    }

    public void getAngka() {
        System.out.println(Print.angka);
    }

}

public class App {
    public static void main(String[] args) throws Exception {
        Print print1 = new Print();
        Print print2 = new Print();
        Print print3 = new Print();

        print1.getAngka();
        print2.getAngka();
        print3.getAngka();
        System.out.println("");
        print1.setAngka(1);

        print1.getAngka();
        print2.getAngka();
        print3.getAngka();

    }
}
