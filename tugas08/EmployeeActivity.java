package tugas08;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class EmployeeActivity {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("============================================");
        System.out.println("Selamat Datang Di Program Info Gaji Karyawan");
        System.out.println("============================================");
        System.out.println("");

        Employee manajer = new Manajer(450000, "Hani Meidy Triyani", "Cimahi", 4000000);
        Employee staff1 = new Staff("Ristatae", "Padalarang", 3500000);
        Employee staff2 = new Staff("Setevani Hutagalung", "Batununggal", 3400000);

        System.out.println("Nama Manajer    : " + manajer.getName());
        System.out.println("Alamat Rumah    : " + manajer.getAddress());
        System.out.println("Gaji Manajer    : " + manajer.getSalary());
        System.out.println("");

        System.out.println("Nama Staff      : " + staff1.getName());
        System.out.println("Alamat Rumah    : " + staff1.getAddress());
        System.out.println("Gaji Staff      : " + staff1.getSalary());
        System.out.println("");

        System.out.println("Nama Staff      : " + staff2.getName());
        System.out.println("Alamat Rumah    : " + staff2.getAddress());
        System.out.println("Gaji Staff      : " + staff2.getSalary());
    }

}
