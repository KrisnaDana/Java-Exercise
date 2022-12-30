package tutorial;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Array di java dapat berbeda beda panjangnya
        //Karena di anggap sebagai objek

        int array[][] = {
            {1, 2, 3, 4, 5},
            {6, 7, 8},
            {9}
        };

        System.out.println(Arrays.deepToString(array));

        int array1[] = new int[3];
        int array2[] = new int[4];

        //Penulisan bisa gini juga
        int arrays[][] = {
            array1,
            array2
        };

        System.out.println(Arrays.deepToString(arrays));
    }
}
