/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambialetras;

import java.util.Scanner;
/**
 *
 * @author joseb
 */
public class CambiaLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        
        System.out.println("Escribe una frase");
        String frase=sn.next();
        
        frase=frase.replace('a','e');
        frase=frase.replace('i','o');
        
        System.out.println(frase);
    }
    
}
