/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fraseinfinita13;

import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class FraseInfinita13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto =JOptionPane.showInputDialog(null, "Introduce un texto, cadena vacía para terminar", "Introducir texto", JOptionPane.INFORMATION_MESSAGE);
        
        String cadenaResultante="";
        
        while(!texto.isEmpty()){
            cadenaResultante+=texto;
            
            texto=JOptionPane.showInputDialog(null, "", "", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        JOptionPane.showMessageDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
}
