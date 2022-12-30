package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan input = ");
        int input = userInput.nextInt();

        System.out.print("Masukkan indeks = ");
        int indeks = userInput.nextInt();

        rekursif(input, indeks);

    }

    private static void rekursif(int parameter, int indeks){
        System.out.println(parameter);

        parameter--;
        if(parameter == 0){
            return;
        }else{
            rekursif(parameter, indeks);

            indeks--;
            System.out.println(indeks);
        }
    }
}
