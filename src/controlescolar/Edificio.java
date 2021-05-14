/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlescolar;

/**
 * Atributos de la clase edificios
 * @version  1.0
 * @author Alondra Palma
 * @since Mayo 2021
 */
public class Edificio {
    private String Campus;
    private String Area;
    private boolean Energía_elecric;
    private double Mts2;

    public Edificio() {
    }

    public Edificio(String Campus, String Area, boolean Energía_elecric, double Mts2) {
        this.Campus = Campus;
        this.Area = Area;
        this.Energía_elecric = Energía_elecric;
        this.Mts2 = Mts2;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public boolean isEnergía_elecric() {
        return Energía_elecric;
    }

    public void setEnergía_elecric(boolean Energía_elecric) {
        this.Energía_elecric = Energía_elecric;
    }

    public double getMts2() {
        return Mts2;
    }

    public void setMts2(double Mts2) {
        this.Mts2 = Mts2;
    }
    
    public void estado (){
        System.out.println("El edificio se encuentra ocupado");
    }
    
    public void condiciones (){
        System.out.println("El edificio se encuentra en remodelación");
    }
    
    public void capacidad (){
        System.out.println("El edificio tiene una capacidad de 30 personas por salón");
    }

    @Override
    public String toString() {
        return "Edificio{" + "Campus=" + Campus + ", Area=" + Area + ", Energ\u00eda_elecric=" + Energía_elecric + ", Mts2=" + Mts2 + '}';
    }

}
            