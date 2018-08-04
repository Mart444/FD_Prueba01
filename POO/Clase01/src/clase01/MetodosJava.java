/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

/**
 *
 * @author Administrador
 */
public class MetodosJava {
    public static void main(String[] args) {
    ProcesarOperacion ("Luis",11,12,20);
    ProcesarOperacion ("Ana",20,18,15);
    
  
    }
    
static void ProcesarOperacion (String nombre, double n1, double n2, double n3){
    SaludarAlumno(nombre);
    CalcularPromedio(n1,n2,n3);
}
    
static void SaludarAlumno (String nombreAlumno){
    System.out.println("Hola " +nombreAlumno);
}    
static void CalcularPromedio (double n1, double n2,double n3){
    double promedio =(n1+n2+n3)/3;
    if(promedio >15)
        System.out.println("Felicitaciones");
    else
        System.out.println("Debe Estudiar");
}
}
