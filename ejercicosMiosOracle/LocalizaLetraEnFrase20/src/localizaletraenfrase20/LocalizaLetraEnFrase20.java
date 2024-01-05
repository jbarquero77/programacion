/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package localizaletraenfrase20;

import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class LocalizaLetraEnFrase20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        
        System.out.println("Escribe una frase");
        String frase=sn.next();
        
        int pos = frase.indexOf('a');
        
        System.out.println(pos);
        
        pos = frase.indexOf('a', pos+1);  
        
        System.out.println(pos);        
    }
    
}
