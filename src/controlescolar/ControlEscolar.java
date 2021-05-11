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
        System.out.println("----------------------PERSONAS--------------------");
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
        CampusI.setArea("Laboratorio");
        CampusI.setEnergía_elecric(true);
        CampusI.setMts2(500);
        System.out.println(CampusI.toString());
        CampusI.condiciones();
        
        Edificio CampusII = new Edificio ("campus II","salones",true,50);
        System.out.println(CampusII.toString());
        CampusII.capacidad();
        
        Edificio CampusIII = new Edificio ("campus III","biblioteca",true,80);
        System.out.println(CampusIII.toString());
        CampusIII.estado();
        
        Edificio CampusIV = new Edificio ("campus IV","Cancha",false,100);
        System.out.println(CampusIV.toString());
        CampusIV.capacidad();
        
        Edificio CampusV = new Edificio ("campus V","Computo",true,90);
        System.out.println(CampusV.toString());
        CampusV.condiciones();

    }

}
