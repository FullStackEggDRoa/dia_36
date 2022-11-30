/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int sumatoria=0;
        int limite=0;
        
        do{
            System.out.print("Ingrese un número Límite: ");
            limite = leer.nextInt();
            
        }while(limite<0);
        
        do{
            System.out.println("Ingrese un número:");
            int num=leer.nextInt();
            sumatoria=sumatoria+num;
        }while(sumatoria<=limite);
        
        System.out.println("La Sumatoria de los números es: "+sumatoria);
        
    }
    
}
