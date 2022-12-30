package tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        //bisa buat array dengan format
        //tipe data nama[] = {komponen-komponen};
        //int array[] = {1,2,3,4};

        int[] array = {1, 2, 3, 4, 5};

        //looping dengan properti array yakni length
        //length adalah jumlah isi dari array atau panjang array
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println();

        //Looping dengan for each untuk array atau collection
        //variabel diisi dengan data dari array setiap loopnya
        for(int tes : array){
            System.out.println(tes);
        }
    }
}
