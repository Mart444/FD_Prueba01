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
public class FuncionesJava {
    public static void main(String[] args) {
   
    ProcesarOperaciones("Luis",12,10,14);
    ProcesarOperaciones("Ana",15,18,14);        
    }
    static String SaludarAlumno (String NombreAlumno){
        String mensaje ="Hola " + NombreAlumno;
        return mensaje;
    }   
    static double CalcularPromedio(double n1, double n2, double n3){
        double promedio =(n1+n2+n3)/3;
        return promedio;
        
    }
    static String MensajeFinal(double promedio){
        String mensaje;
        if(promedio>15)
            mensaje ="Felicidades";
        else
            mensaje="Debe estudiar";
        return mensaje;
    }
    static void ProcesarOperaciones(String nombre,double n1,double n2, double n3){
        String saludo = "";
        double promedio = 0;
        String mensaje ="";
        saludo=SaludarAlumno (nombre);
        promedio=CalcularPromedio (n1,n2,n3);
        mensaje= MensajeFinal(promedio);
        System.out.println(saludo+" "+mensaje);
    }
}
