/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicos_3;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class Basicos_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sn = new Scanner (System.in);
     
     System.out.print ("Introduzca un número");
     int num= sn.nextInt();
     
     char caracter = (char) num;
     
     System.out.println("El número "+num+"corresponde al caracter ' "+caracter+"'");
     
    }

    private static Scanner Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
