/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2_uts;

/**
 *
 * @author Fajar Ega Firmansyah
 */
public class Bola extends BangunRuang{
    double radius;

    public Bola() {}

    public Bola(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 4 * 3.14f * radius * radius; 
    }

    @Override
    public double hitungVolume() {
        return 1.25f * 3.14f * radius * radius * radius; 
    }
    
}
