/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlescolar;

/**
 * Atributos de la clase personas
 * @version  1.0
 * @author Alondra Palma
 * @since Mayo 2021
 */
public class Personas {
/**
 * Atributos personas control escolar
 */
    private String Tipo;
    private String Nombre;
    private int Edad;
    private char Sexo;
    private String Curp;
    private String Actividad;

    public Personas() {
    }

    public Personas(String Tipo, String Nombre, int Edad, char Sexo, String Curp, String Actividad) {
        this.Tipo = Tipo;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Curp = Curp;
        this.Actividad = Actividad;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getCurp() {
        return Curp;
    }

    public void setCurp(String Curp) {
        this.Curp = Curp;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }
    
    public void Entrada (){
        System.out.println(Tipo + " Esta entrando...");
    }
    
    public void Actividades (){
        System.out.println(Tipo + " Esta realizando su actividad..." );
    }
    
    public void Receso (){
        System.out.println(Tipo + " Esta en receso");
    }
    
    public void Salida (){
        System.out.println(Tipo + " Esta de salida...");
    }

    @Override
    public String toString() {
        return "Personas{" + "Tipo=" + Tipo + ", Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Curp=" + Curp + ", Actividad=" + Actividad + '}';
    }

}
