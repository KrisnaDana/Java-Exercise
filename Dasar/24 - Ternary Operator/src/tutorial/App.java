package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ternary operator adalah metode untuk mempersingkat if statement
        int input, hasil;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan Nilai = ");
        input = userInput.nextInt();

        //variable = ekspresi ? statement_true : statement_false;

        hasil = (input == 1) ? (input + 9) : (input - 1);
        System.out.println(hasil);

    }
}
