package soal1_uts;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class IterasiActivity {

    public static void main(String[] args) {
        System.out.println("Fajar Ega Firmansyah");
        System.out.println("Sistem Informasi");
        System.out.println("1841411");
        System.out.println("");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i + " : Belajar java menyenangkan");
            } else if (i % 3 == 0) {
                System.out.println(i + " : Belajar");
            } else if (i % 7 == 0) {
                System.out.println(i + " : Java");
            } else {
                System.out.println(i + " : -");
            }
        }
    }

}
