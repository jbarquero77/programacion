/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularnumerosintroducidos;
import java.util.Scanner;
/**
 *
 * @author joseb
 */
public class CalcularNumerosIntroducidos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sn=new Scanner(System.in);
        int num = sn.nextInt();
        
        int contador = 0;
        
        while(num!=-1){
            contador++;
            
            num=sn.nextInt();
            
        }
        
        System.out.println("Fin, se han introducido "+contador+" números");
    }
    
}
