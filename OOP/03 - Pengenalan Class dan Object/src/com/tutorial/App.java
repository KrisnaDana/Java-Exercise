package com.tutorial;

//Class = loyang, object = kue

//membuat class
class Mahasiswa {
    String nama;
    String NIM;
    double IPK;
}

public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi atau membuat objek dari class Mahasiswa
        // Classnya bisa digunakan menjadi banyak objek
        // Tipe_data nama_object = new nama_class();

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ucup";
        mahasiswa1.NIM = "20005551000";
        mahasiswa1.IPK = 4.0;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.IPK);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Mamat";
        mahasiswa2.NIM = "20005551900";
        mahasiswa2.IPK = 3.5;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.IPK);

    }
}
