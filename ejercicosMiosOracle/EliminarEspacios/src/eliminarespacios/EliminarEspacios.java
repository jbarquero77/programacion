/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eliminarespacios;

import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class EliminarEspacios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog(null, "Escribe una cadena: ", "Insercion", JOptionPane.INFORMATION_MESSAGE);
        
        char caracterActual;
        String texto_sin_espacios="";
        for (int i=0;i<texto.length();i++){
            
            caracterActual=texto.charAt(i);
            
            if(caracterActual ==' '){
                texto_sin_espacios+=caracterActual;                
            }
            
        }
        //No consigo ver los resultados//
        
        
        JOptionPane.showMessageDialog(null,texto_sin_espacios,"Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
