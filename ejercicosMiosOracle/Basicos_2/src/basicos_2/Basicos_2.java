/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicos_2;

/**
 *
 * @author joseb
 */
public class Basicos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;      
        int b = 2;
        
        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        double division = (double)a/b;
        int resto = a%b;
        
        System.out.println ("La suma de a y b es "+ suma);
        System.out.println ("La resta de a y b es "+ resta);
        System.out.println ("La multiplicación de a y b es "+ multiplicacion);
        System.out.println ("La division de a y b es "+ division);
        System.out.println ("El resto de a y b es "+ resto);
    }
    
}
