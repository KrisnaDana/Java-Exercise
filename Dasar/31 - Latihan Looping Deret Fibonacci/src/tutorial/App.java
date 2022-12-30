package tutorial;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        int n;
        int hasil;
        int a = 0;
        int b = 1;

        System.out.print("Masukkan Nilai Ke-n = ");
        n = userInput.nextInt();

        if(n==0){
            System.out.println("n tidak boleh 0");
        }else{
            for(int i = 0; i < n; i++){
                if(i==0){
                    hasil = 0;
                    System.out.print(hasil);
                }else if(i==1){
                    hasil = 1;
                    System.out.print(", " + hasil);
                }else{
                    hasil = a + b;
                    a = b;
                    b = hasil;
                    System.out.print(", " + hasil);
                }
            }
        }
        
    }
}
