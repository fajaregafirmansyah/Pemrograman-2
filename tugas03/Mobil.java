package tugas03;

public class Mobil {

    boolean cek;
    int kecepatanActual;
    int kecepatanMaksimum;
    int percepatan;
    int Gigi;

    public Mobil(boolean cek, int kecepatanActual, int kecepatanMaksimum, int percepatan, int Gigi) {
        this.cek = cek;
        this.kecepatanActual = kecepatanActual;
        this.kecepatanMaksimum = kecepatanMaksimum;
        this.percepatan = percepatan;
        this.Gigi = Gigi;
    }

    public boolean isCek() {
        return cek;
    }

    public void setCek(boolean cek) {
        this.cek = cek;
    }

    public int getKecepatanActual() {
        return kecepatanActual;
    }

    public void setKecepatanActual(int kecepatanActual) {
        this.kecepatanActual = kecepatanActual;
    }

    public int getKecepatanMaksimum() {
        return kecepatanMaksimum;
    }

    public void setKecepatanMaksimum(int kecepatanMaksimum) {
        this.kecepatanMaksimum = kecepatanMaksimum;
    }

    public int getPercepatan() {
        return percepatan;
    }

    public void setPercepatan(int percepatan) {
        this.percepatan = percepatan;
    }

    public int getGigi() {
        return Gigi;
    }

    public void setGigi(int Gigi) {
        this.Gigi = Gigi;
    }

    public void start() {
        if (!this.isCek()) {
            this.cek = true;
            System.out.println("\nMobil Alphard sudah dinyalakan.");
        } else {
            this.cek = true;
            System.out.println("\nMobil Alphard sudah dalam kondisi menyala.");
        }
    }

    public void stop() {
        if (this.isCek() && this.getKecepatanActual() == 0) {
            this.cek = false;
            System.out.println("\nMobil Alphard sudah dalam kondisi mati.");
        } else if (this.isCek() && this.getKecepatanActual() != 0) {
            System.out.println("\nSilahkan berhenti terlebih dahulu yaa mobilnya..");
        } else {
            System.out.println("\nSilahkan starter terlebih dahulu");
        }
    }

    public void rem() {
        this.setKecepatanActual(this.getKecepatanActual() / 2);
        System.out.println("\nKecepatan mobil Alphard saat ini : " + this.getKecepatanActual() + " Km/jam");
    }

    public void gantiGigi(int Gigi) {
        this.Gigi = Gigi;
        switch (Gigi) {
            case 0:
                this.percepatan = 0;
                break;
            case 1:
                this.percepatan = 10;
                break;
            case 2:
                this.percepatan = 20;
                break;
            case 3:
                this.percepatan = 30;
                break;
            case 4:
                this.percepatan = 40;
                break;
            case 5:
                this.percepatan = 50;
                break;
        }

        System.out.println("Posisi Gigi mobil Alphard : " + this.getGigi());
        System.out.println("\nPercepatan Mobil Alphard : " + this.getPercepatan() + " Km/jam^2");
    }

    public void gas() {
        if (this.getKecepatanActual() < this.getKecepatanMaksimum()) {
            if (this.getKecepatanMaksimum() < this.getKecepatanActual() + this.getPercepatan()) {
                this.setKecepatanActual(this.getKecepatanMaksimum());
            } else {
                this.setKecepatanActual(this.getKecepatanActual() + this.getPercepatan());
            }
        } else {
            System.out.println("\nMobil Alphard kecepatannya udah maksimum. Hati-hati yaa dalam mengemudi");
        }
        System.out.println("\nKecepatan mobil Alphard saat ini : " + this.getKecepatanActual() + " Km/jam");
    }
}
