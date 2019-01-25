package tugas2;

import java.util.Scanner;

public class HitungRata {

    public static void main(String[] args) {
        double nilaiRata;
        String smileyFace;

        System.out.println("==================================");
        System.out.println("Program menghitung nilai rata-rata");
        System.out.println("==================================");
        System.out.println("");

        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian ke-1 : ");
        int nilai1 = inputan.nextInt();

        System.out.print("Masukkan nilai ujian ke-2 : ");
        int nilai2 = inputan.nextInt();

        System.out.print("Masukkan nilai ujian ke-3 : ");
        int nilai3 = inputan.nextInt();

        nilaiRata = (nilai1 + nilai2 + nilai3) / 3;

        if (nilaiRata >= 60) {
            smileyFace = ":-)";
        } else {
            smileyFace = ":-(";
        }

        System.out.println("Hasil nilai rata-rata : " + nilaiRata + " " + smileyFace);
        
    }

}
