package tutorial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception { //throws exceptions melempar exception pada fungsi yang memanggil pada fungsi ini. Karena gk ada yg manggil fungsi ini maka akan kelempar ke jvm (compiler)
        int array[] = {1, 2, 3, 4, 5};
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan index array: ");
        int input = userInput.nextInt();

        try{
            int data = ambilData(array, input);
        }catch(Exception e){
            System.err.println(e);
        }
    }

    private static int ambilData(int array[], int input) throws Exception{ // ngelempar exception pada fungsi yg manggilnya, sehingga fungsi yg manggil wajib pake try catch
        // karena pakai throws exception, jadi disini aman gk perlu panggil try catch
        int hasil = array[input];
        return hasil;
    }
}
