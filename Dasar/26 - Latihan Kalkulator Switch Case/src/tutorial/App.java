package tutorial;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        float a, b, hasil;
        String operator;

        System.out.print("Masukkan Nilai Pertama = ");
        a = userInput.nextFloat();
        System.out.print("Masukkan Operator = ");
        operator = userInput.next();
        System.out.print("Masukkan Nilai Kedua = ");
        b = userInput.nextFloat();

        switch(operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
                break;
            case "/":
                if(b == 0){
                    System.out.println("Tidak Bisa Dibagi Dengan 0");
                    break;
                }else{
                    hasil = a / b;
                    System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
                    break;
                }
            default:
                System.out.println("Operator Tidak Ditemukan");
        }
    }
}
