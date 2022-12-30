package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        String input;

        System.out.print("Masukkan Nama = ");
        input = userInput.next();

        switch(input){
            case "bocil":
                System.out.println("Ini bocil");
                break;
            default:
                System.out.println("Ini Bukan bocil");
        }
    }
}
