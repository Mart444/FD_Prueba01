/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Administrador
 */
public class NombreNotas {

    public static void main(String[] args) {
    String[] alumno ={"Martin","Krisnan","Anthony","Victor","Angello","Omar"};
    double[] nota ={15,13,9,16,7,20};
    String nota1 ="Necesita Apoyo";
    String nota2 ="Esta Mejorando";
    String nota3 ="Muy Bien";
    
        for (int i = 0; i <alumno.length; i++) {
            
        if(nota[i]<10){
        System.out.println("El alumno "+alumno[i]+" tiene " +nota[i]);  
            System.out.println("--->"+nota1);
        }    else if(nota[i]>=10 & nota[i]<=15){
        System.out.println("El alumno "+alumno[i]+" tiene " +nota[i]);  
            System.out.println("--->"+nota2);    
        } else if(nota[i]>15){
        System.out.println("El alumno "+alumno[i]+" tiene " +nota[i]);  
            System.out.println("--->"+nota3);    
        }
        
    
        }
    }
    
}
