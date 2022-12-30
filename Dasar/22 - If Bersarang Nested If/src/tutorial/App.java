package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        int input;

        System.out.print("Masukkan Nilai = ");
        input = userInput.nextInt();

        if(input < 0){
            if(input == 0){
                System.out.println("Nilainya 0");
            }else{
                System.out.println("Nilainya Negatif");
            }
        }else{
            if(input == 0){
                System.out.println("Nilainya 0");
            }else{
                System.out.println("Nilainya Positif");
            }
        }
    }
}
