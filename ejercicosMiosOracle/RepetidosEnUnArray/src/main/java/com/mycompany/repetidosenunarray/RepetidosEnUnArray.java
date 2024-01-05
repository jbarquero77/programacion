/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repetidosenunarray;

/**
 *
 * @author joseb
 */
public class RepetidosEnUnArray {

    public static void main(String[] args) {
       int[]a={1,2,3,9,4,5,6,7,8,9};
        System.out.println(elementoRepetido(a));
        
    }
    
    public static boolean elementoRepetido(int[] array){
        
        for (int i=0;i<array.length;i++){
        
            for (int j=i+1; j<array.length;j++){
                if (array[i] == array [j]){
                    return true;
                }
            }
        }
        return false;
            
    }
}
