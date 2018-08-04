/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;
import POO.Docente;
/**
 *
 * @author Administrador
 */
public class ReferenciasObjetos {
    public static void main(String[] args) {
        
    Docente objDocente1 = new Docente();    
    objDocente1.setNombre("Luis");
    objDocente1.setApellidos("Cordova");
    objDocente1.setDni("47585244");
    
    String nombreDocente = objDocente1.getNombre();
    
    }



}
