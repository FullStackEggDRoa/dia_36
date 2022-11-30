/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios_11;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicios_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int sumatoria=0;
        int num1 = 0;
        int num2 = 0;
        int opcion = 0;
        boolean menu = true;
        
        do{
            System.out.print("Ingrese el número 1: ");
            num1 = leer.nextInt();
            
        }while(num1<0);
        
        do{
            System.out.print("Ingrese el número 2: ");
            num2 = leer.nextInt();
            
        }while(num2<0);
        
        do{
            System.out.println(".::: MENU :::...");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    sumarEnteros(num1,num2);
                break;
                case 2:
                    restarEnteros(num1,num2);
                break;
                case 3:
                    multiplicarEnteros(num1,num2);
                break;
                case 4:
                    dividirEnteros(num1,num2);
                break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N):");
                    char respuesta = leer.next().charAt(0);
                    if(respuesta == 'S'){
                        menu=false;
                    }else{
                        menu=true;
                    }
                break;
                default:
            
            }
        }while( opcion < 5 || opcion > 0 && menu);
        
        
    }
    public static void sumarEnteros(int n1,int n2){
        System.out.println("La suma de los números ingresados es: "+(n1+n2));
    }
    public static void restarEnteros(int n1,int n2){
        System.out.println("La resta de los números ingresados es: "+(n1-n2));

    }
    public static void multiplicarEnteros(int n1,int n2){
        System.out.println("La multiplicación de los números ingresados es: "+(n1*n2));

    }
    public static void dividirEnteros(int n1,int n2){
        System.out.println("La división de los números ingresados es: "+(n1/n2));
        
    }
}
