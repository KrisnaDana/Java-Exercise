package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputUser = new Scanner(System.in);
        int input;
        int tebakan = 6;
        boolean status;

        System.out.print("Masukkan Input = ");
        input = inputUser.nextInt();
        status = input == tebakan;
        System.out.println("Hasil = " + status + "\n");

        System.out.print("Masukkan Input = ");
        input = inputUser.nextInt();
        status = input > 0 && input < 10;
        System.out.println("Hasil = " + status);

    }
}
