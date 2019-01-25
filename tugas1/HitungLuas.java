package tugas1;

import java.util.Scanner;

public class HitungLuas {

    public static void luasPersegiPanjang() {
        int panjang;
        int lebar;
        int luas;
        Scanner masukkan = new Scanner(System.in);

        System.out.print("Masukan panjang(cm) : ");
        panjang = masukkan.nextInt();

        System.out.print("Masukan Lebar(cm)   : ");
        lebar = masukkan.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas dari persegi panjang dari panjang " + panjang + " cm dan lebar " + lebar + " cm adalah " + luas);
        System.out.println("");
    }

    public static void luasLingkaran() {
        double jariJari;
        double luas;
        Scanner masukkan = new Scanner(System.in);
        
        System.out.print("Masukan jari-jari(cm) : ");
        jariJari = masukkan.nextInt();

        luas = 2 * jariJari * 3.14;

        System.out.print("Luas lingkaran dari jari-jari " + jariJari + " adalah " + luas);
        System.out.println("");
    }

    public static void main(String[] args) {

        System.out.println("==========================================================");
        System.out.println("Program menghitung luas persegi panjang dan luas lingkaran");
        System.out.println("==========================================================");
        System.out.println("");

        luasPersegiPanjang();
        luasLingkaran();
    }

}
