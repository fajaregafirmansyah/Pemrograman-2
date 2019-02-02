package tugas4;

public class EntryBukuAlamat {

    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    public EntryBukuAlamat() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printDetail() {
        System.out.println("Nama        : " + this.getNama());
        System.out.println("Alamat      : " + this.getAlamat());
        System.out.println("No. Telepon : " + this.getNomorTelepon());
        System.out.println("Email       : " + this.getEmail());
    }

    public void printRow() {
        System.out.println(this.getNama() + " \t\t " + this.getAlamat() + " \t\t " + this.getNomorTelepon() + " \t\t " + this.getEmail());
    }

}
