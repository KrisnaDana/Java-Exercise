package tutorial;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        int array[] = {1, 2, 3, 4, 5};
        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;

        //Exception handling (try, catch, finally)

        System.out.print("Pilih index array: ");
        int index = userInput.nextInt();
        try{ //coba lakukan ini
            System.err.printf("index: %d, Nilai Array %d", index, array[index]);
        }catch(Exception e){ //klo muncul exception, ambil exceptionnya abistu lakukan dibawah ini
            System.err.printf("%s", e);
        }

        //Menggabungkan 2 exception
        try{ //coba lakukan ini
            System.out.printf("index: %d, Nilai Array: %d\n", index, array[index]);
            fileInput = new FileInputStream("index.txt");
        }catch(ArrayIndexOutOfBoundsException e){ //exception array index melebihi isi array
            System.err.println("Index tidak terdapat pada array");
        }catch(IOException e){
            System.err.println("File tidak ditemukan");
        }

        // Menambahkan finally
        try{ //coba lakukan ini
            System.err.printf("index: %d, Nilai Array %d", index, array[index]);
        }catch(Exception e){ //klo muncul exception, ambil exceptionnya abistu lakukan dibawah ini
            System.err.printf("%s", e);
        }finally{ // Finally dijalankan setelah try dan catch dijalankan (meskipun catchnya tidak jalan). Contoh penggunaannya saat membuka sesi file maka sesi filenya perlu di close di finally
            System.out.println("Input index yang benar");
        }
    }
}
