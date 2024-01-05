/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contarvocalesyconsonantesdefichero;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileReader;
/**
 *
 * @author joseb
 */
public class ContarVocalesYConsonantesDeFichero {
 
    public static void main(String[] args) {
        
        String ruta = JOptionPane.showInputDialog (null,"Inserta la ruta del fichero", "Insercion", JOptionPane.INFORMATION_MESSAGE);
        int contadorVocales =0;
        int contadorConsonantes =0;
        int contadorNumeros =0;
        
        try {FileReader fr=nw FileReader(ruta)){ 
            
        }catch (IOException e){
                System.out.println("Error");
                }
            System.out.println("Hay "+contadorVocales+" vocales");
            System.out.println("Hay "+contadorConsonantes+" consonantes");
            System.out.println("Hay "+contadorNumeros+ " números");
        
        
    }
}
