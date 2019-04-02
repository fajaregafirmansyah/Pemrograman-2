package soal2_uts;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class Kerucut extends BangunRuang {

    double radius;
    double tinggi;

    public Kerucut() {}

    public Kerucut(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = 3.14f * radius * radius;
        double luasSelimut = 3.14f * radius * pitagor(radius, tinggi);
        return luasAlas + luasSelimut;
    }

    @Override
    public double hitungVolume() {
        double luasAlas = 3.14f * radius * radius;
        return luasAlas * tinggi / 3;
    }
    
    private static double pitagor (double x , double y){
        double c = Math.sqrt((x*x)+(y*y));
        return c;
    }

}
