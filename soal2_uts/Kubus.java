package soal2_uts;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class Kubus extends BangunRuang {
    
    double a;

    public Kubus() {}
    
    public Kubus(double a) {
        this.a = a;
    }
    
    public void setSisi(double a){
        this.a = a;
    }
    
    @Override
    public double hitungLuasPermukaan() {
         return a * a * 6;
    }

    @Override
    public double hitungVolume() {
        return a * a * a;
    }

}
