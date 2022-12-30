package tutorial;

import java.util.*;
import java.lang.String;

public class App {
    public static void main(String[] args) throws Exception {
        //Mengambil komponen
        String kalimat1 = "Test";
        System.out.println(kalimat1.charAt(1));

        //substring
        String kalimat2 = kalimat1.substring(0, 3);
        System.out.println(kalimat2);

        //Concat
        String kalimat3 = kalimat1 + " 100 kali";
        System.out.println(kalimat3);

        //Concat with non string
        int angka10 = 10;
        String kalimat4 = kalimat2 + "" + angka10;
        System.out.println(kalimat4);

        //Lowercase + Uppercase
        System.out.println(kalimat1.toUpperCase() + " " + kalimat1.toLowerCase());

        //Replace
        String kalimat5 = kalimat1.replace("Test", "Cek");
        System.out.println(kalimat5);

        //Equality (Persamaan)
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: ");
        String kataInput = userInput.next();

        if(kalimat1.equals(kataInput)){
            System.out.println("Sama");
        }else{
            System.out.println("Beda");
        }

        //Compare berdasarkan urutan alphabet
        String kalimat10 = "ABC";
        String kalimat11 = "BCD";

        System.out.println(kalimat10.compareTo(kalimat11));
    }
}
