/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package del1_100divisibles2_3;

/**
 *
 * @author joseb
 */
public class Del1_100Divisibles2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int contador=1;contador<=100;contador++){
            if(contador%2==0 && contador%3==0){
                System.out.println(contador);
            }
            
        }
    }
    
}
