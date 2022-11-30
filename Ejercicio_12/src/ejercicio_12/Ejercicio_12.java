/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_12;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String dato="";
        String cadena="";
        String mensaje="";
        int cadenas_correctas=0;
        int cadenas_incorrectas=0;
        
        
        // Valida la extensión de la Cadena
        do{
            do{
                System.out.println("Ingrese una cadena (5 Caracteres):");
                cadena = leer.nextLine();

            }while(cadena.length() > 5 || cadena.length() < 0 );
            
            //dsempaqueta la cadea RS_232
            
            if(cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("O")){
                dato = cadena.substring(1,4);
                mensaje=mensaje+dato;
                cadenas_correctas++;
            }else{
                cadenas_incorrectas++;
            }
            
            
            
        }while(!cadena.equals("&&&&&")); // Valida el FDE
        
        // Validación antinegativos
        if(cadenas_incorrectas!=0){
            cadenas_incorrectas--;
        }
      
        
        System.out.println("Recepción Finalizada con Exito!!");
        System.out.println(" ");
        System.out.println("Cadenas recibidas correctamente: "+cadenas_correctas);
        System.out.println("Cadenas recibidas incorrectamente: "+cadenas_incorrectas--);
        System.out.println(" ");
        System.out.println("Mensaje Recibido: "+mensaje);
        
     }
    
}
