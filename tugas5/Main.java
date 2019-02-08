package tugas5;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==================================");
        System.out.println("Selamat Datang di Menu hitung luas");
        System.out.println("==================================");

        Circle c = new Circle(20, "Bola Basket");
        System.out.println("Nama benda  : " + c.getName());
        System.out.println("Radius      : " + c.getRadius());
        System.out.println("Luas        : " + c.getArea());

        System.out.println("");

        Rectangle r = new Rectangle("Papan Mahoni", 20, 18);
        System.out.println("Nama Benda  : " + r.getName());
        System.out.println("Panjang     : " + r.getLength());
        System.out.println("Lebar       : " + r.getWidth());
        System.out.println("Luas        : " + r.getArea());
    }

}
