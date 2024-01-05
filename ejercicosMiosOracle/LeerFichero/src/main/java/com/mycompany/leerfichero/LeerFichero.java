/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.leerfichero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author joseb
 */
public class LeerFichero {

    public static void main(String[] args) {
        
        String contenido="";
        int c;
        
        try {
            //Creamos el objeto y le pasamos el fichero a leer
            FileReader fr=new FileReader("C:\\Users\\joseb\\OneDrive\\Escritorio\\ejercicios java\\holamundo.txt");
        
            //Leemos el fichero
            while((c=fr.read())!=-1){
                contenido+=(char)c;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Mostramos el contenido
        System.out.println("El contenido del fichero es: "+contenido);
        
        
        
    }
}
