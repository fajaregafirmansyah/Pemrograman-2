package tugas6;

import java.util.Scanner;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class CircleActivity {

    Scanner input;
    
    Circle lingkaran1 = new Circle();
    Circle lingkaran2 = new Circle();
    String[] hasil;
    String[] hasil2;
    static int jarak_lingkaran;

    public CircleActivity() {
        this.input = new Scanner(System.in);
    }

    public void lingkaran1() {
        System.out.println("Masukan nilai dengan format (x,y,r) di lingkaran ke - 1 : ");

        hasil = input.next().split(",", 3);
        
        lingkaran1.setX(Integer.parseInt(hasil[0]));
        lingkaran1.setY(Integer.parseInt(hasil[1]));
        lingkaran1.setR(Integer.parseInt(hasil[2]));
    }

    public void lingkaran2() {
        System.out.println("Kemudian Masukan nilai dengan format (x,y,r) di lingkaran ke - 2 : ");

        hasil2 = input.next().split(",", 3);
        
        lingkaran2.setX(Integer.parseInt(hasil2[0]));
        lingkaran2.setY(Integer.parseInt(hasil2[1]));
        lingkaran2.setR(Integer.parseInt(hasil2[2]));
    }

    public void salah() {
        System.out.println("Yah, mohon maaf Kamu salah menginputkan lingkaran ke-1 seharusnya menggunakan tanda koma(,) contohnya 1,2,3");
        System.out.println("Silahkan ulangi lagi yaa...");
        System.out.println("");

        lingkaran1();
    }

    public void salah2() {
        System.out.println("Yah, mohon maaf Kamu salah menginputkan lingkaran ke-2 seharusnya menggunakan tanda koma(,) contohnya 1,2,3");
        System.out.println("Silahkan ulangi lagi yaa...");
        System.out.println("");

        lingkaran2();
    }

    public void hitung() {
        jarak_lingkaran = (int) Math.sqrt(Math.pow((lingkaran1.getX() - lingkaran2.getX()), 2) + Math.pow((lingkaran1.getY() - lingkaran2.getY()), 2));

        if (jarak_lingkaran >= (lingkaran1.getR() + lingkaran2.getR())) {
            System.out.println("");
            System.out.println("Hasilnya : ");
            System.out.println("C1 dan C2 Saling Lepas");
        } else if (jarak_lingkaran < (lingkaran1.getR() + lingkaran2.getR())) {
            if ((lingkaran1.getR() < lingkaran2.getR()) && (((lingkaran1.getX() + lingkaran1.getR() < lingkaran2.getX() + lingkaran2.getR()) && (lingkaran1.getX() - lingkaran1.getR() > lingkaran2.getX() - lingkaran2.getR()) && (lingkaran1.getY() + lingkaran1.getR() < lingkaran2.getY() + lingkaran2.getR()) && (lingkaran1.getY() - lingkaran1.getR() > lingkaran2.getY() - lingkaran2.getR())))) {
                System.out.println("");
                System.out.println("Hasilnya : ");
                System.out.println("C1 ada di dalam C2");
            } else if ((lingkaran1.getR() > lingkaran2.getR()) && (((lingkaran1.getX() + lingkaran1.getR() > lingkaran2.getX() + lingkaran2.getR()) && (lingkaran1.getX() - lingkaran1.getR() < lingkaran2.getX() - lingkaran2.getR()) && (lingkaran1.getY() + lingkaran1.getR() > lingkaran2.getY() + lingkaran2.getR()) && (lingkaran1.getY() - lingkaran1.getR() < lingkaran2.getY() - lingkaran2.getR())))) {
                System.out.println("");
                System.out.println("Hasilnya : ");
                System.out.println("C2 ada di dalam C1");
            } else {
                System.out.println("");
                System.out.println("Hasilnya : ");
                System.out.println("C1 dan C2 saling beririsan");
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========================================================");
        System.out.println("Selamat Datang Di Program Membandingkan 2 buah lingkaran");
        System.out.println("========================================================");

        CircleActivity C = new CircleActivity();

        //lingkaran 1
        try {
            C.lingkaran1();
        } catch (Exception e) {
            C.salah();
        }

        //lingkaran 2
        try {
            C.lingkaran2();
        } catch (Exception i) {
            C.salah2();
        }

        // logic dan hasil
        C.hitung();
    }

}
