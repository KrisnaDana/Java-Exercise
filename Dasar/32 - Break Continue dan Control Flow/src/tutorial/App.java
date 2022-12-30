package tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 0;

        while(true){
            a++;
            if(a==10){
                break; //perintah untuk memaksa keluar dari looping
            }else if(a==8){
                continue; //perintah untuk memulai dari atas pada dalam looping (jadi dibawahnya di skip)
            }
            System.out.println(a);
        }

        return; //Program Java Berhenti karena bertemu kembali dengan fungsi main
        //System.out.println("Program Selesai");
    }
}
