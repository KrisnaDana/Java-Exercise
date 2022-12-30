package tutorial;

import java.lang.StringBuilder;
import java.lang.String;

public class App {
    public static void main(String[] args) throws Exception {
        StringBuilder kata = new StringBuilder("bocil");

        System.out.println(kata);
        System.out.println(kata.capacity() + " " + kata.length());

        //append
        kata.append(" Pros");
        System.out.println(kata);

        //insert
        kata.insert(5, " Sangat");
        System.out.println(kata);

        //delete 
        kata.delete(0, 6);
        System.out.println(kata);

        //setCharAt
        kata.setCharAt(0, 's');
        System.out.println(kata);

        //replace
        kata.replace(0, 6, "Terlalu");
        System.out.println(kata);

        //to String
        String katastring = kata.toString();
        System.out.println(katastring);
    }
}
