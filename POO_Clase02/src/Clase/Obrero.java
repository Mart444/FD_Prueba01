/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Administrador
 */
public class Obrero extends Empleado {
    
    public Obrero(){
        
    }
    public void Trabajar(String rutina1){
        System.out.println(rutina1);
    }
    public void Trabajar(String rutina1, String rutina2){
        System.out.println(rutina1 + " - " + rutina2);
    }

    public void Trabajar(String rutina1, String rutina2, String rutina3){
        System.out.println(rutina1 + " - " + rutina2 + " - " + rutina3);
    }
    
    @Override
    public double getSalario() {
       // return super.getSalario(); //To change body of generated methods, choose Tools | Templates.
       return 2000;
    }

    
public void Operaciones(){
    System.out.println("Obreros Trabajando");
}    
      
}
