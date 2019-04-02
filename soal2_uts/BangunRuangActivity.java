package soal2_uts;

import java.util.Scanner;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class BangunRuangActivity {

    public static void main(String[] args) {
        // TODO code application logic here
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Program Menghitung Luas Permukaan dan Volume Bangun Ruang");
            System.out.println("=========================================================");
            System.out.println("Pilih (pilih 0 untuk keluar)");
            System.out.println("1. kubus");
            System.out.println("2. bola");
            System.out.println("3. kerucut");
            System.out.print("pilihan anda? ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("");
                    System.out.print("Masukan Sisi ");
                    double sisi = sc.nextDouble();
                    Kubus kubus = new Kubus(sisi);
                    System.out.println("Nilai luas permukaan dan volume kubus dengan sisi " + sisi + " cm adalah :");
                    System.out.println("Luas Permukaan kubus : " + kubus.hitungLuasPermukaan() + " cm kuadrat");
                    System.out.println("Volume kubus : " + kubus.hitungVolume() + " cm kubik");
                    break;
                case 2: {
                    System.out.println("");
                    System.out.println("Masukan radius");
                    double radius = sc.nextDouble();
                    Bola bola = new Bola(radius);
                    System.out.println("Nilai luas permukaan dan volume bola dengan radius " + radius + " cm adalah :");
                    System.out.println("Luas Permukaan bola : " + bola.hitungLuasPermukaan() + "cm kuadrat");
                    System.out.println("Volume bola : " + bola.hitungVolume() + " cm kubik");
                    break;
                }
                case 3: {
                    System.out.println("");
                    System.out.println("Masukan radius");
                    double radius = sc.nextDouble();
                    System.out.println("Masukan tinggi");
                    double tinggi = sc.nextDouble();
                    Kerucut kerucut = new Kerucut(radius, tinggi);
                    System.out.println("Nilai luas permukaan dan volume bola dengan radius " + radius + " cm dan tinggi " + tinggi + " adalah :");
                    System.out.println("Luas Permukaan bola : " + kerucut.hitungLuasPermukaan() + "cm kuadrat");
                    System.out.println("Volume bola : " + kerucut.hitungVolume() + " cm kubik");
                    break;
                }
                case 0:
                    System.exit(0);
                default:
                    break;
            }
        } while (true);

    }

}
