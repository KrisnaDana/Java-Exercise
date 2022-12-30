package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = userInput.nextInt();

        int fibonacci = fibonacci(n);

        System.out.println("Nilai fibonacci ke-" + n + " adalah " + fibonacci);
    }

    private static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
