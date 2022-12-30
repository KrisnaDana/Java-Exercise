package tutorial;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Mengcopy array

        int array1[] = {1, 2, 3, 4, 5};
        int array2[] = new int[5];

        //for loop
        for(int i=0; i<array1.length; i++){
            array2[i] = array1[i];
        }
        System.out.println("For Loop");
        System.out.println(Arrays.toString(array2));

        //copy of
        //Arrays.copyOf(nama_array, panjang_array_yang_dicopy_dari_indeks_0)
        int array3[] = Arrays.copyOf(array1, array1.length);
        System.out.println("\nArrays.copyOf()");
        System.out.println(Arrays.toString(array3));

        //copy of range
        //Arrays.copyOfRange(nama_array, array_indeks_awal, array_indeks_akhir)
        int array4[] = Arrays.copyOfRange(array1, 0, array1.length-2);
        System.out.println("\nArrays.copyOfRange()");
        System.out.println(Arrays.toString(array3));



        //Fill array

        //Arrays.fill(nama_array, nilai)
        int array5[] = new int[10];
        Arrays.fill(array5, 7);
        System.out.println("\nArrays.fill()");
        System.out.println(Arrays.toString(array5));


        //Komparasi array

        //Arrays.equals(nama_array_pertama, nama_array_kedua)
        //Membandingkan 2 buah array dengan hasil boolean
        int array6[] = {1, 2, 3, 4, 5};
        int array7[] = {1, 2, 3, 4, 6};
        System.out.println("\nArrays.equals()");
        System.out.println(Arrays.equals(array6, array7));

        //Arrays.compare(nama_array_pertama, nama_array_kedua)
        //Membandingkan array mana yg nilainya lebih besar
        //hasil 0 = array sama, hasil 1 = array pertama lebih besar, hasil -1 = array kedua lebih besar
        System.out.println("\nArrays.compare()");
        System.out.println(Arrays.compare(array6, array7));

        //Arrays.mismatch(nama_array_pertama, nama_array_kedua)
        //Membandingkan indeks yg berbeda
        //Hasilnya letak indeks yg berbeda
        System.out.println("\nArrays.mismatch()");
        System.out.println(Arrays.mismatch(array6, array7));



        //Sorting array
        int array8[] = {3,1,24,4,8,14,7,9};
        Arrays.sort(array8);
        System.out.println("\nArrays.sort");
        System.out.println(Arrays.toString(array8));


        //Search array
        //dengan binary search harus di sort dulu
        //Arrays.binarySearch(nama_array, nilai_yang_dicari)
        System.out.println("\nArrays.binarySearch");
        System.out.println(Arrays.binarySearch(array8, 4));
    }
}
