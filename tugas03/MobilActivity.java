package tugas03;

import java.util.Scanner;

public class MobilActivity {

    public static Boolean jalan = true;
    private static int memilih;
    private static int gigi;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mobil aktivitasMobil = new Mobil(false, 0, 180, 5, 0);
        aktivitasMobil.setKecepatanMaksimum(280);

        while (jalan) {
            System.out.println("====================================");
            System.out.println("Selamat Datang Di Menu Mobil Alphard");
            System.out.println("====================================");

            System.out.println("1. Starter Mobil Alphard");
            System.out.println("2. Stop Mobil Alphard");
            System.out.println("3. Rem Mobil Alphard");
            System.out.println("4. Ganti Gigi Mobil Alphard");
            System.out.println("5. Gas Mobil Alphard");
            System.out.println("6. Keluar Menu Mobil Alphard");

            System.out.print("\nPilihan kamu : ");
            try {
                memilih = input.nextInt();
            } catch (Exception e) {
                memilih = 0;
                jalan = false;
            }

            switch (memilih) {
                case 1:
                    aktivitasMobil.start();
                    break;
                case 2:
                    aktivitasMobil.stop();
                    break;
                case 3:
                    aktivitasMobil.rem();
                    break;
                case 4:
                    System.out.print("Mobil Alphard Ganti ke gigi (1/2/3/4/5) : ");
                    try {
                        gigi = input.nextInt();
                        if (gigi >= 0 && gigi <= 5) {
                            aktivitasMobil.gantiGigi(gigi);
                        }
                    } catch (NumberFormatException nfe) {
                        System.out.println("Ops, Kamu salah masukkan gigi. Masukkan gigi angka 1 sampai dengan 5 ya!");
                    }
                    break;
                case 5:
                    aktivitasMobil.gas();
                    break;
                case 6:
                    jalan = false;
                    break;
                default:
                    System.out.println("Ops, Kamu salah masukkan pilihan. Masukkan hanya angka 1 sampai dengan 6 yaa. Silahkan coba lagi!\n");
                    break;

            }

        }

    }

}
