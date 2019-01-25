package tugas1;

import java.util.Scanner;

public class HitungLuas {

    public static void luasPersegiPanjang() {
        int panjang;
        int lebar;
        int luas;
        Scanner masukkan = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("Program menghitung luas persegi panjang dan lingkaran");
        System.out.println("=====================================================");
        System.out.println("");

        System.out.print("Masukan panjang(cm) : ");
        panjang = masukkan.nextInt();

        System.out.print("Masukan Lebar(cm)   : ");
        lebar = masukkan.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas dari persegi panjang dari panjang " + panjang + " cm dan lebar " + lebar + " cm adalah " + luas);
    }

    public static void main(String[] args) {
        luasPersegiPanjang();
    }

}
