/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demayusculasaminusculas;

import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class DeMayusculasAMinusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String texto=JOptionPane.showInputDialog(null,
               "Introduce tu frase",
               "Inicio",
               JOptionPane.INFORMATION_MESSAGE);
       
       String cadenaResultante="";
       
       //true = es MAYUS, false= es minus
       boolean esMayus;
             
       String[] opciones={"Mayúsculas","Minúsculas"};
       int eleccion=JOptionPane.showOptionDialog(null, 
               "Elige tu opción", 
               "Elección", 
               JOptionPane.YES_NO_OPTION, 
               JOptionPane.QUESTION_MESSAGE, 
               null,
               opciones,
               opciones[0]);
               
       esMayus=eleccion==JOptionPane.YES_OPTION;
       
       for(int i=0;i<texto.length();i++){
        
        if (esMayus){
             cadenaResultante=texto.toUpperCase();
        }else{
            cadenaResultante=texto.toLowerCase();
        }
          
       }
         JOptionPane.showMessageDialog(null,
            cadenaResultante,
            "Resultado",
            JOptionPane.INFORMATION_MESSAGE);
       }
}
