package tutorial;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Assignment

        int array[][] = {
            {1, 2, 3},
            {2, 3, 4}
        };

        System.out.println(Arrays.deepToString(array));

        //Deklarasi
        //int[baris][kolom]
        int array2[][] = new int[5][4];

        System.out.println(Arrays.deepToString(array2));

        for(int i= 0; i<array2.length; i++){
            System.out.println(Arrays.toString(array2[i]));
        }
    }
}
