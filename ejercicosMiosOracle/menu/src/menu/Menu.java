/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       
       boolean salir = false;
       
       while(!salir){
           
           System.out.println("1.Optión 1");
           System.out.println("2.Optión 2");
           System.out.println("3.Optión 3");
           System.out.println("4.Optión 4");
           System.out.println("5.Optión 5");
           System.out.println("Salir");
           
           
           try {
               
               
           System.out.println("Introduce un número");
           
           opcion = sn.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("Esta es la opción 1");
                   break;
                   
               case 2:
                   System.out.println("Esta es la opción 2");
                   break;
                   
               case 3:
                   System.out.println("Esta es la opción 3");
                   break;
               case 4:
                   System.out.println("Esta es la opción 4");
                   break;
               case 5:
                   System.out.println("Esta es la opción 5");
                   break;
               case 6:
                   salir = true;
                   break;
               default:
                   System.out.println("Las opciones son entre 1 y 7");
               
               
           }catch InputMismatch
           }
   
       System.out.println("Fin del menu");
    }
    
 
    }
}
