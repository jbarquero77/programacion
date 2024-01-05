/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vocalesenfrase;
import javax.swing.JOptionPane;
/**
 *
 * @author joseb
 */
public class VocalesEnFrase {

    public static void main(String[] args) {
       
        String texto=JOptionPane.showInputDialog(null,"Inserta una frase", "Inserción",JOptionPane.INFORMATION_MESSAGE);
        
        int vocales= cuentaVocales(texto.toLowerCase());
        
        System.out.println("Hay "+vocales+" vocales");
              
    }
    
    public static int cuentaVocales(String frase){
        
        int contador=0;
        char vocales[]={'a','e','i','o','u'};
        char caracterActual;
        boolean esVocal;
        
        for (int i=0;i<frase.length();i++){
            caracterActual=frase.charAt(i);
            
            esVocal=false;
            
            for (int j=0;j<vocales.length && !esVocal;j++){
                if (caracterActual==vocales[j]){
                    esVocal=true;
                }
            }
            if (esVocal){
                contador++;
            }
    }
    return contador;
    }
}
