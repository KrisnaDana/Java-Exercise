package com.tutorial;

class Mahasiswa {
    String nama;
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa(); // Instaniasi object atau mengcopy classnya
        Mahasiswa mahasiswa2 = mahasiswa1; // Tidak bisa mengcopy object seperti ini, akan menggunakan referensi dari
                                           // mahasiswa1. Kasus mirip string
    }
}
