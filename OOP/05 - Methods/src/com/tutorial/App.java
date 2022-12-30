package com.tutorial;

class Mahasiswa {

    // Data Member
    String nama;
    String nim;

    // Constructor (nama harus sama dengan classnya)
    // Constructor sebenarnya adalah method yg dipanggil pertama kali saat
    // instansiasi objek
    Mahasiswa(String inputNama, String inputNim) {
        this.nama = inputNama; // this mengacu pada object yang dibuat dalam hal ini mahasiswa1
        this.nim = inputNim;
    }

    // object tanpa return dan tanpa parameter
    void show() {
        System.out.println(this.nama + ", " + this.nim);
    }

    // object tanpa return dengan parameter
    void setNama(String inputNama) {
        this.nama = inputNama;
    }

    void setNim(String inputNim) {
        this.nim = inputNim;
    }

    // object dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    // object dengan return dengan parameter
    String hai(String ucapan) {
        return ucapan + " " + this.nama;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "211");

        mahasiswa1.show();

        mahasiswa1.setNama("Mamat");

        mahasiswa1.setNim("911");

        System.out.println(mahasiswa1.hai("Hai"));
    }
}
