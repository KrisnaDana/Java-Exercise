package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int panjang, lebar, luas;
        Scanner userInput1 = new Scanner(System.in); //Buat objek input

        System.out.print("Masukkan panjang = ");
        panjang = userInput1.nextInt(); //manggil objek input sekaligus menampung nilai

        System.out.print("Masukkan lebar = ");
        lebar = userInput1.nextInt(); //manggil objek input sekaligus menampung nilai

        luas = panjang*lebar;

        System.out.println("Luas persegi = " + luas);
    }
}
