package tugas04;

import java.util.ArrayList;
import java.util.Scanner;

public class BukuAlamatActivity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean mainkan = true;
        ArrayList<EntryBukuAlamat> buku = new ArrayList<>();

        while (mainkan) {

            System.out.println("====================================");
            System.out.println("Selamat Datang Di Menu Buku Alamat");
            System.out.println("====================================");

            System.out.println("1. Tambah Data");
            System.out.println("2. Edit Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Keluar aplikasi");
            System.out.print("\nPilih Menu (1/2/3/4/5) : ");

            int pilihan;
            try {
                pilihan = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException nfe) {
                pilihan = 0;
            }

            input = new Scanner(System.in);

            switch (pilihan) {
                case 1:
                    System.out.println("\nMenu Tambah Data");
                    Boolean inputlagi = true;
                    while (inputlagi) {
                        EntryBukuAlamat entri = new EntryBukuAlamat();

                        System.out.print("Masukkan Nama         : ");
                        String nama = input.nextLine();
                        entri.setNama(nama);

                        System.out.print("Masukkan Alamat       : ");
                        String alamat = input.nextLine();
                        entri.setAlamat(alamat);

                        System.out.print("Masukkan No. Telepon  : ");
                        String nomortelepon = input.nextLine();
                        entri.setNomorTelepon(nomortelepon);

                        System.out.print("Masukkan Email        : ");
                        String email = input.nextLine();
                        entri.setEmail(email);

                        buku.add(entri);

                        System.out.print("Masukkan lagi data nggak ? (Y/T) : ");
                        String terus = input.nextLine().toUpperCase();

                        if (!terus.equals("Y")) {
                            inputlagi = false;
                        }
                    }

                    break;
                case 2:
                    System.out.println("\nMenu Update Data");
                    System.out.println("\n===============================================================================================================");
                    System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
                    System.out.println("===============================================================================================================");
                    for (int i = 0; i < buku.size(); i++) {
                        EntryBukuAlamat a = buku.get(i);
                        System.out.print((i + 1) + "\t");
                        a.printRow();
                    }
                    System.out.print("\nMasukkan nomor entri yang ingin diubah : ");

                    int nomoredit;
                    try {
                        nomoredit = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException nfe) {
                        nomoredit = 0;
                    }

                    try {
                        if (nomoredit > 0) {
                            EntryBukuAlamat a = buku.get(nomoredit - 1);
                            Boolean selesai = false;
                            while (!selesai) {
                                a.printDetail();
                                System.out.println("\nMau apa yang ingin diubah?");
                                System.out.println("1. Nama");
                                System.out.println("2. Alamat");
                                System.out.println("3. Nomor Telepon");
                                System.out.println("4. Email");
                                System.out.println("5. Selesai");
                                System.out.print("\nPilih (1/2/3/4/5) : ");

                                int pilihedit;
                                try {
                                    pilihedit = Integer.parseInt(input.nextLine());
                                } catch (NumberFormatException nfe) {
                                    pilihedit = 0;
                                }

                                switch (pilihedit) {
                                    case 1:
                                        System.out.print("Masukkan nama baru : ");
                                        a.setNama(input.nextLine());
                                        break;
                                    case 2:
                                        System.out.print("Masukkan alamat baru : ");
                                        a.setAlamat(input.nextLine());
                                        break;
                                    case 3:
                                        System.out.print("Masukkan nomor telepon baru : ");
                                        a.setNomorTelepon(input.nextLine());
                                        break;
                                    case 4:
                                        System.out.print("Masukkan alamat baru : ");
                                        a.setEmail(input.nextLine());
                                        break;
                                    case 5:
                                        System.out.println("\nSelesai mengubah entri.");
                                        selesai = true;
                                        break;
                                    default:
                                        System.out.println("\nMasukkan angka pada menu.");
                                        break;
                                }
                            }
                        } else {
                            System.out.println("\nTidak ditemukan nomor tersebut pada entri. Cari lagi yaa yang bener");
                        }
                    } catch (Exception e) {
                        System.out.println("\nTidak ditemukan nomor tersebut pada entri. Cari lagi yaa yang bener");
                    }

                    break;
                case 3:
                    System.out.println("\nMenu Hapus Data");
                    System.out.println("\n===============================================================================================================");
                    System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
                    System.out.println("===============================================================================================================");
                    for (int i = 0; i < buku.size(); i++) {
                        EntryBukuAlamat a = buku.get(i);
                        System.out.print((i + 1) + "\t");
                        a.printRow();
                    }
                    System.out.print("Masukkan nomor entri yang ingin dihapus : ");

                    int nomorhapus;
                    try {
                        nomorhapus = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException nfe) {
                        nomorhapus = 0;
                    }

                    try {
                        if (nomorhapus > 0) {
                            buku.remove(nomorhapus - 1);
                            System.out.println("\nData telah terhapus");
                        } else {
                            System.out.println("\nTidak ada nomor tersebut pada entri");
                        }
                    } catch (Exception e) {
                        System.out.println("\nTidak ada nomor tersebut pada entri");
                    }

                    break;
                case 4:
                    System.out.println("===============================================================================================================");
                    System.out.println("No \t Nama \t\t\t Alamat \t\t\t No. Telepon \t\t Email");
                    System.out.println("===============================================================================================================");
                    for (int i = 0; i < buku.size(); i++) {
                        EntryBukuAlamat a = buku.get(i);
                        System.out.print((i + 1) + "\t");
                        a.printRow();
                    }
                    break;
                case 5:
                    mainkan = false;
                    break;
                default:
                    System.out.println("\nMasukkan angka yang hanya ada pada menu ya!");
                    break;
            }
        }

    }

}
