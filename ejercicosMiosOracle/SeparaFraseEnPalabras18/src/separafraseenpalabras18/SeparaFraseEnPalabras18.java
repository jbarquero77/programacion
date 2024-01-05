/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package separafraseenpalabras18;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class SeparaFraseEnPalabras18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        
        System.out.println("Escribe una frase");
        String frase=sn.next();
        
        String palabras[] = frase.split(" ");
        
        for (int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
    }
    
}
