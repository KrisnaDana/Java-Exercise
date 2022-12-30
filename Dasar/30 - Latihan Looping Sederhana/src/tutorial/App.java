package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int i;
        int total=0;
        int panjang;
        int awal;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai Awal = ");
        awal = inputUser.nextInt();
        System.out.print("Masukkan Rentang = ");
        panjang = inputUser.nextInt();

        for(i=0;i<panjang;i++){
            total=total+awal;
            awal++;
        }

        System.out.println("Total = " + total);
    }
}
