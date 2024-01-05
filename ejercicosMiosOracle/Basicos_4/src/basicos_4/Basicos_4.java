/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basicos_4;
import java.util.Scanner;



/**
 *
 * @author joseb
 */
public class Basicos_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner (System.in);
        
        System.out.println("Introduzca un número");
        int num=sn.nextInt();
        
        if(num%2==0){
            System.out.println("El número "+num+" es par");
          }else{
            System.out.println("El número "+num+" es impar");
        }
        
    }
    
}
