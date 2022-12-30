package tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        String nama = "Lort";
        int umur = 20;

        // conversion: f = floating point, d = integer, s = string
        // struktur format = %[argumen_index$][flags][width][.precision]conversion 

        // [argumen_indeks$]
        System.out.printf("Ini %1$s, kekuatannya %1$s sangad op, umurnya %2$d tahun", nama, umur);

        // [flags]
    }
}
