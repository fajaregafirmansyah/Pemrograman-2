package tugas2;

import java.util.Scanner;

public class HitungNilai {

    public static void main(String[] args) {

        char nilai;
        char nilai2;
        String hasil;
        String hasil2;

        System.out.println("=====================================================");
        System.out.println("Program menghitung nilai mahasiswa menggunakan switch");
        System.out.println("=====================================================");
        System.out.println("");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nilai (A,B,C,D,E) : ");
        nilai = input.next().charAt(0);

        switch (nilai) {
            case 'A':
                hasil = "Excellent";
                break;
            case 'B':
                hasil = "Good job!";
                break;
            case 'C':
                hasil = "Study harder!";
                break;
            default:
                hasil = "Sorry, you failed.";
        }

        System.out.println("Anda mendapatkan nilai " + nilai + " maka " + hasil);
        System.out.println("");
        System.out.println("");

        System.out.println("=================================================");
        System.out.println("Program menghitung nilai mahasiswa menggunakan if");
        System.out.println("=================================================");
        System.out.println("");

        System.out.print("Masukkan Nilai (A,B,C,D,E) : ");
        nilai2 = input.next().charAt(0);

        if (nilai2 == 'A') {
            hasil2 = "Excellent";
        } else if (nilai2 == 'B') {
            hasil2 = "Good job!";
        } else if (nilai2 == 'C') {
            hasil2 = "Study harder!";
        } else {
            hasil2 = "Sorry, you failed.";
        }

        System.out.println("Anda mendapatkan nilai " + nilai2 + " maka " + hasil2);
        System.out.println("");
        System.out.println("");
    }

}
