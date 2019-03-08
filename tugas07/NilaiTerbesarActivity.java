package tugas07;

import java.util.Scanner;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class NilaiTerbesarActivity {

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("=======================================================");
        System.out.println("Selamat Datang Di Program menentukan bilangan terbesar");
        System.out.println("======================================================");
        System.out.println("");

        int jml_data = 8;
        Scanner input;
        input = new Scanner(System.in);

        int data[] = new int[jml_data];
        System.out.println("");
        System.out.print("Masukkan 8 buah bilangan. Contoh (1 2 3 ... n sampai 8x) : ");

        for (int i = 0; i < jml_data; i++) {
            data[i] = input.nextInt();
        }

        input.close();

        for (int x = 0; x < jml_data - 1; x++) {
            for (int i = 0; i < jml_data - 1; i++) {
                if (data[i] < data[i + 1]) {
                    int j = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = j;
                }
            }
        }
        System.out.println("");
        System.out.println("Hasil 3 bilangan terbesar : ");
        System.out.print(data[0] + "," + data[1] + "," + data[2]);
        System.out.println("");
    }
}
