/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escribiryleerarchivotexto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Enunciado:

1. Escribir en un fichero "Hola mundo".

2. Leer el anterior fichero, mostrando su contenido por pantalla.
 * @author joseb
 */
public class EscribirYLeerArchivoTexto {

    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("C:\\Users\\joseb\\OneDrive\\Escritorio\\ejercicios java\\holamundo.txt");
            
            fw.write("Hola Mundo");
            
            fw.close();
        
        } catch (IOException ex) {
            Logger.getLogger(EscribirYLeerArchivoTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
