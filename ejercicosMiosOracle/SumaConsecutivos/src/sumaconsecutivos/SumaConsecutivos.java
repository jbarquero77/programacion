/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaconsecutivos;
import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class SumaConsecutivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sn=new Scanner (System.in);
       
       System.out.println("Inserta un número entero mayor que 1");
       int num;
              
       do{
           num=sn.nextInt();
       
           if(num<=1){
               System.out.println("El número introducido no es válido");
           }
       }while(!(num>=1));
       
       int suma=0;
       
       for(int contador=1;contador<=num;contador++){
           suma+=contador;
                     
       }
       
       System.out.println("La suma es: "+suma);
    }
    
}
