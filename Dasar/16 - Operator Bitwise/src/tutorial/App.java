package tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Operator Bitwise \n");

        //Operator Bitwise -> Operator untuk melakukan operasi pada nilai bit

        byte a = 120;
        String a_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

        System.out.println("Operator bitwise");
        int  b = 10;
        b = (b>>3);
        System.out.println("b = " + b);
    }
}
