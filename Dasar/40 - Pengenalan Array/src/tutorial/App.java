package tutorial;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Assignment array
        //tipe data[] nama = {komponen-komponen};

        int[] bocil = {1, 2, 3, 4};
        for(int i=0;i<4;i++){
            System.out.println(bocil[i]);
        }
        System.out.println();

        //Deklarasi array
        //array termasuk objek
        //tipe data[] nama = new tipedata[];
        //jumlah data pada array tetap flebsibel namun diisi data 0 dengan jumlah tertentu

        float[] bocah = new float[2];
        for(int i=0;i<2;i++){
            System.out.println(bocah[i]);
        }
        System.out.println();

        //Bisa menampilkan semua isi array dalam wujud string dengan method Arrays.toString(nama array)
        //terlebih dahulu import java.util.Arrays

        System.out.println(Arrays.toString(bocah));
        System.out.println(Arrays.toString(bocil));
    }
}
