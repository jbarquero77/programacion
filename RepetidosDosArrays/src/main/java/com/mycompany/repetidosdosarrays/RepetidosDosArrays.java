/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repetidosdosarrays;

/**
 *
 * @author joseb
 */
public class RepetidosDosArrays {

    public static void main(String[] args) {
        
        int[]a1={1,2,4};
        int[]a2={4,5,7};
        System.out.println(elementoRepetido(a1,a2));
        
    }
    
     public static boolean elementoRepetido(int[] array1, int[]array2){
        
        for (int i=0;i<array1.length;i++){
        
            for (int j=0; j<array2.length;j++){
                if (array1[i] == array2 [j]){
                    return true;
                }
            }
        }
        return false;
            
    }
}
