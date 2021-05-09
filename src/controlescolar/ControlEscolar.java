/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlescolar;

/**
 * 
 * @author Alondra Palma
 */
public class ControlEscolar {
    public static void main(String[] args) {
        
        Personas Alumno = new Personas();
        Alumno.setTipo("Alumno");
        Alumno.setNombre("Angel");
        Alumno.setEdad(19);
        Alumno.setSexo('M');
        Alumno.setCurp("TUPA020818MCCLA9");
        Alumno.setActividad("Tarea");

        System.out.println(Alumno.toString());
        Alumno.Entrada();
        
        Personas Maestro = new Personas("Maestro","Jose",42,'M',"GARJ790325MCMPO4","Enseñar");
        System.out.println(Maestro.toString());
        Maestro.Actividades();
        
        Personas Intendencia = new Personas("Intendencia","Maria",49,'F',"SAGM700420WACUY3","Limpieza");
        System.out.println(Intendencia.toString());
        Intendencia.Salida();
        
        System.out.println("----------------------EDIFICIO--------------------");
        
        Edificio CampusI = new Edificio ();
        CampusI.setCampus("En campus I");
        CampusI.setArea("Enfermería");
        CampusI.setEnergía_elecric(true);
        CampusI.setMts2(500);
        System.out.println(CampusI.toString());
        
        Edificio CampusII = new Edificio ("En campus II","Preparatoria Dr. Nazario Victor Montejo Godoy",true,50);
        System.out.println(CampusII.toString());
        
        Edificio CampusIII = new Edificio ("En campus III","Medicina",true,80);
        System.out.println(CampusIII.toString());
        
        Edificio CampusIV = new Edificio ("En campus IV","Ciencias Agropecuarias",false,100);
        System.out.println(CampusIV.toString());
        
        Edificio CampusV = new Edificio ("En campus V","Ingeniería",true,90);
        System.out.println(CampusV.toString());

    }

}
