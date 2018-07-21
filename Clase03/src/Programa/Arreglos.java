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
public class Arreglos {
    public static void main(String[] args){
        //definir arreglos en 2 lineas
        String[] apellidos;
        apellidos = new String[5];
        
        //Definir arreglos en 1 linea
        String[] nombres = new String[5];
        
        //Asinar valores a los arreglos
        apellidos[0] = "Cordova";
        apellidos[1] = "Ramirez";
        apellidos[2] = "Leon";
        apellidos[3] = "Sanchez";
        apellidos[4] = "AG un Perez";
        String[] departamentos = {"Lima","Piura","Tacna","Puno","Cuzco","Loreto"};
        
        System.out.println("Tamaño del arreglo departamentos: "+ departamentos.length);
        System.out.println("Tamaño del arreglo apellidos: " + apellidos.length);
        System.out.println("Tamaño del arreglo nombres: " +apellidos.length);
        
        departamentos[0]="Arequipa"; //Modificando Lima por Arequipa
        //Recorrer arreglos valor por valor
        for(int i = 0; i<departamentos.length; i++){
        System.out.println("El valor en la posición " +i + " => " +departamentos[i]); 
        }
        
        
        //Numero Mayor
        double[] nota ={13,14,19,16,17};
        double notaMayor=0;
        
        for(int i=0;i<nota.length;i++){
            if (nota[i]>notaMayor) {
              notaMayor=nota[i];  
                
            }
    
        }
        System.out.println("El numero mayor es : " +notaMayor);
        
    } 
    
}
