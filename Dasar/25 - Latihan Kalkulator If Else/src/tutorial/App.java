package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputUser = new Scanner(System.in);
        float a, b, hasil;
        char operator;


        System.out.print("Masukkan Nilai Pertama = ");
        a = inputUser.nextFloat();
        System.out.print("Masukkan Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Masukkan Nilai Kedua = ");
        b = inputUser.nextFloat();

        if(operator == '+'){
            hasil = a + b;
            System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
        }else if(operator == '-'){
            hasil = a - b;
            System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
        }else if(operator == '*'){
            hasil = a * b;
            System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
        }else if(operator == '/'){
            if(b == 0){
                System.out.println("Tidak Bisa Dibagi Dengan 0");
            }else{
                hasil = a / b;
                System.out.println("Hasil " + a + " " + operator + " " + b + " = " + hasil);
            }
        }else{
            System.out.println("Operator Tidak Ditemukan");
        }
    }
}
 