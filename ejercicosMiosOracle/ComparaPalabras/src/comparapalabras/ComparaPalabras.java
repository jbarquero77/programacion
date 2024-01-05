/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparapalabras;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class ComparaPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("Escribe la primera palabra");
        String palabra1 = sn.next();
        
        System.out.println("Escribe la segunda palabra");
        String palabra2 = sn.next();
        
        if(palabra1.equals(palabra2)){
            System.out.print("Las palabras son iguales");
                        
        }else{
            System.out.println("Las palabras no son iguales");
            
            
        }
    }
    
}
