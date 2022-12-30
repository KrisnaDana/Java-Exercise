package tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        int x, y;

        x = 10;
        y = hitung(x);
        System.out.println(y);
    }

    public static int hitung(int input){
        int hasil;
        hasil = input*input;
        return hasil;
    }
}
