package tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        //char = ''
        //string = ""

        String kata1 = "Kata 1";

        System.out.println(kata1);
        System.out.println(kata1.charAt(3));
        //String di java immutable (tidak bisa dirubah komponennya)
        System.out.println(kata1.substring(0, 4));
        String kata2 = new String("Kata 1");
        System.out.println(kata2);
    }
}
