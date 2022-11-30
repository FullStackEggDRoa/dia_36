/*
    EJERCICIO 13:

    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
    cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    * * * *
    *     *
    *     *
    * * * *

 */
package ejercicios_13;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicios_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la longitud N del Cuadrado:");
        int elementos= leer.nextInt();
        
        for(int i=0;i<elementos;i++){
            for(int j=0;j<elementos;j++){
                if(i==0 || i==elementos-1){
                    System.out.print("*");
                }else{
                    if(j==0 || j==elementos-1){
                       System.out.print("*"); 
                    }else{
                        System.out.print(" ");
                    }
                }
                
            }
            System.out.println(" ");
            
        }
    }
    
}
