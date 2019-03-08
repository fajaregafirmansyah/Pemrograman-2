package tugas09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class BookActivity {
    
    public static void TambahBuku() {
        try (FileOutputStream file = new FileOutputStream("addressbook.dat", true)) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukan Nama : ");
            String nama = input.nextLine() + "\t";

            System.out.print("Masukan Alamat: ");
            String alamat = input.nextLine() + "\t";

            System.out.print("Masukan Telepon: ");
            String hp = input.nextLine() + "\t";

            System.out.print("Masukan Email: ");
            String email = input.nextLine() + "\n";

            file.write(nama.getBytes());
            file.write(alamat.getBytes());
            file.write(hp.getBytes());
            file.write(email.getBytes());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner inputmenu = new Scanner(System.in);
      
        do {
            System.out.println("==================================");
            System.out.println("Selamat Datang Di Program I/O Buku");
            System.out.println("==================================");
            System.out.println("");
            System.out.println("1 Tambah Data Buku");
            System.out.println("2 Tampilkan Data Buku ");
            System.out.println("3 Keluar Aplikasi");
            System.out.println("");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = inputmenu.nextInt();
            switch (pilihan) {
                case 1:
                    TambahBuku();
                    break;
                case 2:
                    BukaBuku();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ops, Angka yang Kamu pilih tidak ada!");
                    break;
            }
            System.out.println();
            System.out.println();
        } while (true);
    }

    public static void BukaBuku() throws IOException {
        try (FileInputStream i = new FileInputStream("addressbook.dat")) {

            int data;

            while ((data = i.read()) != -1) {
                System.out.print((char) data);
            }

            i.close();
        } catch (FileNotFoundException e) {
            System.out.println("Belum ada Buku Alamat");
        }
    }

}
