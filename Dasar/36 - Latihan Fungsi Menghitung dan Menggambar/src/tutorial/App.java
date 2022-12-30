package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas;

        System.out.print("Masukkan Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Masukkan Lebar = ");
        lebar = userInput.nextInt();

        System.out.print("\n");
        gambar(panjang, lebar);

        System.out.print("\n");
        luas = luas(panjang, lebar);
        System.out.println("Luas = " + luas);

        keliling(panjang, lebar);

    }

    private static void gambar(int panjang, int lebar){
        for(int i = 0; i<lebar; i++){
            for(int j = 0; j<panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static int luas(int panjang, int lebar){
        int hasil;

        hasil = panjang * lebar;
        
        return hasil;
    }

    private static void keliling(int panjang, int lebar){
        int hasil;

        hasil = (panjang*2) + (lebar*2);
        System.out.println("Keliling = " + hasil);
    }
}
