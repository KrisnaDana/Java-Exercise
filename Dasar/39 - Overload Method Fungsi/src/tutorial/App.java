package tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        //Overload memungkinkan untuk memakai 1 fungsi / method dengan nama yg sama 
        //namun dengan tipe data dan argument dengan tipe data dan jumlah yg berbeda

        int a=10;
        float b=20.5f;
        double c = 12.7d;

        tes(a, b);
        tes(b, a, c);


    }

    private static void tes(int n, float m){
        System.out.println("n = " + n + ", m = " + m);
    }

    private static float tes(float n, int m, double o){
        System.out.println("n = " + n + ", m = " + m + ", o = " + o);

        return n + m;
        //operasi float dengan int menghasilkan hasil float;
    }
}
