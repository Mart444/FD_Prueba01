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
public class Clase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaludaVersionMetodo();
        
        
        String cadena =saludo("Luis");
        System.out.println(cadena);
        
        String[] nombres = {"Luis","Jose","Maria","Pedro"};
        
        for(int i=0;i<nombres.length;i++){
        String nombre =nombres[i];
            System.out.println(saludo(nombres[i]));
        }
        
        
        
    }
    //Función
    static String saludo(String nombre){
    String saludo = "Hola "+nombre+" como estas";
    return saludo;
            }
    //Método
    static void SaludaVersionMetodo(){
        System.out.println("Hola, como estas (Metodo)");
    }
}
