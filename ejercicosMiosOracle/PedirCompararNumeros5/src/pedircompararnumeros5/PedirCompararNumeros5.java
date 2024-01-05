/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedircompararnumeros5;
import java.util.Scanner;

/**
 *
 * @author joseb
 */
public class PedirCompararNumeros5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        
        System.out.println ("Introduzca el primer número");
        int num1=sn.nextInt();
        
        System.out.println ("Introduzca el segundo número");
        int num2=sn.nextInt();
                
        if (num1<=num2){
            if(num1==num2){
                System.out.println("Son iguales");
            }else{
                System.out.println("El número 2, "+num2+" es el mayor");
            }
         }else{
            System.out.println("El número 1,"+num1+" es el mayor");
         }
        }
    
}
