package tutorial;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //Hati hati mengcopy array karena akan merujuk pada alamat yg sama

        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];

        array2 = array1;
        //Hal ini akan mengubah alamat atau address memory dari array2 ke array1
        //Jika merubah data pada array2 maka array1 akan kerubah juga datanya

        System.out.println(Arrays.toString(array2));

        ubah(array1);
        //Hal ini juga berlaku pada fungsi yakni dengan istilah pass by reference
        //Bukan pass by value
    }

    private static void ubah(int[] array3){
        int[] array4 = new int[5];

        array4 = array3;
        System.out.println(Arrays.toString(array4));
    }
}
