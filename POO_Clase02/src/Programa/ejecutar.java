/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;
import Clase.Director;
import Clase.Obrero;
import java.util.Set;
/**
 *
 * @author Administrador
 */
public class ejecutar {
    public static void main(String[] args) {
    Director directorTI = new Director("Luis","Gomez");
    //directorTI.setNombre("Luis");
    //directorTI.setApellido("Gomez");
    directorTI.setProfesion("Ing. Sistemas");
    directorTI.setTipoDocumento("DNI");
    directorTI.setNumeroDocumento("12345678");
    directorTI.Presentarse();
    
    
    Obrero ObreroConstrucion = new Obrero();
    ObreroConstrucion.setNombre("Jorge");
    ObreroConstrucion.setApellido("Chavez");
    ObreroConstrucion.Presentarse();
    ObreroConstrucion.Operaciones();    
    ObreroConstrucion.Trabajar("Limpiar","planchar","cocinar");
    }
    
}
