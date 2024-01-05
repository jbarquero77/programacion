/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarvocales;

import javax.swing.JOptionPane;

/**
 *
 * @author joseb
 */
public class ContarVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String texto=JOptionPane.showInputDialog(null, "Escribe una cadena", "Insercion", JOptionPane.INFORMATION_MESSAGE);
       texto=texto.toLowerCase();
       
       char vocales[]={'a', 'e', 'i', 'o', 'u'};
       
       char caracterActual;
       int contadorVocales=0;
       boolean esVocal;
       
       for (int i=0;i<texto.length();i++){
           
           caracterActual=texto.charAt(i);
           esVocal=false;
           
           for (int j=0;j<vocales.length && !esVocal;j++){
               if(vocales[j]==caracterActual){
                   contadorVocales++;
                   esVocal=true;
               }
           } 
         
       }
       
       JOptionPane.showMessageDialog(null,"La frase tiene +contadorVocales"+contadorVocales+" vocales", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
