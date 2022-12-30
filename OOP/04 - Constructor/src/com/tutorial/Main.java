package com.tutorial;

class Mahasiswa {
    String nama;
    String jurusan;
    double ipk;

    // constructor harus sama namanya dengan classnya
    // constructor dijalankan pertama kali saat instansiasi
    Mahasiswa(String inputNama, String inputJurusan, double inputIpk) {
        nama = inputNama;
        jurusan = inputJurusan;
        ipk = inputIpk;

        System.out.println(nama);
        System.out.println(jurusan);
        System.out.println(ipk);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        // instansiasi
        Mahasiswa mahasiswa1 = new Mahasiswa("Mamat", "Perteknikan", 4.0);
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", "Perteknikan", 3.5);
    }
}
